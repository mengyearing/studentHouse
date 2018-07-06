package com.myy.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Meeting implements Serializable {
    private String meetid;

    private String meetstuentid;

    private String meetmasterid;

    private String meethouseid;

    private String meettime;

    private String meethouseadd;

    private String meethousehold;

    private String meethousetype;

    private String meethousemastername;

    private String meetstudentname;

    private Double meethouseprice;

    private String meethouseinfo;

    private static final long serialVersionUID = 1L;

    public String getMeetid() {
        return meetid;
    }

    public void setMeetid(String meetid) {
        this.meetid = meetid;
    }

    public String getMeetstuentid() {
        return meetstuentid;
    }

    public void setMeetstuentid(String meetstuentid) {
        this.meetstuentid = meetstuentid;
    }

    public String getMeetmasterid() {
        return meetmasterid;
    }

    public void setMeetmasterid(String meetmasterid) {
        this.meetmasterid = meetmasterid;
    }

    public String getMeethouseid() {
        return meethouseid;
    }

    public void setMeethouseid(String meethouseid) {
        this.meethouseid = meethouseid;
    }

    public String getMeettime() {
        return meettime;
    }

    public void setMeettime(String meettime) {
        this.meettime = meettime;
    }

    public String getMeethouseadd() {
        return meethouseadd;
    }

    public void setMeethouseadd(String meethouseadd) {
        this.meethouseadd = meethouseadd;
    }

    public String getMeethousehold() {
        return meethousehold;
    }

    public void setMeethousehold(String meethousehold) {
        this.meethousehold = meethousehold;
    }

    public String getMeethousetype() {
        return meethousetype;
    }

    public void setMeethousetype(String meethousetype) {
        this.meethousetype = meethousetype;
    }

    public String getMeethousemastername() {
        return meethousemastername;
    }

    public void setMeethousemastername(String meethousemastername) {
        this.meethousemastername = meethousemastername;
    }

    public String getMeetstudentname() {
        return meetstudentname;
    }

    public void setMeetstudentname(String meetstudentname) {
        this.meetstudentname = meetstudentname;
    }

    public Double getMeethouseprice() {
        return meethouseprice;
    }

    public void setMeethouseprice(Double meethouseprice) {
        this.meethouseprice = meethouseprice;
    }

    public String getMeethouseinfo() {
        return meethouseinfo;
    }

    public void setMeethouseinfo(String meethouseinfo) {
        this.meethouseinfo = meethouseinfo;
    }
}