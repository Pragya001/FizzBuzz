package com.demo.xml.model.stockservice;

import lombok.Getter;
import javax.xml.bind.annotation.XmlElement;

@Getter
public class ItemList {
    @XmlElement
    private Item Item;

    public ItemList() {
        this.Item = new Item();
    }
}
