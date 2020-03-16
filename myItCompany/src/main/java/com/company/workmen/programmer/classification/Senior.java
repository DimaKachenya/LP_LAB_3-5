package com.company.workmen.programmer.classification;

import com.company.workmen.programmer.Programmer;
import com.company.workmen.programmer.Spec;

public class Senior extends Programmer {
    public Senior(int lvlSkills, double salary, String name, String surName, int age, int workExperience, String programmingLanguage, Spec spec) {
        super(lvlSkills, salary, name, surName, age, workExperience, programmingLanguage, spec);
    }

    @Override
    public void doWork() {
        System.out.println("Я программирую что-то,и делаю это лучше всех !");
    }

    @Override
    public void whoIam() {
        System.out.println("Я работаю сеньером");
    }


}
