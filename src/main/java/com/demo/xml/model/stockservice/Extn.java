package com.demo.xml.model.stockservice;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Extn")
@Getter
@NoArgsConstructor
public class Extn {
    @XmlAttribute(name = "ExtnCaseQuantity")
    private String extnCaseQuantity = "1";
    @XmlAttribute(name = "ExtnDeliveryBeforeReleaseAllowed")
    private String extnDeliveryBeforeReleaseAllowed = "Y";
    @XmlAttribute(name = "ExtnDeliveryServiceLeadTime")
    private String extnDeliveryServiceLeadTime = "2";
    @XmlAttribute(name = "ExtnEmbargo")
    private String extnEmbargo = "N";
    @XmlAttribute(name = "ExtnIsFragile")
    private String extnIsFragile = "N";
    @XmlAttribute(name = "ExtnIsPreOrderable")
    private String extnIsPreOrderable = "N";
    @XmlAttribute(name = "ExtnIsUgly")
    private String extnIsUgly = "N";
    @XmlAttribute(name = "ExtnItemCategory")
    private String extnItemCategory = "Phones";
    @XmlAttribute(name = "ExtnItemSubcategory")
    private String extnItemSubcategory = "SIM Card";
    @XmlAttribute(name = "ExtnMinimumAgeRequired")
    private String extnMinimumAgeRequired = "";
    @XmlAttribute(name = "ExtnPODLegal")
    private String extnPODLegal = "N";
    @XmlAttribute(name = "ExtnPODRequired")
    private String extnPODRequired = "N";
    @XmlAttribute(name = "ExtnPODValue")
    private String extnPODValue = "N";
    @XmlAttribute(name = "ExtnPreferredEAN")
    private String extnPreferredEAN = "05000462191259";
    @XmlAttribute(name = "ExtnPreferredTPND")
    private String extnPreferredTPND = "8621060";
    @XmlAttribute(name = "ExtnPricePromise")
    private String extnPricePromise = "N";
    @XmlAttribute(name = "ExtnSpecialDeliveryReqt")
    private String extnSpecialDeliveryReqt = "Not Applicable";
    @XmlAttribute(name = "ExtnTPNB")
    private String extnTPNB = "050231543";
    @XmlAttribute(name = "ExtnTVLACode")
    private String extnTVLACode = "100";
    @XmlAttribute(name = "ExtnTVLAFlag")
    private String extnTVLAFlag = "N";
    @XmlAttribute(name = "ExtnVatRate")
    private String extnVatRate = "20";
}
