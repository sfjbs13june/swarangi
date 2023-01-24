package com.swarangi.app.model;

public class Student {

    String name;
    String id;
    String std;
    String Schoolname;
    public Student(String name, String id, String std, String schoolname) {
        this.name = name;
        this.id = id;
        this.std = std;
        Schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchoolname() {
        return Schoolname;
    }

    public void setSchoolname(String schoolname) {
        Schoolname = schoolname;
    }

}
