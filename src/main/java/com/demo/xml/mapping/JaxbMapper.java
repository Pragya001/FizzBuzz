package com.demo.xml.mapping;

import com.demo.xml.model.XMLTemplate;
import com.demo.xml.model.ndoservice.NdoXml;
import com.sun.xml.internal.bind.marshaller.DataWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import static com.demo.xml.util.XMLUtil.*;

public class JaxbMapper {

    private static Logger log = LoggerFactory.getLogger(JaxbMapper.class);

    public static void pojoToXML(XMLTemplate objectModel, String filename) {
        try {
            createMarshall(objectModel).marshal(objectModel, new File(filename+".xml"));
            log.info("XML successfully created");
        } catch (JAXBException e) {
            log.error("Error occurred: {}", e.getMessage());
        }
    }

    public static void pojoToXML(XMLTemplate outerObjectModel, XMLTemplate innerObjectModel, String filename) {
        try {
            Marshaller jaxbMarshaller = createMarshall(innerObjectModel);
            Object[] writers = stringToWriter();
            XMLTemplate otherObject = appendInnerXMLToOuterXML(innerObjectModel, jaxbMarshaller);
            Marshaller jaxbMarshallerOuter = createMarshall(outerObjectModel);
            jaxbMarshallerOuter.marshal(otherObject, (DataWriter) writers[1]);
            stringToXMLFile(writers[0].toString(), filename);
            log.info("XML successfully created");
        } catch (JAXBException e) {
            log.error("Error occurred: {}", e.getMessage());
        } catch (IOException e) {
            log.error("File writing error: {}", e.getMessage());
        }
    }

    private static XMLTemplate appendInnerXMLToOuterXML(XMLTemplate innerObjectModel,
                                                       Marshaller jaxbMarshaller) throws JAXBException {
        NdoXml ndoXml = new NdoXml();
        ndoXml.setBody(XMLToString(jaxbMarshaller, innerObjectModel));

        return ndoXml;
    }
}
