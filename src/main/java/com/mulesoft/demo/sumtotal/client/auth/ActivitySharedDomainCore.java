
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivitySharedDomainCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitySharedDomainCore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivitySharedDomainPropertyBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitySharedDomainCore")
@XmlSeeAlso({
    ActivitySharedDomain.class
})
public abstract class ActivitySharedDomainCore
    extends ActivitySharedDomainPropertyBase
{


}
