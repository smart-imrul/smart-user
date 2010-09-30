/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smartitengineering.user.ws.resources;

import com.smartitengineering.user.domain.Organization;
import com.smartitengineering.user.domain.Role;
import com.smartitengineering.user.domain.UserGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import org.apache.abdera.model.Entry;
import org.apache.abdera.model.Feed;
import org.apache.abdera.model.Link;

/**
 *
 * @author uzzal
 */
@Path("/orgs/sn/{organizationName}/usergroups/name/{groupName}/roles")
public class UserGroupRolesResource extends AbstractResource{
  private String organizationName;
  private String groupName;
  private Organization organization;
  private UserGroup userGroup;
  static final UriBuilder ROLE_URI_BUILDER;
  static final UriBuilder ROLE_AFTER_ROLE_NAME_URI_BUILDER;
  static final UriBuilder ROLE_BEFORE_ROLE_NAME_URI_BUILDER;
  @QueryParam("count")
  private Integer count;

  static {
    ROLE_URI_BUILDER = UriBuilder.fromResource(RoleResource.class);

    ROLE_AFTER_ROLE_NAME_URI_BUILDER = UriBuilder.fromResource(RolesResource.class);
    try {
      ROLE_AFTER_ROLE_NAME_URI_BUILDER.path(RolesResource.class.getMethod("getAfter", String.class));
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }

    ROLE_BEFORE_ROLE_NAME_URI_BUILDER = UriBuilder.fromResource(RolesResource.class);
    try {
      ROLE_BEFORE_ROLE_NAME_URI_BUILDER.path(RolesResource.class.getMethod("getBefore", String.class));
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public UserGroupRolesResource(@PathParam("organizationName") String organizationName,
                           @PathParam("groupName") String groupName) {
    this.organizationName = organizationName;
    this.groupName = groupName;
    userGroup = Services.getInstance().getUserGroupService().getByOrganizationAndUserGroupName(organizationName, groupName);
    organization = Services.getInstance().getOrganizationService().getOrganizationByUniqueShortName(organizationName);
  }

  @GET
  @Produces(MediaType.APPLICATION_ATOM_XML)
  @Path("/after/{roleName}")
  public Response getAfter(@PathParam("roleName") String roleName) {
    return get(roleName, false);
  }

  @GET
  @Produces(MediaType.APPLICATION_ATOM_XML)
  @Path("/before/{roleName}")
  public Response getBefore(@PathParam("roleName") String roleName) {
    return get(roleName, true);
  }

  @GET
  @Produces(MediaType.APPLICATION_ATOM_XML)
  public Response get() {
    return get(null, true);
  }

  public Response get(String roleName, boolean isBefore) {
    if (count == null) {
      count = 10;
    }
    if(organization==null || userGroup==null){
      ResponseBuilder responseBuilder = Response.status(Status.NOT_FOUND);
      return responseBuilder.build();
    }

    ResponseBuilder responseBuilder = Response.status(Status.OK);
    Feed atomFeed = getFeed("roles", new Date());
    Link rolesLink = abderaFactory.newLink();

    rolesLink.setHref(UriBuilder.fromResource(RootResource.class).build().toString());
    rolesLink.setRel("parent");
    atomFeed.addLink(rolesLink);

    Collection<Role> roles = userGroup.getRoles();
    if (roles != null && !roles.isEmpty()) {

      // uri builder for next and previous uri according to the count value
      UriBuilder nextRoleUri = ROLE_AFTER_ROLE_NAME_URI_BUILDER.clone();
      UriBuilder previousRoleUri = ROLE_BEFORE_ROLE_NAME_URI_BUILDER.clone();

      List<Role> roleList = new ArrayList<Role>();

      // link to the next uri according to the count value
      Link nextLink = abderaFactory.newLink();
      nextLink.setRel(Link.REL_NEXT);

      Role firstRole = roleList.get(0);
      nextLink.setHref(nextRoleUri.build(organizationName, groupName, firstRole.getName()).toString());
      atomFeed.addLink(nextLink);

      Role lastRole = roleList.get(roleList.size() - 1);

      // link to the previous uri according to the count value
      Link previousLink = abderaFactory.newLink();
      previousLink.setRel(Link.REL_PREVIOUS);
      previousLink.setHref(previousRoleUri.build(organizationName, groupName, lastRole.getName()).toString());

      atomFeed.addLink(previousLink);

      for (Role role : roles) {
        Entry roleEntry = abderaFactory.newEntry();

        roleEntry.setId(role.getName());
        roleEntry.setTitle(role.getDisplayName());
        roleEntry.setSummary(role.getShortDescription());
        roleEntry.setUpdated(role.getLastModifiedDate());

        // setting link to each individual role
        Link roleLink = abderaFactory.newLink();
        roleLink.setRel(Link.REL_ALTERNATE);
        roleLink.setHref(RolesResource.ROLE_URI_BUILDER.build(role.getName()).toString());
        roleLink.setMimeType(MediaType.APPLICATION_ATOM_XML);
        roleEntry.addLink(roleLink);
        atomFeed.addEntry(roleEntry);
      }

    }
    responseBuilder.entity(atomFeed);
    return responseBuilder.build();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response post(Role role) {
    ResponseBuilder responseBuilder;
     if(organization==null || userGroup==null){
      responseBuilder = Response.status(Status.NOT_FOUND);
      return responseBuilder.build();
    }

    try {
      if (role.getId() == null || role.getVersion() == null) {
        responseBuilder = Response.status(Status.BAD_REQUEST);
      }
      else {
        userGroup.getRoles().add(role);
        Services.getInstance().getUserGroupService().update(userGroup);
        responseBuilder = Response.status(Status.CREATED);
        responseBuilder.location(uriInfo.getBaseUriBuilder().path(UserGroupRoleResource.ROLE_URI_BUILDER.clone().build(organizationName, groupName, role.getName()).toString()).
              build());
      }
    }
    catch (Exception ex) {
      ex.printStackTrace();
      responseBuilder = Response.status(Status.BAD_REQUEST);
    }
    return responseBuilder.build();
  }

}
