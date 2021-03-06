
package com.sumtotalsystems.sumtotal7.sumtotalws.authentication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Authentication", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", wsdlLocation = "http://mtn-sademo-128.sumtotalsystems.com/SumTotalWS/Services/authentication.asmx?wsdl")
public class Authentication
    extends Service
{

    private final static URL AUTHENTICATION_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.sumtotalsystems.sumtotal7.sumtotalws.authentication.Authentication.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.sumtotalsystems.sumtotal7.sumtotalws.authentication.Authentication.class.getResource(".");
            url = new URL(baseUrl, "authentication.asmx?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://mtn-sademo-128.sumtotalsystems.com/SumTotalWS/Services/authentication.asmx?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        AUTHENTICATION_WSDL_LOCATION = url;
    }

    public Authentication(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Authentication() {
        super(AUTHENTICATION_WSDL_LOCATION, new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", "Authentication"));
    }

    /**
     * 
     * @return
     *     returns AuthenticationSoap
     */
    @WebEndpoint(name = "AuthenticationSoap")
    public AuthenticationSoap getAuthenticationSoap() {
        return super.getPort(new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", "AuthenticationSoap"), AuthenticationSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticationSoap
     */
    @WebEndpoint(name = "AuthenticationSoap")
    public AuthenticationSoap getAuthenticationSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", "AuthenticationSoap"), AuthenticationSoap.class, features);
    }

}
