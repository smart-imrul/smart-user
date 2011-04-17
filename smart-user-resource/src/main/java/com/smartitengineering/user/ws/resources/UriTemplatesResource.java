/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.ws.resources;

import com.smartitengineering.util.opensearch.api.OpenSearchDescriptor;
import com.smartitengineering.util.opensearch.impl.OpenSearchDescriptorBuilder;
import com.smartitengineering.util.opensearch.impl.UrlBuilder;
import com.smartitengineering.util.opensearch.jaxrs.MediaType;
import com.smartitengineering.util.rest.server.AbstractResource;
import com.smartitengineering.util.rest.server.ServerResourceInjectables;
import java.net.URI;
import java.net.URLDecoder;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author imyousuf
 */
public class UriTemplatesResource extends AbstractResource {

  protected final transient Logger logger = LoggerFactory.getLogger(getClass());
  private static String orgResourceUriTemplate;
  private static String roleResourceUriTemplate;
  private static String userResourceUriTemplate;
  private static String privilegeResourceUriTemplate;
  private static String securedObjectResourceUriTemplate;
  private static String userGroupResourceUriTemplate;
 
  private static OpenSearchDescriptor descriptor;
  private final static String REL_ORG = "org";
  private final static String REL_ROLE = "role";
  private final static String REL_USER = "user";
  private final static String REL_PRIVILEGE = "privilege";
  private final static String REL_SECURED_OBJECT = "securedObject";
  private final static String REL_USER_GROUP = "userGroup";
 

  static {
  }

  public UriTemplatesResource(ServerResourceInjectables injectables) {
    super(injectables);
  }

  @GET
  @Produces(MediaType.APPLICATION_OPENSEARCHDESCRIPTION_XML)
  public Response getSpec() {
    if (descriptor == null) {
      synchronized (this) {
        if (descriptor == null) {
          OpenSearchDescriptorBuilder descBuilder = OpenSearchDescriptorBuilder.getBuilder();
          descBuilder.shortName("UrlTemplates");
          descBuilder.description("Search for common entities");
          String templateBuilder = getOrgUri();
          final String orgUrlTemplate = templateBuilder.toString();
          if (logger.isInfoEnabled()) {
            logger.info("Organization Template URL: " + orgUrlTemplate);
          }
          UrlBuilder orgBuilder = UrlBuilder.getBuilder().rel(REL_ORG).template(orgUrlTemplate).type(
              javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML);
          templateBuilder = getRoleUri();
          final String roleUrlTemplate = templateBuilder.toString();
          if (logger.isInfoEnabled()) {
            logger.info("Role Template URL: " + roleUrlTemplate);
          }
          UrlBuilder roleBuilder = UrlBuilder.getBuilder().rel(REL_ROLE).template(roleUrlTemplate).
              type(javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML);

          templateBuilder = getUserUri();
          final String userUrlTemplate = templateBuilder.toString();
          if (logger.isInfoEnabled()) {
            logger.info("User Template URL: " + userUrlTemplate);
          }
          UrlBuilder userBuilder = UrlBuilder.getBuilder().rel(REL_USER).template(userUrlTemplate).
              type(javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML);

          templateBuilder = getPrivilegeUri();
          final String privilegeUrlTemplate = templateBuilder.toString();
          if (logger.isInfoEnabled()) {
            logger.info("Privilege Template URL: " + privilegeUrlTemplate);
          }
          UrlBuilder privilegeBuilder = UrlBuilder.getBuilder().rel(REL_PRIVILEGE).template(privilegeUrlTemplate).
              type(javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML);

          templateBuilder = getSecuredObjectUri();
          final String securedObjectUrlTemplate = templateBuilder.toString();
          if (logger.isInfoEnabled()) {
            logger.info("Secured Object Template URL: " + securedObjectUrlTemplate);
          }
          UrlBuilder securedObjectBuilder = UrlBuilder.getBuilder().rel(REL_SECURED_OBJECT).template(
              securedObjectUrlTemplate).
              type(javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML);


          templateBuilder = getUserGroupUri();
          final String userGroupUrlTemplate = templateBuilder.toString();
          if (logger.isInfoEnabled()) {
            logger.info("User Group Template URL: " + userGroupUrlTemplate);
          }
          UrlBuilder userGroupBuilder = UrlBuilder.getBuilder().rel(REL_USER_GROUP).template(userGroupUrlTemplate).
              type(javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML);

        

          descBuilder.urls(orgBuilder.build(), roleBuilder.build(), userBuilder.build(), privilegeBuilder.build(), securedObjectBuilder.
              build(), userGroupBuilder.build());
          descriptor = descBuilder.build();
        }
      }
    }
    ResponseBuilder builder = Response.ok(descriptor);
    return builder.build();
  }

  protected String getResourceClassUri(final Class aClass) throws IllegalArgumentException,
                                                                  UriBuilderException,
                                                                  RuntimeException {
    StringBuilder builder = new StringBuilder();
    final URI build = getRelativeURIBuilder().path(aClass).build();
    try {
      builder.append(URLDecoder.decode(build.toString(), "UTF-8"));
    }
    catch (Exception ex) {
      throw new RuntimeException(ex);
    }
    return builder.toString();
  }

  private String getOrgUri() {
    if (orgResourceUriTemplate == null) {
      synchronized (this) {
        if (orgResourceUriTemplate == null) {
          orgResourceUriTemplate = getResourceClassUri(OrganizationResource.class);
        }
      }
    }
    return orgResourceUriTemplate;
  }

  private String getRoleUri() {
    if (roleResourceUriTemplate == null) {
      synchronized (this) {
        if (roleResourceUriTemplate == null) {
          roleResourceUriTemplate = getResourceClassUri(RoleResource.class);
        }
      }
    }
    return roleResourceUriTemplate;
  }

  private String getUserUri() {
    if (userResourceUriTemplate == null) {
      synchronized (this) {
        if (userResourceUriTemplate == null) {
          userResourceUriTemplate = getResourceClassUri(OrganizationUserResource.class);
        }
      }
    }
    return userResourceUriTemplate;
  }

  private String getPrivilegeUri() {
    if (privilegeResourceUriTemplate == null) {
      synchronized (this) {
        if (privilegeResourceUriTemplate == null) {
          privilegeResourceUriTemplate = getResourceClassUri(OrganizationPrivilegeResource.class);
        }
      }
    }
    return privilegeResourceUriTemplate;
  }

  private String getSecuredObjectUri() {
    if (securedObjectResourceUriTemplate == null) {
      synchronized (this) {
        if (securedObjectResourceUriTemplate == null) {
          securedObjectResourceUriTemplate = getResourceClassUri(OrganizationSecuredObjectResource.class);
        }
      }
    }
    return securedObjectResourceUriTemplate;
  }

  private String getUserGroupUri() {
    if (userGroupResourceUriTemplate == null) {
      synchronized (this) {
        if (userGroupResourceUriTemplate == null) {
          userGroupResourceUriTemplate = getResourceClassUri(OrganizationUserGroupResource.class);
        }
      }
    }
    return userGroupResourceUriTemplate;
  }
 
}
