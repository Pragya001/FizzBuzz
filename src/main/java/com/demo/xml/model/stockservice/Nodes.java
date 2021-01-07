package com.demo.xml.model.stockservice;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Nodes")
@Getter
public class Nodes {
    @XmlElement
    private Node Node;

    public Nodes() {
        this.Node = new Node();
    }
}
