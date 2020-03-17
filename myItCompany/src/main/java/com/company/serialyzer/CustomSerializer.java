package com.company.serialyzer;

import com.company.ItCompanyCollection;
import com.company.Main;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class CustomSerializer {
    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void byteSerializer(ItCompanyCollection myList) throws IOException {
        logger.info("Start byte serializer");
        FileOutputStream fos = new FileOutputStream("index.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(myList);
        oos.flush();
        oos.close();
        logger.info("End byte serialyzer");
    }

    public static ItCompanyCollection byteDeserializer() throws IOException, ClassNotFoundException {
        logger.info("Start byte deserialyzer");
        ItCompanyCollection myList = new ItCompanyCollection();
        FileInputStream fis = new FileInputStream("index.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        myList = (ItCompanyCollection) ois.readObject();
        ois.close();
        System.out.println("Input collection from hzchto: ");
        myList.PrintAllInformationAboutWorkMen();
        logger.info("End byte deserialyzer");

        return myList;
    }

    public static void jsonSerializer(ItCompanyCollection myCompany) throws IOException {
        logger.info("Start serialize on JSON");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.writeValue(new File("myItCompany.json"), myCompany);
        logger.info("End serialize on json");

    }

    public static ItCompanyCollection jsonDeserializer() throws IOException {
        logger.info("Start json deserializer");
        ItCompanyCollection myCollection;
        ObjectMapper objectMapper = new ObjectMapper();
        myCollection = objectMapper.readValue(new File("myItCompany.json"), ItCompanyCollection.class);
        logger.info("End json deserializer");
        System.out.println("Input collection from Json: ");
        myCollection.PrintAllInformationAboutWorkMen();

        return myCollection;
    }

    public static void xmlSerializer(ItCompanyCollection myList) throws IOException {
        logger.info("Start xml serialize");
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(new File("myItCompany.xml"), myList);
        logger.info("End xml serialize");
    }

    public static ItCompanyCollection xmlDeserializer() throws IOException {
        ItCompanyCollection myCompany;
        XmlMapper mapper = new XmlMapper();
        FileReader fr = new FileReader(new File("myItCompany.xml"));
        int code = 0;
        String xml = "";
        while (fr.read() != -1) {
            code = fr.read();
            xml += (char) code;
        }
        System.out.println(xml);
        myCompany=mapper.readValue(xml,ItCompanyCollection.class);
        myCompany.PrintAllInformationAboutWorkMen();
        return myCompany;
    }


}
