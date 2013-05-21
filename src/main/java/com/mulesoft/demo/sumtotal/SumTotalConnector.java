/**
 * This file was automatically generated by the Mule Development Kit
 */
package com.mulesoft.demo.sumtotal;

import com.sumtotalsystems.sumtotal7.sumtotalbo.User;
import com.sumtotalsystems.sumtotal7.sumtotalws.UserSecurityContext;
import com.sumtotalsystems.sumtotal7.sumtotalws.UserToken;
import com.sumtotalsystems.sumtotal7.sumtotalws.authentication.*;
import com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement.UserManagement;
import com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement.UserManagementSoap;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.ConnectionException;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import sun.util.LocaleServiceProviderPool;

import javax.xml.ws.Holder;

/**
 * SumTotal Cloud Connector
 *
 * @author MuleSoft, Inc.
 */
@Connector(name="sumtotal", schemaVersion="1.0-SNAPSHOT")
public class SumTotalConnector {
    private UserToken userToken = new UserToken();
    private AuthenticationSoap authSoapClient = new Authentication().getAuthenticationSoap();
    private UserManagementSoap usersSoapClient = new UserManagement().getUserManagementSoap();

    // SumTotal example values
    private static final String USER = "wstest";
    private static final String PASS = "learning";
    private static final int DEFAULT_POPULATION = 1;
    private static final String LANG_ID = "1";
    private static final String TZ_ID = "127";
    private static final String SEC_ROLE_ID = "207";
    private static final String DOMAIN_ID = "3";

    /**
     * Connect
     *
     * @param username A username
     * @param password A password
     * @throws ConnectionException
     */
    @Connect
    public void connect(@ConnectionKey String username, String password) throws ConnectionException {
        userToken = doAuth(username, password);
    }

    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        endSession(userToken);
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected() {
        return userToken.getValue() != null;
    }

    /**
     * Are we connected
     */
    @ConnectionIdentifier
    public String connectionId() {
        return userToken.getValue();
    }

    private UserToken doAuth(String username, String password) {
        UserCredentials credentials = new UserCredentials();
        credentials.setUsername(username);
        credentials.setPasscode(password);
        credentials.setAuthenticationType(UserAuthenticationType.NOT_SPECIFIED);
        credentials.setAccountType(UserType.NOT_SPECIFIED);
        Holder<UserToken> holder = new Holder<UserToken>(new UserToken());
        authSoapClient.login(credentials, holder);
        return holder.value;
    }

    private void endSession(UserToken token) {
        authSoapClient.logout(getUserSecurityContext(token));
    }

    static UserSecurityContext getUserSecurityContext(UserToken userToken) {
        UserSecurityContext securityContext = new UserSecurityContext();
        securityContext.setToken(userToken);
        return securityContext;
    }

    /**
     * Create a new SumTotal User record
     *
     * {@sample.xml ../../../doc/SumTotal-connector.xml.sample sumtotal:create-user}
     *
     * @param userName User's full username for SumTotal
     * @param firstName User's full username for SumTotal
     * @param lastName User's full username for SumTotal
     * @param email User's full username for SumTotal
     * @param domainId User's full username for SumTotal
     * @param securityRoleId The SumTotal ID code of the security role this user has
     * @param languageId The SumTotal ID code of the language this user uses (locale)
     * @param timezoneId The SumTotal ID code of the timezone this user is in
     *
     * @return The newly created User, or null if the User record could not be created
     */
    @Processor
    public User createUser(String userName,
                           String firstName,
                           String lastName,
                           @Optional String email,
                           String domainId,
                           String securityRoleId,
                           String languageId,
                           String timezoneId) {
        User user = new User();
        user.setUsername(userName);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setIsLoginEnabled(true);
        user.setPassword("learning");
        user.setDomainId(domainId);
        user.setSecurityRoleId(securityRoleId);
        user.setLanguagePreferenceId(languageId);
        user.setTimeZonePreferenceId(timezoneId);

        User created = null;

        try {
            created = usersSoapClient.createUser(user, getUserSecurityContext(userToken));
        } catch (Exception e) {
            System.out.println("WS ERROR ON CREATE USER CALL " + e.getMessage());
            //TODO - log this
        }

        return created;
    }

    /**
     * Find a specific SumTotal User record
     *
     * {@sample.xml ../../../doc/SumTotal-connector.xml.sample sumtotal:find-user}
     *
     * @param userName The SumTotal Username of the User to be found
     * @param domainId The domain the User belongs to
     * @param population The depth of results to return
     * @return User The User record if found, else NULL
     */
    @Processor
    public User findUser(String userName, String domainId, int population) {
        User foundUser = null;

        try {
            foundUser = usersSoapClient.getUserByUserName(domainId, userName, population, getUserSecurityContext(userToken));
        } catch (Exception e) {
            System.out.println("WS ERROR ON FIND USER CALL " + e.getMessage());
            //TODO - log this
        }

        return foundUser;
    }

    /**
     * Utility method for testing
     *
     * @param user
     * @return
     */
    static String printUser(User user) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\nUSERNAME : " + user.getUsername() + "\n");
        stringBuffer.append("FIRST : " + user.getFirstName()+"\n");
        stringBuffer.append("LAST : " + user.getLastName()+"\n");
        stringBuffer.append("EMAIL : " + user.getEmail()+"\n");
        stringBuffer.append("TZ ID : " + user.getTimeZonePreferenceId()+"\n");
        stringBuffer.append("LANG ID : " + user.getLanguagePreferenceId()+"\n");
        stringBuffer.append("SEC ROLE ID : " + user.getSecurityRoleId()+"\n");
        stringBuffer.append("DOMAIN ID : " + user.getDomainId());

        return stringBuffer.toString();
    }

    /**
     * Sanity checking...
     *
     * @param args
     * @throws Exception
     */
    public static void main(String [] args) throws Exception {
   /*     UserToken token = doAuth(USER, PASS);
        System.out.println("Token is " + token.getValue());
        User authUser = getUser(USER, token);
        System.out.println("Logged in User's sec role id is " + authUser.getSecurityRoleId());
        String newUserName = "MuleSoft_" + new Object().hashCode();
        //User createdUser = doCreateUser(newUserName, "TEST", "USER", "test@example.com", DOMAIN_ID, SEC_ROLE_ID, LANG_ID, TZ_ID, token);
        System.out.println("New User is: " + printUser(createdUser));
        endSession(token);

        //brief test to make sure this fails when logged out
        try {
            getUser(USER, token);
        } catch (SOAPFaultException sfe) {
            System.out.println("User token successfully invalidated");
            //sfe.printStackTrace();
            return;
        }
        System.out.println("If this line is reached an invalidated token has been used successfully - that's not a good thing");
*/
    }

    /**
     * FOR DEBUG ONLY
     *
     * {@sample.xml ../../../doc/SumTotal-connector.xml.sample sumtotal:my-processor}
     *
     * @param content Content to be processed
     * @return Some string
     */
    /*@Processor
    public String getSecurityToken(String content) {
        return "USER TOKEN IS " + userToken.getValue();
    }*/

}
