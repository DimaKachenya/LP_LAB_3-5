package com.company.workmen;

import com.company.workmen.engener.Engener;
import com.company.workmen.programmer.classification.Junior;
import com.company.workmen.programmer.classification.Middle;
import com.company.workmen.programmer.classification.Senior;
import com.company.workmen.sysadmin.SysAdmin;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SysAdmin.class),
        @JsonSubTypes.Type(value = Engener.class),
        @JsonSubTypes.Type( value = Junior.class),
        @JsonSubTypes.Type( value = Middle.class),
        @JsonSubTypes.Type( value = Senior.class),
})
public abstract class WorkMen implements IWorkMen, Serializable {

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        for (int i = 0; i < name.length(); i++)
            if (name.charAt(i) == '.' || name.charAt(i) == '!' || name.charAt(i) == '>'
                    || name.charAt(i) == '<' || name.charAt(i) == ',' || name.charAt(i) == '?'
                    || name.charAt(i) == '*' || name.charAt(i) == '/' || name.charAt(i) == '9'
                    || name.charAt(i) == '+' || name.charAt(i) == '@' || name.charAt(i) == '$'
                    || name.charAt(i) == '`' || name.charAt(i) == '"' || name.charAt(i) == '['
                    || name.charAt(i) == ']' || name.charAt(i) == '{' || name.charAt(i) == '}'
                    || name.charAt(i) == '1' || name.charAt(i) == '2' || name.charAt(i) == '3'
                    || name.charAt(i) == '4' || name.charAt(i) == '5' || name.charAt(i) == '6'
                    || name.charAt(i) == '7' || name.charAt(i) == '8'
            )
                return;
        Name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        for (int i = 0; i < surName.length(); i++)
            if (surName.charAt(i) == '.' || surName.charAt(i) == '!' || surName.charAt(i) == '>'
                    || surName.charAt(i) == '<' || surName.charAt(i) == ',' || surName.charAt(i) == '?'
                    || surName.charAt(i) == '*' || surName.charAt(i) == '+' || surName.charAt(i) == '/'
                    || surName.charAt(i) == '@' || surName.charAt(i) == '$' || surName.charAt(i) == '`'
                    || surName.charAt(i) == '"' || surName.charAt(i) == '[' || surName.charAt(i) == ']'
                    || surName.charAt(i) == '{' || surName.charAt(i) == '}' || surName.charAt(i) == '9'
                    || surName.charAt(i) == '1' || surName.charAt(i) == '2' || surName.charAt(i) == '3'
                    || surName.charAt(i) == '4' || surName.charAt(i) == '5' || surName.charAt(i) == '6'
                    || surName.charAt(i) == '7' || surName.charAt(i) == '8'
            )
                return;
        SurName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 40)
            this.age = age;
        else
            System.out.println("Ваш возраст нам не подходит");
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getLvlSkills() {
        return lvlSkills;
    }

    public void setLvlSkills(int lvlSkills) {
        this.lvlSkills = lvlSkills;
    }

    @Override
    public String toString() {

        return "lvlSkills=" + lvlSkills +
                ", salary=" + salary +
                ", Name='" + Name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience + " yers";
    }

    public WorkMen(int lvlSkills, double salary, String name, String surName, int age, int workExperience) {
        this.lvlSkills = lvlSkills;
        this.salary = salary;
        Name = name;
        SurName = surName;
        this.age = age;
        this.workExperience = workExperience;
    }

    private int lvlSkills;
    private double salary;//зарплата
    private String Name;//имя
    private String SurName;//фамилия
    private int age;//возраст
    private int workExperience;//опыт работы

    public abstract void doWork();

    public abstract void whoIam();
}