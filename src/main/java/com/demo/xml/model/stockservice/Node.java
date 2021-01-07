package com.demo.xml.model.stockservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlAttribute;


@Getter
@NoArgsConstructor
public class Node {
    @XmlAttribute(name = "AverageCost")
    private String averageCost = "10";
    @XmlAttribute(name = "ShipNode")
    private String shipNode = "66650";
}
