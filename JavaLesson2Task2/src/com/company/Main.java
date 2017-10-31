package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        StudentConst studik1 = new StudentConst("Emil", "Gasanov", 2, 25);
        StudentConst studik2 = new StudentConst("Emil2", "Hasanov2", 3, 225);
        StudentConst studik3 = new StudentConst("Emil3", "Gasanov3", 4, 11);


        ArrayList<StudentConst> list1 = new ArrayList<>();
        list1.add(studik1);
        list1.add(studik2);
        list1.add(studik3);

        System.out.println(list1);
        System.out.println();

        ArrayList<StudentConst> list2 = SortFilter.sortByAge(list1);
        System.out.println(list2);
        System.out.println();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter first letter");
        String letters=sc1.nextLine();
        ArrayList<StudentConst> list3 = SortFilter.filterByLastName(letters,list1);
        System.out.println(list3);
        System.out.println();


        int avg = SortFilter.averageAge(list1);

        System.out.println("Среднее арифметическое: "+ avg);
        System.out.println();



        }

    }