
package com.sumtotalsystems.sumtotal7.sumtotalws.authentication;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.sumtotalsystems.sumtotal7.sumtotalbo.User;
import com.sumtotalsystems.sumtotal7.sumtotalws.UserSecurityContext;
import com.sumtotalsystems.sumtotal7.sumtotalws.UserToken;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AuthenticationSoap", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
@XmlSeeAlso({
    com.sumtotalsystems.sumtotal7.sumtotalws.authentication.ObjectFactory.class,
    com.sumtotalsystems.sumtotal7.sumtotalws.ObjectFactory.class,
    com.sumtotalsystems.sumtotal7.sumtotalbo.ObjectFactory.class
})
public interface AuthenticationSoap {


    /**
     * 
     * @param userToken
     * @param credentials
     */
    @WebMethod(operationName = "Login", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/Login")
    @RequestWrapper(localName = "Login", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.LoginResponse")
    public void login(
        @WebParam(name = "credentials", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
        UserCredentials credentials,
        @WebParam(name = "UserToken", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", header = true, mode = WebParam.Mode.OUT, partName = "UserToken")
        Holder<UserToken> userToken);

    /**
     * 
     * @param userSecurityContext
     * @param newPassword
     * @param oldPassword
     */
    @WebMethod(operationName = "ChangePassword", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/ChangePassword")
    @RequestWrapper(localName = "ChangePassword", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.ChangePassword")
    @ResponseWrapper(localName = "ChangePasswordResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.ChangePasswordResponse")
    public void changePassword(
        @WebParam(name = "oldPassword", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
        String oldPassword,
        @WebParam(name = "newPassword", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
        String newPassword,
        @WebParam(name = "UserSecurityContext", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", header = true, partName = "UserSecurityContext")
        UserSecurityContext userSecurityContext);

    /**
     * 
     * @param userSecurityContext
     */
    @WebMethod(operationName = "Logout", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/Logout")
    @RequestWrapper(localName = "Logout", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.Logout")
    @ResponseWrapper(localName = "LogoutResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.LogoutResponse")
    public void logout(
        @WebParam(name = "UserSecurityContext", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", header = true, partName = "UserSecurityContext")
        UserSecurityContext userSecurityContext);

    /**
     * 
     * @param userSecurityContext
     * @param populationLevel
     * @return
     *     returns com.sumtotalsystems.sumtotal7.sumtotalbo.User
     */
    @WebMethod(operationName = "GetLoggedInUser", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/GetLoggedInUser")
    @WebResult(name = "GetLoggedInUserResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/")
    @RequestWrapper(localName = "GetLoggedInUser", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.GetLoggedInUser")
    @ResponseWrapper(localName = "GetLoggedInUserResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.GetLoggedInUserResponse")
    public User getLoggedInUser(
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
        int populationLevel,
        @WebParam(name = "UserSecurityContext", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", header = true, partName = "UserSecurityContext")
        UserSecurityContext userSecurityContext);

    /**
     * 
     * @param userSecurityContext
     * @param domainId
     */
    @WebMethod(operationName = "SetWorkingDomain", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/SetWorkingDomain")
    @RequestWrapper(localName = "SetWorkingDomain", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.SetWorkingDomain")
    @ResponseWrapper(localName = "SetWorkingDomainResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.SetWorkingDomainResponse")
    public void setWorkingDomain(
        @WebParam(name = "domainId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
        String domainId,
        @WebParam(name = "UserSecurityContext", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", header = true, partName = "UserSecurityContext")
        UserSecurityContext userSecurityContext);

    /**
     * 
     * @param userSecurityContext
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetWorkingDomain", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/GetWorkingDomain")
    @WebResult(name = "GetWorkingDomainResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
    @RequestWrapper(localName = "GetWorkingDomain", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.GetWorkingDomain")
    @ResponseWrapper(localName = "GetWorkingDomainResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", className = "com.sumtotalsystems.sumtotal7.sumtotalws.authentication.GetWorkingDomainResponse")
    public String getWorkingDomain(
        @WebParam(name = "UserSecurityContext", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", header = true, partName = "UserSecurityContext")
        UserSecurityContext userSecurityContext);

}
