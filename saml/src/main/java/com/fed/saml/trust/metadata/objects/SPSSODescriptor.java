//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.18 at 03:26:19 PM PDT 
//


package com.fed.saml.trust.metadata.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}KeyDescriptor" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}SingleLogoutService" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AssertionConsumerService"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuthnRequestsSigned" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WantAssertionsSigned" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="protocolSupportEnumeration" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyDescriptor",
    "singleLogoutService",
    "assertionConsumerService"
})
@XmlRootElement(name = "SPSSODescriptor", namespace = "urn:oasis:names:tc:SAML:2.0:metadata")
public class SPSSODescriptor {

    @XmlElement(name = "KeyDescriptor", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", required = true)
    protected List<KeyDescriptor> keyDescriptor;
    @XmlElement(name = "SingleLogoutService", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", required = true)
    protected List<SingleLogoutService> singleLogoutService;
    @XmlElement(name = "AssertionConsumerService", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", required = true)
    protected AssertionConsumerService assertionConsumerService;
    @XmlAttribute(name = "AuthnRequestsSigned", required = true)
    protected boolean authnRequestsSigned;
    @XmlAttribute(name = "WantAssertionsSigned", required = true)
    protected boolean wantAssertionsSigned;
    @XmlAttribute(name = "protocolSupportEnumeration", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String protocolSupportEnumeration;

    /**
     * Gets the value of the keyDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyDescriptor }
     * 
     * 
     */
    public List<KeyDescriptor> getKeyDescriptor() {
        if (keyDescriptor == null) {
            keyDescriptor = new ArrayList<KeyDescriptor>();
        }
        return this.keyDescriptor;
    }

    /**
     * Gets the value of the singleLogoutService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleLogoutService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleLogoutService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleLogoutService }
     * 
     * 
     */
    public List<SingleLogoutService> getSingleLogoutService() {
        if (singleLogoutService == null) {
            singleLogoutService = new ArrayList<SingleLogoutService>();
        }
        return this.singleLogoutService;
    }

    /**
     * Gets the value of the assertionConsumerService property.
     * 
     * @return
     *     possible object is
     *     {@link AssertionConsumerService }
     *     
     */
    public AssertionConsumerService getAssertionConsumerService() {
        return assertionConsumerService;
    }

    /**
     * Sets the value of the assertionConsumerService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionConsumerService }
     *     
     */
    public void setAssertionConsumerService(AssertionConsumerService value) {
        this.assertionConsumerService = value;
    }

    /**
     * Gets the value of the authnRequestsSigned property.
     * 
     */
    public boolean isAuthnRequestsSigned() {
        return authnRequestsSigned;
    }

    /**
     * Sets the value of the authnRequestsSigned property.
     * 
     */
    public void setAuthnRequestsSigned(boolean value) {
        this.authnRequestsSigned = value;
    }

    /**
     * Gets the value of the wantAssertionsSigned property.
     * 
     */
    public boolean isWantAssertionsSigned() {
        return wantAssertionsSigned;
    }

    /**
     * Sets the value of the wantAssertionsSigned property.
     * 
     */
    public void setWantAssertionsSigned(boolean value) {
        this.wantAssertionsSigned = value;
    }

    /**
     * Gets the value of the protocolSupportEnumeration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolSupportEnumeration() {
        return protocolSupportEnumeration;
    }

    /**
     * Sets the value of the protocolSupportEnumeration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolSupportEnumeration(String value) {
        this.protocolSupportEnumeration = value;
    }

}
