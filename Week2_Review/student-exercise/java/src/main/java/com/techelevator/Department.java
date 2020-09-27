package com.techelevator;

import java.util.List;

public class Department {

    private int departmentId;
    private String name;


    public int getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }


    public Department(int departmentId, String name){
        this.departmentId = departmentId;
        this.name = name;
    }

}
