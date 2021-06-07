package com.testiniumbank.model;

public class IndividualCustomer extends Customer {
    private String adres;

    @Override
    public String aboutCustomer() {
        return "Hoşgeldiniz\t : " + getAdSoyad()+
                "\n(Bireysel Müşteri)"+
                "\n TC Kimlik numaranız=" + getTcNo() +
                "\n Ev Adresiniz =" + getAdres()+
                "\n Hesap Bakiyeniz =" + getHesapBakiyesi();
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

}
