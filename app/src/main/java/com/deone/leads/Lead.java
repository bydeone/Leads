package com.deone.leads;

public class Lead {
    private String lid;
    private String lnom;
    private String ladresse;
    private String lcp;
    private String lvill;
    private String ltelephon;
    private String lactivite;
    private String lcodenaf;
    private String lcommentaire;
    private String ldate;

    public Lead() {
    }

    public Lead(String lid, String lnom, String ladresse, String lcp, String lvill, String ltelephon, String lactivite, String lcodenaf, String lcommentaire, String ldate) {
        this.lid = lid;
        this.lnom = lnom;
        this.ladresse = ladresse;
        this.lcp = lcp;
        this.lvill = lvill;
        this.ltelephon = ltelephon;
        this.lactivite = lactivite;
        this.lcodenaf = lcodenaf;
        this.lcommentaire = lcommentaire;
        this.ldate = ldate;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getLnom() {
        return lnom;
    }

    public void setLnom(String lnom) {
        this.lnom = lnom;
    }

    public String getLadresse() {
        return ladresse;
    }

    public void setLadresse(String ladresse) {
        this.ladresse = ladresse;
    }

    public String getLcp() {
        return lcp;
    }

    public void setLcp(String lcp) {
        this.lcp = lcp;
    }

    public String getLvill() {
        return lvill;
    }

    public void setLvill(String lvill) {
        this.lvill = lvill;
    }

    public String getLtelephon() {
        return ltelephon;
    }

    public void setLtelephon(String ltelephon) {
        this.ltelephon = ltelephon;
    }

    public String getLactivite() {
        return lactivite;
    }

    public void setLactivite(String lactivite) {
        this.lactivite = lactivite;
    }

    public String getLcodenaf() {
        return lcodenaf;
    }

    public void setLcodenaf(String lcodenaf) {
        this.lcodenaf = lcodenaf;
    }

    public String getLcommentaire() {
        return lcommentaire;
    }

    public void setLcommentaire(String lcommentaire) {
        this.lcommentaire = lcommentaire;
    }

    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }
}
