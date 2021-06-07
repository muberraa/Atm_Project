package com.testiniumbank.model;

public class CorparateCustomer extends Customer{
    private String sirketAdi;


    @Override
    public String aboutCustomer() {
        return "Hoşgeldiniz\t : " + getAdSoyad()+
                "\n(Kurumsal Müşteri)"+
                "\n TC Kimlik numaranız='" + getTcNo() +
                "\n Şirketinizin Adı =" + sirketAdi+
                "\n Hesap Bakiyeniz =" + getHesapBakiyesi();
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

}

