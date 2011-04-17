/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.client.api;

import com.smartitengineering.util.opensearch.api.OpenSearchDescriptor;
import com.smartitengineering.util.rest.client.Resource;

/**
 *
 * @author imyousuf
 */
public interface UriTemplateResource extends Resource<OpenSearchDescriptor> {

  OrganizationResource getOrganizationForUniqueShortName(String uniqueShortName);

  RoleResource getRoleResourceForRoleName(String roleName);

  UserResource getUserResource(String orgUniqueShortName, String username);

  PrivilegeResource getPrivilegeResource (String orgUniqueShortName,  String privilegeName);

  SecuredObjectResource getSecuredObjectResource (String orgUniqueShortName, String securedObjectName);

  UserGroupResource getUserGroupResource (String orgUniqueShortName, String userGroupName);

}
