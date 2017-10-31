package com.company;

import java.util.ArrayList;

public class SortFilter {

    public static ArrayList<StudentConst> sortByAge (ArrayList<StudentConst> list) {
        list.sort(new SortByAge());
        return list;
    }

    public static ArrayList<StudentConst> filterByLastName (String letters, ArrayList<StudentConst> list) {

        ArrayList<StudentConst> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSecondname().startsWith(letters)) {
                list2.add(list.get(i));
            }
        }

        return list2;
    }


    public static int averageAge(ArrayList<StudentConst> list)
    {
        int ageSum = 0;
        int studentCount = 0;
        for (int i = 0; i < list.size(); i++) {
            ageSum += list.get(i).getAge();
            studentCount++;
        }
        return ageSum/studentCount;
    }
}
