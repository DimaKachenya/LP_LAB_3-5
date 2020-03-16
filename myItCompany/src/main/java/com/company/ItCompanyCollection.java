package com.company;

import com.company.workmen.WorkMen;

import java.io.Serializable;
import java.util.ArrayList;

public class ItCompanyCollection implements Serializable {
    public ArrayList<WorkMen> myList = new ArrayList();

    public void Add(WorkMen workMen) {
        myList.add(workMen);
    }

    public void Clear() {
        myList.clear();
    }

    public void PrintAllInformationAboutWorkMen() {
        for (WorkMen item :
                myList) {
            System.out.println(item.toString());
        }
    }
}
