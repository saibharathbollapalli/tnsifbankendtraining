package com.tns.oops.encapsulation;

public class Employee {
    private int sid;
    private String sname;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public void display() {
        System.out.println("ID: " + sid);
        System.out.println("Name: " + sname);
    }


   
}
