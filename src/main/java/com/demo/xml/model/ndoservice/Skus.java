package com.demo.xml.model.ndoservice;

import javax.xml.bind.annotation.XmlElement;

public class Skus {
    @XmlElement(name = "ns0:skuId")
    private String skuId = "761-5523";
    @XmlElement(name = "ns0:organization_code")
    private String organization_code = "UKM";
    @XmlElement(name = "ns0:iccCategoryId")
    private String iccCategoryId = "Mobile Phone";
    @XmlElement(name = "ns0:productStatus")
    private String productStatus = "Active";
    @XmlElement(name = "ns0:fulfilledByTesco")
    private String fulfilledByTesco = "N";
    @XmlElement(name = "ns0:productType")
    private String productType = "";
    @XmlElement(name = "ns0:activeDDSupplierExists")
    private String activeDDSupplierExists = "Y";
    @XmlElement(name = "ns0:suppliers")
    private Supplier supplier;
    @XmlElement(name = "ns0:warehouseDetails")
    private String warehouseDetails = "";

    public Skus() {
        this.supplier = new Supplier();
    }
}
