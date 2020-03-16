package com.company.workmen.programmer.classification;

import com.company.workmen.programmer.Programmer;
import com.company.workmen.programmer.Spec;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Senior extends Programmer {
    public Senior(@JsonProperty("lveSkills")int lvlSkills, @JsonProperty("salary")double salary, @JsonProperty("name") String name, @JsonProperty("surName") String surName, @JsonProperty("age")int age, @JsonProperty("workExperience") int workExperience, @JsonProperty("programmingLanguage")String programmingLanguage, @JsonProperty("spec") Spec spec) {
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
