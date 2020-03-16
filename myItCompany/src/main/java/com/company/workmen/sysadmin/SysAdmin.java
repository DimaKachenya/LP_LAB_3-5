package com.company.workmen.sysadmin;


import com.company.workmen.WorkMen;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SysAdmin extends WorkMen {
    @JsonCreator
    public SysAdmin(@JsonProperty("lvlSkills")int lvlSkills,@JsonProperty("salary") double salary,@JsonProperty("name") String name, @JsonProperty("surName")String surName,@JsonProperty("age") int age,@JsonProperty("workExperience") int workExperience) {
        super(lvlSkills, salary, name, surName, age, workExperience);
    }

    @Override
    public void doWork() {
        System.out.println("Я настраиваю сеть");
    }


    @Override
    public void whoIam() {
        System.out.printf("Я СИСАдмин в IT компании KACHENYA-corporation");
    }
}

