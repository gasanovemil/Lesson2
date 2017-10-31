package com.company;

import java.util.Comparator;


public class SortByAge implements Comparator<StudentConst>{
        @Override
        public int compare(StudentConst o1, StudentConst o2) {
            if (o1.getAge()==o2.getAge())
                return 0;
            else if (o1.getAge()>o2.getAge())
                return -1;
            else return 1;
        }
    }

