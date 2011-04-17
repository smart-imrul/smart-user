/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.client.impl;

import com.smartitengineering.user.client.api.OrganizationResource;
import com.smartitengineering.user.client.api.PrivilegeResource;
import com.smartitengineering.user.client.api.RoleResource;
import com.smartitengineering.user.client.api.SecuredObjectResource;
import com.smartitengineering.user.client.api.UriTemplateResource;
import com.smartitengineering.user.client.api.UserGroupResource;
import com.smartitengineering.user.client.api.UserResource;
import com.smartitengineering.util.opensearch.api.OpenSearchDescriptor;
import com.smartitengineering.util.opensearch.api.Url;
import com.smartitengineering.util.opensearch.api.Url.Rel;
import com.smartitengineering.util.rest.client.AbstractClientResource;
import com.smartitengineering.util.rest.client.ClientUtil;
import com.smartitengineering.util.rest.client.Resource;
import com.smartitengineering.util.rest.client.ResourceLink;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.config.ClientConfig;
import java.net.URI;

/**
 *
 * @author imyousuf
 */
public class UriTemplateResourceImpl extends AbstractClientResource<OpenSearchDescriptor, Resource> implements
    UriTemplateResource {

  public UriTemplateResourceImpl(Resource referrer, ResourceLink resouceLink) throws IllegalArgumentException,
                                                                                     UniformInterfaceException {
    super(referrer, resouceLink);
  }

  @Override
  protected void processClientConfig(ClientConfig clientConfig) {
  }

  @Override
  protected ResourceLink getNextUri() {
    return null;
  }

  @Override
  protected ResourceLink getPreviousUri() {
    return null;
  }

  @Override
  protected Resource instantiatePageableResource(ResourceLink link) {
    return null;
  }

  @Override
  public OrganizationResource getOrganizationForUniqueShortName(String templateVal) {
    String[] replacables = {"{uniqueShortName}"};
    String[] replacedValus = {templateVal};
    ResourceLink link = getResourceLink("org", replacables, replacedValus);
    if (link != null) {
      return new OrganizationResourceImpl(link, this);
    }
    return null;

  }

  @Override
  public RoleResource getRoleResourceForRoleName(String templateVal) {
    String[] replacables = {"{roleName}"};
    String[] replacedValus = {templateVal};
    ResourceLink link = getResourceLink("role", replacables, replacedValus);
    if (link != null) {
      return new RoleResourceImpl(link, this);
    }
    return null;
  }


  public ResourceLink getResourceLink(String relValue, String[] templateString, String[] templateVal) {
    OpenSearchDescriptor descriptor = getLastReadStateOfEntity();
    for (Url url : descriptor.getUrls()) {
      for (Rel rel : url.getRels()) {
        if (relValue.equals(rel.getValue())) {
          String urlStr = url.getTemplate();
          for (int i = 0; i < templateString.length; i++) {
            urlStr = urlStr.replace(templateString[i], templateVal[i]);
          }
          ResourceLink link = ClientUtil.createResourceLink(relValue, URI.create(urlStr), url.getType());
          return link;
        }
      }
    }
    return null;
  }

 
  @Override
  public PrivilegeResource getPrivilegeResource(String orgUniqueShortName, String privilegeName) {
    logger.info("Organization short name : " + orgUniqueShortName );
    logger.info("privilege name : " + privilegeName );

    String[] replacables = {"{organizationUniqueShortName}", "{privilegeName}"};
    String[] replacedValus = {orgUniqueShortName, privilegeName};
    ResourceLink link = getResourceLink("privilege", replacables, replacedValus);


    if (link != null) {      
      return new PrivilegeResourceImpl(link, this);
    }
    logger.info("Link is null");
    return null;
  }

  @Override
  public SecuredObjectResource getSecuredObjectResource(String orgUniqueShortName, String securedObjectName) {
    String[] replacables = {"{organizationUniqueShortName}", "{name}"};
    String[] replacedValus = {orgUniqueShortName, securedObjectName};
    ResourceLink link = getResourceLink("securedobject", replacables, replacedValus);
    if (link != null) {
      return new SecuredObjectResourceImpl(link, this);
    }
    return null;
  }

  @Override
  public UserGroupResource getUserGroupResource(String orgUniqueShortName, String userGroupName) {    
    String[] replacables = {"{uniqueShortName}", "{name}"};
    String[] replacedValus = {orgUniqueShortName, userGroupName};
    ResourceLink link = getResourceLink("usergroup", replacables, replacedValus);
    if (link != null) {
      return new UserGroupResourceImpl(link, this);
    }
    return null;
  }

  @Override
  public UserResource getUserResource(String orgUniqueShortName, String username) {    
    String[] replacables = {"{organizationShortName}", "{userName}"};
    String[] replacedValus = {orgUniqueShortName, username};
    ResourceLink link = getResourceLink("user", replacables, replacedValus);
    if (link != null) {
      return new UserResourceImpl(link, this);
    }
    return null;
  }
}
