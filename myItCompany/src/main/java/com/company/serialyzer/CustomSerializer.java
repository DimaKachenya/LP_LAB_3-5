package com.company.serialyzer;

import com.company.ItCompanyCollection;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.Scanner;

public class CustomSerializer {
    public static void byteSerializer(ItCompanyCollection myList) throws IOException {
        FileOutputStream fos = new FileOutputStream("index.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(myList);
        oos.flush();
        oos.close();
    }

    public static ItCompanyCollection byteDeserializer() throws IOException, ClassNotFoundException {
        ItCompanyCollection myList = new ItCompanyCollection();
        FileInputStream fis = new FileInputStream("index.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        myList = (ItCompanyCollection) ois.readObject();
        ois.close();
        return myList;
    }
    public static void jsonSerializer(ItCompanyCollection myCompany) throws IOException {
        System.out.println("Start serialize on JSON");
        ObjectMapper objectMapper =new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.writeValue(new File("myItCompany.json"),myCompany);
        System.out.println("End serialize on json");

    }




}
