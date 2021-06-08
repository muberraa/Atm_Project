package com.testiniumbank.mainpage;
import com.testiniumbank.model.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainPage {
    public static void main(String[] args) {
        CorparateCustomer c1 = new CorparateCustomer();
        IndividualCustomer c2 = new IndividualCustomer();
        CorparateCustomer c3 = new  CorparateCustomer();
        IndividualCustomer c4 = new IndividualCustomer();
        CorparateCustomer c5 = new  CorparateCustomer();
        Transactions transactions = new Transactions();
        Customer customer;

        //1.Kurumsal Müşteri
        c1.setMusteriNo("100");
        c1.setAdSoyad("Bülent Ersoy");
        c1.setTcNo("1234567");
        c1.setSirketAdi("A Şirketi");
        c1.setHesapBakiyesi(1000);

        //2.Bireysel Müşteri
        c2.setMusteriNo("200");
        c2.setAdSoyad("Ferhan Şensoy");
        c2.setTcNo("8910111");
        c2.setAdres("İstanbul");
        c2.setHesapBakiyesi(1142);

        //3.Kurumsal Müşteri
        c3.setMusteriNo("300");
        c3.setAdSoyad("Harun Can");
        c3.setTcNo("1314151");
        c3.setSirketAdi("B Şirketi");
        c3.setHesapBakiyesi(2838);

        //4.Bireysel Müşteri
        c4.setMusteriNo("400");
        c4.setAdSoyad("Kobra Murat");
        c4.setTcNo("1718192");
        c4.setAdres("Ankara");
        c4.setHesapBakiyesi(0);

        //5.Kurumsal Müşteri
        c5.setMusteriNo("500");
        c5.setAdSoyad("Seda Sayan");
        c5.setTcNo("2122232");
        c5.setSirketAdi("B Şirketi");
        c5.setHesapBakiyesi(3575);

        HashMap<String, Customer> musteriler = new HashMap<String, Customer>();
        musteriler.put(c1.getMusteriNo(),c1);
        musteriler.put(c2.getMusteriNo(),c2);
        musteriler.put(c3.getMusteriNo(),c3);
        musteriler.put(c3.getMusteriNo(),c4);
        musteriler.put(c4.getMusteriNo(),c5);

        Scanner no = new Scanner(System.in);

        System.out.println("Lütfen Müşteri Numaranızı Giriniz:");
        String mNo = no.nextLine();

        Customer hesap = musteriler.get(mNo);
        System.out.println(hesap.aboutCustomer());

        System.out.println("\nİşlem Tipi Seçiniz: " + "\nPara Yatırmak için (1)" + "\nPara Çekmek için (2)) " + "\nÇıkmak için (3)");
        int islemNo = no.nextInt();

        if (islemNo == 1){
            transactions.deposit(musteriler.get(mNo));
        }
        else if (islemNo==2){
            transactions.withDraw(musteriler.get(mNo));
        }
        else if (islemNo==3){
            System.out.println("Teşekkürler");

        }
        else{
            System.out.println("Lütfen doğru bir değer giriniz");
        }

        }
    }
