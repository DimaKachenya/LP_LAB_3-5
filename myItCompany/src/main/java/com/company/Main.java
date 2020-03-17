package com.company;


import com.company.director.Director;
import com.company.serialyzer.CustomSerializer;
import com.company.workmen.engener.Engener;
import com.company.workmen.programmer.Spec;
import com.company.workmen.programmer.classification.Junior;
import com.company.workmen.programmer.classification.Middle;
import com.company.workmen.programmer.classification.Senior;
import com.company.workmen.sysadmin.SysAdmin;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Main {

    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        logger.info("Main method start ");
        Director director = new Director();
        SysAdmin istomin = new SysAdmin(4, 4000, "Ily", "Istomin", 19, 3);
        Engener arhipov = new Engener(3, 3000, "Stepan", "Arhipov", 20, 4);
        Junior romanitsy = new Junior(5, 700, "Valera", "Romanitsky", 19, 4, "C#", Spec.backEnd);
        Middle ostrovsky = new Middle(6, 1500, "Leha", "Ostrovsky", 19, 4, "JavaScript", Spec.frontEnd);
        Senior kachenya = new Senior(10, 10000, "Dima", "Kachenya", 19, 5, "Java", Spec.backEnd);
        ItCompanyCollection myList = new ItCompanyCollection();
        myList.Add(istomin);
        myList.Add(arhipov);
        myList.Add(romanitsy);
        myList.Add(ostrovsky);
        myList.Add(kachenya);

        CustomSerializer.byteSerializer(myList);
        ItCompanyCollection epam = CustomSerializer.byteDeserializer();


        CustomSerializer.jsonSerializer(myList);
        ItCompanyCollection google = CustomSerializer.jsonDeserializer();



        CustomSerializer.xmlSerializer(myList);
        ItCompanyCollection windows=CustomSerializer.xmlDeserializer();


        logger.info("Main method end");

    }
}

