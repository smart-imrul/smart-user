/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.client.api;

import com.smartitengineering.util.rest.client.WritableResource;
import org.apache.abdera.model.Feed;

/**
 *
 * @author modhu7
 */
public interface UserGroupResource extends WritableResource<Feed> {

  public UserGroup getUserGroup();

  public UserGroupUsersResource getUserGroupUsersResource();

  public UserGroupPrivilegesResource getUserGroupPrivilegesResource();

  public UserGroupRolesResource getUserGroupRolesResource();
}