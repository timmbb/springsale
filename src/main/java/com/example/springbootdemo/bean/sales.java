package com.example.springbootdemo.bean;

public class sales {
    private String sid;
    private String sname;
    private String spassword;

    public String getsid() {
        return sid;
    }

    public void setsid(String sid) {
        this.sid = sid;
    }

    public String getsname() {
        return sname;
    }

    public void setsname(String sname) {
        this.sname = sname;
    }

    public String getspassword() {
        return spassword;
    }

    public void setspassword(String spassword) {
        this.spassword = spassword;
    }
}
