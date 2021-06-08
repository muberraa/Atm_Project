package com.testiniumbank.model;

import java.util.Scanner;

public class Transactions {
    Customer customer;
    Scanner scan = new Scanner(System.in);

    public void withDraw(Customer customer){
        System.out.println("Çekmek istediğiniz miktarı giriniz :");
        int miktar1 = scan.nextInt();
        if (customer.getHesapBakiyesi()<= miktar1){
            System.out.println("Bakiyeniz Yetersiz");
        }
        else {
            int yeniBakiye = customer.setHesapBakiyesi(customer.getHesapBakiyesi() - miktar1);
            System.out.println("Yeni Bakiyeniz :" + customer.getHesapBakiyesi());
        }


    }
    public void deposit(Customer customer){
        System.out.println("Yatırmak istediğiniz miktarı giriniz :");
        int miktar2 = scan.nextInt();
        int yeniBakiye = customer.setHesapBakiyesi(customer.getHesapBakiyesi()+miktar2);
        System.out.println("Yeni Bakiyeniz :"+ customer.getHesapBakiyesi());


    }
}
