package com.testiniumbank.model;

public class Customer {
    private String adSoyad;
    private String tcNo;
    private String musteriNo;
    private int hesapBakiyesi;


    public String aboutCustomer() {
        return "Hoşgeldiniz\t : ";

    }
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }


    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public int getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public int setHesapBakiyesi(int hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
        return hesapBakiyesi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

}



