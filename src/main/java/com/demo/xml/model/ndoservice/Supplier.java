package com.demo.xml.model.ndoservice;

import javax.xml.bind.annotation.XmlElement;

public class Supplier {
    @XmlElement(name = "ns0:supplierName")
    private String supplierName = "Oakwood Distribution Ltd";
    @XmlElement(name = "ns0:supplierId")
    private String supplierId = "66650";
    @XmlElement(name = "ns0:enrolmentStatus")
    private String enrolmentStatus = "Active";
    @XmlElement(name = "ns0:mSKUId")
    private String mSKUId = "8806090196003";
}
