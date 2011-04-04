/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.client.impl;

import com.smartitengineering.user.client.api.LoginResource;
import com.smartitengineering.user.client.api.RootResource;
import com.smartitengineering.user.client.api.UriTemplateResource;
import com.smartitengineering.util.bean.PropertiesLocator;
import com.smartitengineering.util.opensearch.jaxrs.OpenSearchDescriptorProvider;
import com.smartitengineering.util.rest.atom.AbstractFeedClientResource;
import com.smartitengineering.util.rest.client.ApplicationWideClientFactoryImpl;
import com.smartitengineering.util.rest.client.ConfigProcessor;
import com.smartitengineering.util.rest.client.ConnectionConfig;
import com.smartitengineering.util.rest.client.Resource;
import com.smartitengineering.util.rest.client.ResourceLink;
import com.smartitengineering.util.rest.client.jersey.cache.CacheableClientConfigProps;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.atom.abdera.impl.provider.entity.FeedProvider;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.Properties;
import javax.ws.rs.core.UriBuilder;
import org.apache.abdera.model.Feed;
import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author modhu7
 */
public class RootResourceImpl
    extends AbstractFeedClientResource<Resource<? extends Feed>>
    implements RootResource {

  public static final String REL_LOGIN = "Login";
  public static final String REL_TEMPLATES = "templates";
  private final String username, password;
  private final static ThreadLocal<Entry<String, String>> usernamePass = new ThreadLocal<Entry<String, String>>();
  private static final ConnectionConfig SMART_USER_CONNECTION_CONFIG;
  private static final boolean CONNECTION_CONFIGURED;
  private static final URI SMART_USER_BASE_URI;
  private static final ConfigProcessor CONFIG_PROCESSOR = new UserConfigProcessor();
  public static final Logger LOGGER = LoggerFactory.getLogger(RootResourceImpl.class);

  static {
    SMART_USER_CONNECTION_CONFIG = new ConnectionConfig();
    String propFileName = "smart-user-client-config.properties";
    PropertiesLocator locator = new PropertiesLocator();
    locator.setSmartLocations(propFileName);
    final Properties properties = new Properties();
    try {
      locator.loadProperties(properties);
    }
    catch (IOException ex) {
      LOGGER.warn("Exception!", ex);
    }
    if (!properties.isEmpty()) {
      CONNECTION_CONFIGURED = true;
      SMART_USER_CONNECTION_CONFIG.setBasicUri(properties.getProperty("baseUri", ""));
      SMART_USER_CONNECTION_CONFIG.setContextPath(properties.getProperty("contextPath", "/"));
      SMART_USER_CONNECTION_CONFIG.setHost(properties.getProperty("host", "localhost"));
      SMART_USER_CONNECTION_CONFIG.setPort(NumberUtils.toInt(properties.getProperty("port", ""), 9090));
      SMART_USER_BASE_URI = UriBuilder.fromUri(SMART_USER_CONNECTION_CONFIG.getContextPath()).path(SMART_USER_CONNECTION_CONFIG.
          getBasicUri()).host(SMART_USER_CONNECTION_CONFIG.getHost()).port(SMART_USER_CONNECTION_CONFIG.getPort()).
          scheme("http").build();
    }
    else {
      CONNECTION_CONFIGURED = false;
      SMART_USER_BASE_URI = null;
    }
  }

  public static RootResource getInstance(String username, String password) {
    usernamePass.set(new SimpleEntry<String, String>(username, password));
    return new RootResourceImpl(username, password);
  }

  private RootResourceImpl(String username, String password) {
    super(null, CONNECTION_CONFIGURED ? SMART_USER_BASE_URI : BASE_URI, true, CONNECTION_CONFIGURED ? ApplicationWideClientFactoryImpl.
        getClientFactory(SMART_USER_CONNECTION_CONFIG, CONFIG_PROCESSOR) : null);
    this.username = username;
    this.password = password;
  }

  @Override
  public LoginResource getLoginResource() {
    try {
      return new LoginResourceImpl(username, password, getLoginLink(), this);
    }
    catch (URISyntaxException ex) {
      throw new RuntimeException(ex);
    }
  }

  @Override
  public ResourceLink getLoginLink() {
    return getRelatedResourceUris().getFirst(REL_LOGIN);
  }

  @Override
  protected void processClientConfig(ClientConfig clientConfig) {
    CONFIG_PROCESSOR.process(clientConfig);
  }

  @Override
  protected Resource<? extends Feed> instantiatePageableResource(ResourceLink link) {
    return null;
  }

  @Override
  public UriTemplateResource getTemplateResource() {
    try {
      return new UriTemplateResourceImpl(this, getRelatedResourceUris().getFirst(REL_TEMPLATES));
    }
    catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }

  private static class UserConfigProcessor implements ConfigProcessor {

    @Override
    public void process(ClientConfig clientConfig) {
      clientConfig.getProperties().put(CacheableClientConfigProps.USERNAME, usernamePass.get().getKey());
      clientConfig.getProperties().put(CacheableClientConfigProps.PASSWORD, usernamePass.get().getValue());
      clientConfig.getClasses().add(JacksonJsonProvider.class);
      clientConfig.getClasses().add(FeedProvider.class);
      clientConfig.getClasses().add(OpenSearchDescriptorProvider.class);
    }
  }
}
