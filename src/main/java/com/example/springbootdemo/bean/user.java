package com.example.springbootdemo.bean;

public class user {
    private String Id;		//ID序列号
    private String UserName;	//用户名
    private String PassWord;        //用户密码
    private String Sex;		//用户性别
    private String Address;		//用户联系地址
    private String Phone;		//用户联系电话
    private String VX;		//用户联系VX
    private String QQ;
    private String Email;   	//用户电子邮件
    /*public user() {
        Id = "";
        UserName = "";
        PassWord = "";
        Names = "";
        Sex = "";
        Address = "";
        Phone = "";
        VX = "";
        QQ = "";
        Email = "";
    }*/
    public String getId() {
        return Id;
    }
    public void setId(String newId) {
        this.Id = newId;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String newUserName) {
        this.UserName = newUserName;
    }
    public String getPassWord() {
        return PassWord;
    }
    public void setPassWord(String newPassWord) {
        this.PassWord = newPassWord;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String newSex) {
        this.Sex = newSex;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String newAddress) {
        this.Address = newAddress;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String newPhone) {
        this.Phone = newPhone;
    }
    public String getVX() {
        return VX;
    }
    public void setVX(String newVX) {
        this.VX = newVX;
    }
    public String getQQ() {
        return QQ;
    }
    public void setQQ(String newQQ) {
        this.QQ = newQQ;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String newEmail) {
        this.Email = newEmail;
    }

}
