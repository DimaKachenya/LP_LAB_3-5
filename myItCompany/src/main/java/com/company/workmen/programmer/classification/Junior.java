package com.company.workmen.programmer.classification;


import com.company.workmen.programmer.Programmer;
import com.company.workmen.programmer.Spec;

public class Junior extends Programmer {
    public Junior(int lvlSkills, double salary, String name, String surName, int age, int workExperience, String programmingLanguage, Spec spec) {
        super(lvlSkills, salary, name, surName, age, workExperience, programmingLanguage, spec);
    }

    @Override
    public void doWork() {
        System.out.println("Я программирую что-то , но делаю это не очень хорошо");
    }

    @Override
    public void whoIam() {
        System.out.println("Я работаю джун");
    }
}
