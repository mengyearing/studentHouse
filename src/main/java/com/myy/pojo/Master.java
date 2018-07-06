package com.myy.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Master implements Serializable {
    private String masterid;

    private String mastrname;

    private Double mastermoney;

    private String masterpassword;

    private String masterphone;

    private String masteremail;

    private static final long serialVersionUID = 1L;

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }

    public String getMastrname() {
        return mastrname;
    }

    public void setMastrname(String mastrname) {
        this.mastrname = mastrname;
    }

    public Double getMastermoney() {
        return mastermoney;
    }

    public void setMastermoney(Double mastermoney) {
        this.mastermoney = mastermoney;
    }

    public String getMasterpassword() {
        return masterpassword;
    }

    public void setMasterpassword(String masterpassword) {
        this.masterpassword = masterpassword;
    }

    public String getMasterphone() {
        return masterphone;
    }

    public void setMasterphone(String masterphone) {
        this.masterphone = masterphone;
    }

    public String getMasteremail() {
        return masteremail;
    }

    public void setMasteremail(String masteremail) {
        this.masteremail = masteremail;
    }
}