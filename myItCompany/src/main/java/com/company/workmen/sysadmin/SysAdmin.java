package com.company.workmen.sysadmin;


import com.company.workmen.WorkMen;

public class SysAdmin extends WorkMen {
    public SysAdmin(int lvlSkills, double salary, String name, String surName, int age, int workExperience) {
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

