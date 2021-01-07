package com.demo.xml.model.stockservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlAttribute;


@Getter
@NoArgsConstructor
public class ClassificationCodes {
    @XmlAttribute(name = "ECCNNo")
    private String ECCNNo = "Pay On Order";
    @XmlAttribute(name = "HarmonizedCode")
    private String harmonizedCode = "Product";
}
