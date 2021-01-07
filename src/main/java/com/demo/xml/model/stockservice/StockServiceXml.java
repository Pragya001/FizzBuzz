package com.demo.xml.model.stockservice;

import com.demo.xml.model.XMLTemplate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Getter
@XmlRootElement(name = "ItemCost")
@XmlAccessorType(XmlAccessType.FIELD)
public class StockServiceXml implements Serializable, XMLTemplate {
    @XmlAttribute(name = "xmlns:ns0")
    private String ns0 = "http://www.tibco.com/schemas/Tesco_v1.4.3/Schemas/Common/MessageModel/Schema.xsd";
    @XmlAttribute(name = "xmlns:ns1")
    private String ns1 = "http://www.tesco.com/Integration/CanonicalModel/Product";
    @XmlAttribute(name = "BatchID")
    private String batchID = "425026987";
    @XmlAttribute(name = "MessageType")
    private String messageType = "PIM12";
    @XmlElement
    private ItemList ItemList;
    @XmlElement
    private ItemNode ItemNode;

    public StockServiceXml() {
        this.ItemList = new ItemList();
        this.ItemNode = new ItemNode();
    }
}
