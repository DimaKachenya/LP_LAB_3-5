package com.company.workmen.engener;


import com.company.workmen.WorkMen;

public class Engener extends WorkMen {


    public Engener(int lvlSkills, double salary, String name, String surName, int age, int workExperience) {
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
