package com.deone.leads;

public class Fichier {

    private String fid;
    private String fnom;
    private String fdate;

    public Fichier() {
    }

    public Fichier(String fid, String fnom, String fdate) {
        this.fid = fid;
        this.fnom = fnom;
        this.fdate = fdate;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFnom() {
        return fnom;
    }

    public void setFnom(String fnom) {
        this.fnom = fnom;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }
}
