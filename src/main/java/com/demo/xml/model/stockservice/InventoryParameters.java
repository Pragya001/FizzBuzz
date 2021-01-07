package com.demo.xml.model.stockservice;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InventoryParameters")
@Getter
@NoArgsConstructor
public class InventoryParameters {
    @XmlAttribute(name = "ATPRule")
    private String ATPRule = "TESCO_ATP_RULE";
    @XmlAttribute(name = "AdvanceNotificationTime")
    private String advanceNotificationTime = "0";
    @XmlAttribute(name = "FutureSafetyFactorPercentage")
    private String futureSafetyFactorPercentage = "";
    @XmlAttribute(name = "InventoryMonitorRule")
    private String inventoryMonitorRule = "TESCO_GLOBAL_MONITOR";
    @XmlAttribute(name = "LeadTime")
    private String leadTime = "1";
    @XmlAttribute(name = "MinNotificationTime")
    private String minNotificationTime = "0";
    @XmlAttribute(name = "NodeLevelInventoryMonitorRule")
    private String nodeLevelInventoryMonitorRule = "TESCO_NODE_MONITOR";
    @XmlAttribute(name = "OnhandSafetyFactorPercentage")
    private String onhandSafetyFactorPercentage = "";
    @XmlAttribute(name = "OnhandSafetyFactorQuantity")
    private String onhandSafetyFactorQuantity = "";
    @XmlAttribute(name = "UseUnplannedInventory")
    private String useUnplannedInventory = "N";
}
