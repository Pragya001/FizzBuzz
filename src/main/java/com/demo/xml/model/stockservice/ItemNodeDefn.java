package com.demo.xml.model.stockservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Getter
public class ItemNodeDefn {
    @XmlAttribute(name = "EnrollmentStatus")
    private String enrollmentStatus="Active";
    @XmlAttribute(name = "ItemID")
    private String itemID="209-8556";
    @XmlAttribute(name = "Node")
    private String node="66650";
    @XmlAttribute(name = "OrganizationCode")
    private String organizationCode="TESCOUK";
    @XmlAttribute(name = "UnitOfMeasure")
    private String unitOfMeasure="Each";
    @XmlElement
    private ExtnNode Extn;

    public ItemNodeDefn() {
        this.Extn = new ExtnNode();
    }

    @Getter
    @NoArgsConstructor
    public static class ExtnNode {
        @XmlAttribute(name = "ExtnItemCost")
        private String extnItemCost="10";
    }
}
