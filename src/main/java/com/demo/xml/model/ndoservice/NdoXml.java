package com.demo.xml.model.ndoservice;

import com.demo.xml.model.XMLTemplate;
import lombok.Setter;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Setter
@XmlRootElement(name = "ns0:ActivityInput")
public class NdoXml implements Serializable, XMLTemplate {
    @XmlAttribute(name = "xmlns:ns0")
    private String ns0 = "http://www.tibco.com/namespaces/tnt/plugins/jms";
    @XmlElement(name = "Body")
    private String Body;
}
