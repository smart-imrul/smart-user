/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smartitengineering.user.client.api;

/**
 *
 * @author russel
 */
public interface LoginResource {

  OrganizationResource getOrganizationResource();

  OrganizationUserResource getUserResource();

//   AuthorizationResource checkAuthorization(String userName);

}