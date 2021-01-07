package com.demo.xml.model.stockservice;

import lombok.Getter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemNode")
@Getter
public class ItemNode {
    @XmlAttribute(name = "ItemID")
    private String itemID = "209-8556";
    @XmlAttribute(name = "OrganizationCode")
    private String organizationCode="TESCOUK";
    @XmlElement
    private Nodes Nodes;
    @XmlElement
    private ItemNodeDefn ItemNodeDefn;

    public ItemNode() {
        this.Nodes = new Nodes();
        this.ItemNodeDefn = new ItemNodeDefn();
    }
}
