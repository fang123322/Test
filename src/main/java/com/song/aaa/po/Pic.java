package com.song.aaa.po;

public class Pic {
    private Integer picno;

    private String pname;

    private String savepath;

    private String fm;

    private Integer empid;

    private String showname;

    public Integer getPicno() {
        return picno;
    }

    public void setPicno(Integer picno) {
        this.picno = picno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getSavepath() {
        return savepath;
    }

    public void setSavepath(String savepath) {
        this.savepath = savepath == null ? null : savepath.trim();
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm == null ? null : fm.trim();
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }
}