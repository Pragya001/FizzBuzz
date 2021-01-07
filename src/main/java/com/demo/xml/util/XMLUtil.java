package com.demo.xml.util;

import com.demo.xml.model.XMLTemplate;
import com.sun.xml.internal.bind.marshaller.DataWriter;
import org.apache.commons.lang3.StringEscapeUtils;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;


public class XMLUtil {

    public static String XMLToString(Marshaller jaxbMarshaller,
                                     XMLTemplate ObjectModel) throws JAXBException {
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(ObjectModel, stringWriter);

        return StringEscapeUtils.unescapeXml(stringWriter.toString());
    }

    public static Object[] stringToWriter() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        DataWriter dataWriter = new DataWriter(printWriter, "UTF-8", new CharacterEscapeHandlerUtil());

        Object[] writers = {stringWriter, dataWriter};

        return writers;
    }

    public static Marshaller createMarshall(Object objectModel) throws JAXBException{
        Marshaller jaxbMarshaller = JAXBContext.newInstance(objectModel.getClass()).createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        return jaxbMarshaller;
    }

    public static void stringToXMLFile(String xmlSource, String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename+".xml");
        fileWriter.write(xmlSource);
        fileWriter.close();
    }
}
