package com.demo.xml.model.ndoservice;

import com.demo.xml.model.XMLTemplate;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "ns0:ProductFeed")
public class ProductFeed implements Serializable, XMLTemplate {
    @XmlAttribute(name = "xmlns:ns0")
    private String ns0 = "http://www.tesco.com/direct/newdo/productFeed";
    @XmlElement(name = "ns0:skus")
    private List<Skus> skus;
    @XmlElement(name = "ns0:batch_id")
    private String batch_id = "425026919";
    @XmlElement(name = "ns0:batchcreation_time")
    private String batchcreation_time = "2020-09-01T12:01:23.301+01:00";

    public ProductFeed() {
        this.skus = new ArrayList<>();
        this.skus.add(new Skus());
        this.skus.add(new Skus());
        this.skus.add(new Skus());
    }
}
