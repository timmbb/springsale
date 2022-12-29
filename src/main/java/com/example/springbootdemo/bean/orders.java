package com.example.springbootdemo.bean;

public class orders {

    private String oid;		//ID序列号
    private String pid;
    private String  pName;
    private long price;
    private String amount ;
    private String submittime ;
    private String issales;
    private String Id;
    private String sid;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public void setpid(String newpid){
        this.pid = newpid;
    }
    public String getpid(){
        return pid;
    }
    public void setpName(String newpName) {
        this.pName = newpName;
    }
    public String getpName() {
        return pName;
    }

    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getAmount() {
        return amount;
    }

    public String getSubmittime() {
        return submittime;
    }
    public void setSubmittime(String submittime) {
        this.submittime = submittime;
    }

    public String getIssales() {
        return issales;
    }
    public void setIssales(String issales) {
        this.issales = issales;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
