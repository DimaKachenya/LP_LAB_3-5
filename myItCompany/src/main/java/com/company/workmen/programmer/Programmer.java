package com.company.workmen.programmer;

import com.company.workmen.WorkMen;

public abstract class Programmer extends WorkMen {
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public Programmer(int lvlSkills, double salary, String name, String surName, int age, int workExperience, String programmingLanguage, Spec spec) {
        super(lvlSkills, salary, name, surName, age, workExperience);
        this.programmingLanguage = programmingLanguage;
        this.spec = spec;
    }

    String programmingLanguage;
    Spec spec;

    @Override
    public abstract void doWork();

    @Override
    public abstract void whoIam();

    @Override
    public String toString() {
        return "lvlSkills=" + getLvlSkills() +
                ", salary=" + getSalary() +
                ", Name='" + getName() + '\'' +
                ", SurName='" + getSurName() + '\'' +
                ", age=" + getAge() +
                ", workExperience=" + getWorkExperience() + " yers" +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", spec=" + spec
                ;
    }
}