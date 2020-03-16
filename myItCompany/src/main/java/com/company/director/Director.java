package com.company.director;

import com.company.ItCompanyCollection;
import com.company.workmen.WorkMen;

import java.util.Comparator;

public class Director {
    public void countWorkMen(ItCompanyCollection myList)
    {
        if(myList.myList.isEmpty())
        {
            System.out.println("коллекция пустая");
            return;
        }
        else
        {
            System.out.println("В компании "+myList.myList.size()+" работяг");
        }
    }

    public void sortMyCompanyBySalary(ItCompanyCollection myList)
    {
        myList.myList.sort(new Comparator<WorkMen>() {
            @Override
            public int compare(WorkMen o1, WorkMen o2) {
                return o1.getSalary()<o2.getSalary()? -1:(o1.getSalary()>o2.getSalary()?1:0);
            }
        });
    }
    public void sortMyCompanyByLvlSkills(ItCompanyCollection myList)
    {
        myList.myList.sort(new Comparator<WorkMen>() {
            @Override
            public int compare(WorkMen o1, WorkMen o2) {
                return o1.getLvlSkills()<o2.getLvlSkills()? -1:(o1.getLvlSkills()>o2.getLvlSkills()?1:0);
            }
        });
    }


}