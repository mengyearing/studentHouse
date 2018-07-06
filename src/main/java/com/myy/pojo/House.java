package com.myy.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class House implements Serializable {
    private String houseid;

    private String houseusername;

    private String houseadd;

    private String houseinfo;

    private Double houseprice;

    private String housetype;

    private String househostname;

    private String household;

    private String househostid;

    private Integer housestatement;

    private static final long serialVersionUID = 1L;

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getHouseusername() {
        return houseusername;
    }

    public void setHouseusername(String houseusername) {
        this.houseusername = houseusername;
    }

    public String getHouseadd() {
        return houseadd;
    }

    public void setHouseadd(String houseadd) {
        this.houseadd = houseadd;
    }

    public String getHouseinfo() {
        return houseinfo;
    }

    public void setHouseinfo(String houseinfo) {
        this.houseinfo = houseinfo;
    }

    public Double getHouseprice() {
        return houseprice;
    }

    public void setHouseprice(Double houseprice) {
        this.houseprice = houseprice;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getHousehostname() {
        return househostname;
    }

    public void setHousehostname(String househostname) {
        this.househostname = househostname;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getHousehostid() {
        return househostid;
    }

    public void setHousehostid(String househostid) {
        this.househostid = househostid;
    }

    public Integer getHousestatement() {
        return housestatement;
    }

    public void setHousestatement(Integer housestatement) {
        this.housestatement = housestatement;
    }
}