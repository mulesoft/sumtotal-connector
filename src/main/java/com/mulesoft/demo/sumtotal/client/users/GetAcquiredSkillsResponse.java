
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAcquiredSkillsResult" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfUserAcquiredSkill" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAcquiredSkillsResult"
})
@XmlRootElement(name = "GetAcquiredSkillsResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class GetAcquiredSkillsResponse {

    @XmlElement(name = "GetAcquiredSkillsResult", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected ArrayOfUserAcquiredSkill2 getAcquiredSkillsResult;

    /**
     * Gets the value of the getAcquiredSkillsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserAcquiredSkill2 }
     *     
     */
    public ArrayOfUserAcquiredSkill2 getGetAcquiredSkillsResult() {
        return getAcquiredSkillsResult;
    }

    /**
     * Sets the value of the getAcquiredSkillsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserAcquiredSkill2 }
     *     
     */
    public void setGetAcquiredSkillsResult(ArrayOfUserAcquiredSkill2 value) {
        this.getAcquiredSkillsResult = value;
    }

}