package com.company;

public class StudentConst {

    private String firstname;
    private String secondname;
    private int id;
    private int age;

    public StudentConst(String firstname, String secondname, int id, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.id = id;
        this.age = age;
    }

    public String getFirstname () {
        return this.firstname;
    }

    public String getSecondname () {
        return this.secondname;
    }

    public int getAge () {
        return this.age;
    }

    public int getId () {
        return this.id;
    }


    @Override
    public String toString() {
        return "{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
