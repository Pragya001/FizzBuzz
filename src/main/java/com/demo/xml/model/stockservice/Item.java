package com.demo.xml.model.stockservice;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Getter
public class Item {
    @XmlAttribute(name = "ItemGroupCode")
    private String itemGroupCode = "PROD";
    @XmlAttribute(name = "ItemID")
    private String itemID = "209-8556";
    @XmlAttribute(name = "OrganizationCode")
    private String organizationCode = "TESCOUK";
    @XmlAttribute(name = "UnitOfMeasure")
    private String unitOfMeasure = "Each";
    @XmlElement
    private PrivateInformation PrimaryInformation;
    @XmlElement
    private String Components = "";
    @XmlElement
    private InventoryParameters InventoryParameters;
    @XmlElement
    private ClassificationCodes ClassificationCodes;
    @XmlElement
    private Extn Extn;

    public Item() {
        this.PrimaryInformation = new PrivateInformation();
        this.InventoryParameters = new InventoryParameters();
        this.ClassificationCodes = new ClassificationCodes();
        this.Extn = new Extn();
    }
}
