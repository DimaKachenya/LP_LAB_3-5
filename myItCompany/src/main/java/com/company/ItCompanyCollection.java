package com.company;

import com.company.workmen.WorkMen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ItCompanyCollection implements Serializable {
    public List<WorkMen> myList;

    public ItCompanyCollection() {
        this.myList = new ArrayList();
    }

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
