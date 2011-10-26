<%-- 
    Document   : OrganizationDetails
    Created on : Jul 24, 2010, 12:55:21 PM
    Author     : russel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.smartitengineering.user.domain.Organization" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="java.util.Collection"%>

<div id="leftmenu_orgdetails_1" class="leftmenu">
  <div id="leftmenu_header_orgdetails_1" class="leftmenu_header"><label>Organization</label></div>
  <div id="leftmenu_body_orgdetails_1" class="leftmenu_body">
    <ul>
        <c:if test="${it.uniqueShortName!='smart-user'}">
      <li><a href="javascript: Orgpageselect()"><fmt:message key="org.editlink"/></a></li>
      <form method="POST" action ="<c:url value="/orgs/sn/${it.uniqueShortName}/delete"/>" accept="application/json" name="submitform" id="organizationform">
      <input type="hidden" name="name" value="${it.name}" class="textField">
      <input type="hidden" name="uniqueShortName" value="${it.uniqueShortName}" class="textField">
      <input type="hidden" name="streetAddress" value="${it.address.streetAddress}" class="textField">
      <input type="hidden" name="city" value="${it.address.city}" class="textField">
      <input type="hidden" name="state" value="${it.address.state}" class="textField">
      <input type="hidden" name="country" value="${it.address.country}" class="textField">
      <input type="hidden" name="zip"  class="textField" value="${it.address.zip}">
      <input type="hidden" name="id" value="${it.id}">
      <input type="hidden" name="version" value="${it.version}">
      <li><a href="#" onclick="document.submitform.submit()"><fmt:message key="org.deletelink"/></a></li>
      </c:if>
      <li><a href="<c:url value="/orgs/sn/${it.uniqueShortName}/users" />"><fmt:message key="org.userlistlink"/></a></li>
    </ul>
      </form>
  </div>
</div>

<div id="showList" class="show">
  <c:if test="${param['lang']!=null}">
    <fmt:setLocale scope="session" value="${param['lang']}"/>
  </c:if>

  <div id="individual_org_details_header" class="header_details_info"><label><c:out value="${it.name}"></label></c:out></div>
  <div id="individual_org_details_content" class="content_details_info">
    <div class="individual_details_label"><label><fmt:message key="org.tablehead2"/></label></div>
    <div class="individual_details_data"><label>${it.name}</label></div>
    <div class="clear"></div>
    <div class="individual_details_label"><label><fmt:message key="org.tablehead3"/></label></div>
    <div class="individual_details_data"><label>${it.uniqueShortName}</label></div>
    <div class="clear"></div>
    <div class="individual_details_label"><label><fmt:message key="org.inputlabel3"/></label></div>
    <div class="individual_details_data"><label>${it.address.streetAddress}</label></div>
    <div class="clear"></div>
    <div class="individual_details_label"><label><fmt:message key="org.inputlabel4"/></label></div>
    <div class="individual_details_data"><label>${it.address.city}</label></div>
    <div class="clear"></div>
    <div class="individual_details_label"><label><fmt:message key="org.inputlabel5"/></label></div>
    <div class="individual_details_data"><label>${it.address.state}</label></div>
    <div class="clear"></div>
    <div class="individual_details_label"><label><fmt:message key="org.inputlabel6"/></label></div>
    <div class="individual_details_data"><label>${it.address.country}</label></div>
    <div class="clear"></div>
    <div class="individual_details_label"><label><fmt:message key="org.inputlabel7"/></label></div>
    <div class="individual_details_data"><label>${it.address.zip}</label></div>
    <div class="clear"></div>

    <form method="POST" action ="<c:url value="/orgs/sn/${it.uniqueShortName}/delete"/>" accept="application/json" id="organizationform">
      <input type="hidden" name="name" value="${it.name}" class="textField">
      <input type="hidden" name="uniqueShortName" value="${it.uniqueShortName}" class="textField">
      <input type="hidden" name="streetAddress" value="${it.address.streetAddress}" class="textField">
      <input type="hidden" name="city" value="${it.address.city}" class="textField">
      <input type="hidden" name="state" value="${it.address.state}" class="textField">
      <input type="hidden" name="country" value="${it.address.country}" class="textField">
      <input type="hidden" name="zip"  class="textField" value="${it.address.zip}">
      <input type="hidden" name="id" value="${it.id}">
      <input type="hidden" name="version" value="${it.version}">
      <c:if test="${it.uniqueShortName!='smart-user'}">
      <div class="btnfield"><input type="submit" value="<fmt:message key="org.deleteLevel"/>" name="submitbtn" class="submitbtn"></div>
      </c:if>
      <div class="clear"></div>
    </form>
  </div>
</div>

<div id="create" class="hide">
  <div id="header_organization" class="header_entry_form"><label id="headerogorganization"><c:out value="${it.name}"></c:out></label></div>
  <fmt:message key="org.usrinput6" var="submitbtn"/>
  <div id="form_organizationentry" class="entry_form">
    <form method="POST" action ="<c:url value="/orgs/sn/${it.uniqueShortName}/update"/>" accept="application/json" id="organizationform">
      <div class="form_label"><label><fmt:message key="org.tablehead2"/></label></div>
      <div class="form_textField"><input type="text" name="name" value="${it.name}" class="textField"></div>
      <div class="clear"></div>
      <div class="form_label"><label><fmt:message key="org.tablehead3"/></label></div>
      <div class="form_textField"><input type="text" name="uniqueShortName" value="${it.uniqueShortName}" class="textField"></div>
      <div class="clear"></div>
      <div class="form_label"><label><fmt:message key="org.inputlabel3"/></label></div>
      <div class="form_textField"><input type="text" name="streetAddress" value="${it.address.streetAddress}" class="textField"></div>
      <div class="clear"></div>
      <div class="form_label"><label><fmt:message key="org.inputlabel4"/></label></div>
      <div class="form_textField"><input type="text" name="city" value="${it.address.city}" class="textField"></div>
      <div class="clear"></div>
      <div class="form_label"><label><fmt:message key="org.inputlabel5"/></label></div>
      <div class="form_textField"><input type="text" name="state" value="${it.address.state}" class="textField"></div>
      <div class="clear"></div>
      <div class="form_label"><label><fmt:message key="org.inputlabel6"/></label></div>
      <div class="form_textField"><input type="text" name="country" value="${it.address.country}" class="textField"></div>
      <div class="clear"></div>
      <div class="form_label"><label><fmt:message key="org.inputlabel7"/></label></div>
      <div class="form_textField"><input type="text" name="zip"  class="textField" value="${it.address.zip}"></div>
      <div class="clear"></div>
      <div></div>
      <div><input type="hidden" name="id" value="${it.id}"></div>
      <div class="clear"></div>
      <div></div>
<!--      <div><input type="hidden" name="version" value="${it.version}"></div>-->
      <div class="clear"></div>
      <div class="btnfield"><input type="submit" value="<fmt:message key="org.updateLevel"/>" name="submitbtn" class="submitbtn"></div>
      <div class="clear"></div>
    </form>
  </div>
</div>