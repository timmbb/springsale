package com.example.springbootdemo.bean;

public class product {

    private String pid;		//ID序列号
    private String pName;	//名
    private String  pType;		//类别
    private String pAuthor;		//作者
    private long pPrice ;		//价格
    private long pAmount ;		//总数量
    /**
      初始化
     */
    /*
    public product() {
        pid = "";
        pName = "";
        pType = "";
        pAuthor = "";
        pPrice = 0;
        pAmount = 0;
    }*/
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
    public void setpType(String newpType) {
        this.pType = newpType;
    }
    public String getpType() {
        return pType;
    }
    public void setpAuthor(String newpAuthor) {
        this.pAuthor = newpAuthor;
    }
    public String getpAuthor() {
        return pAuthor;
    }
    public void setpPrice(long newpPrice) {
        this.pPrice = newpPrice;
    }
    public long getpPrice() {
        return pPrice;
    }
    public void setpAmount(long newpAmount) {
        this.pAmount = newpAmount;
    }
    public long getpAmount() {
        return pAmount;
    }

}