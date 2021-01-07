package com.demo.xml.util;

import com.demo.xml.model.XMLTemplate;
import com.demo.xml.model.ndoservice.NdoXml;
import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.Before;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import static com.demo.xml.util.XMLUtil.XMLToString;
import static com.demo.xml.util.XMLUtil.createMarshall;
import static org.junit.jupiter.api.Assertions.*;

class XMLUtilTest {

    private XMLTemplate objectModel;

    @Before
    public void setUp() {
        objectModel = new NdoXml();
    }

    public void testXMLToString() {
        try {
            Marshaller jaxbMarshaller = JAXBContext.newInstance(objectModel.getClass()).createMarshaller();
            String actual = XMLToString(jaxbMarshaller, objectModel);
            StringWriter stringWriter = new StringWriter();
            jaxbMarshaller.marshal(objectModel, stringWriter);
            String expected = StringEscapeUtils.unescapeXml(stringWriter.toString());
            assertEquals(actual, expected);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    public void testCreateMarshall() {
        try {
            Marshaller jaxbMarshallerActual = JAXBContext.newInstance(objectModel.getClass()).createMarshaller();
            Marshaller jaxbMarshallerExpected = createMarshall(objectModel);
            assertEquals(jaxbMarshallerActual, jaxbMarshallerExpected);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}