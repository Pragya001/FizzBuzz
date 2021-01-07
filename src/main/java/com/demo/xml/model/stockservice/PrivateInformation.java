package com.demo.xml.model.stockservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlAttribute;

@Getter
@NoArgsConstructor
public class PrivateInformation {
    @XmlAttribute(name = "AssumeInfiniteInventory")
    private String assumeInfiniteInventory = "N";
    @XmlAttribute(name = "Description")
    private String description = "Vodafone Â£10 Top Up";
    @XmlAttribute(name = "IsHazmat")
    private String isHazmat = "N";
    @XmlAttribute(name = "IsReturnable")
    private String isReturnable = "N";
    @XmlAttribute(name = "ItemType")
    private String itemType = "Product";
    @XmlAttribute(name = "ProductLine")
    private String productLine = "Directs";
    @XmlAttribute(name = "Status")
    private String status = "3000";
    @XmlAttribute(name = "UnitHeight")
    private String unitHeight = "1";
    @XmlAttribute(name = "UnitHeightUOM")
    private String unitHeightUOM = "1";
    @XmlAttribute(name = "UnitLength")
    private String unitLength = "1";
    @XmlAttribute(name = "UnitLengthUOM")
    private String unitLengthUOM = "1";
    @XmlAttribute(name = "UnitWeight")
    private String unitWeight = "1";
    @XmlAttribute(name = "UnitWeightUOM")
    private String unitWeightUOM = "MM";
    @XmlAttribute(name = "UnitWidth")
    private String unitWidth = "1";
    @XmlAttribute(name = "UnitWidthUOM")
    private String unitWidthUOM = "10";
}
