package com.haitnn2008110232.tuan8;

public class Employee extends Person{
    protected int luong;
   
    public String toString() {
        String s;
        s = name +","+birthday;
        s += ","+luong;
        return s;
        
    }
}
