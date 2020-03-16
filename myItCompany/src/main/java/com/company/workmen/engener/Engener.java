package com.company.workmen.engener;


import com.company.workmen.WorkMen;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Engener extends WorkMen {

@JsonCreator
    public Engener(@JsonProperty("lveSkills")int lvlSkills, @JsonProperty("salary")double salary,@JsonProperty("name") String name,@JsonProperty("surName") String surName, @JsonProperty("age")int age,@JsonProperty("workExperience") int workExperience) {
        super(lvlSkills, salary, name, surName, age, workExperience);
    }

    @Override
    public void doWork() {
        System.out.println("Я инжинерю");
    }

    @Override
    public void whoIam() {
        System.out.println("Я инжир");
    }
}
