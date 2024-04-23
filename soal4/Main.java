/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsno4;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Balok Balok1 = new Balok(1, 1, 1);
        System.out.println("Balok dengan panjang : " + Balok1.getPanjang() + ", lebar : " + Balok1.getLebar() 
        +" dan tinggi : " + Balok1.getTinggi() + ". Luasnya : " + Balok1.getLuas() 
        + ", sedangkan kelilingnya : " + Balok1.getKeliling() + " dan volumenya: " + Balok1.getVolume());

        Balok Balok2 = new Balok(30, 40, 50);
        System.out.println("Balok dengan panjang : " + Balok2.getPanjang() + ", lebar : " + Balok2.getLebar() 
        +" dan tinggi : " + Balok2.getTinggi() + ". Luasnya : " + Balok2.getLuas() 
        + ", sedangkan kelilingnya : " + Balok2.getKeliling() + " dan volumenya: " + Balok2.getVolume());

        Balok Balok3 = new Balok(25, 35, 45);
        System.out.println("Balok dengan panjang : " + Balok3.getPanjang() + ", lebar : " + Balok3.getLebar() 
        +" dan tinggi : " + Balok3.getTinggi() + ". Luasnya : " + Balok3.getLuas() 
        + ", sedangkan kelilingnya : " + Balok3.getKeliling() + " dan volumenya: " + Balok3.getVolume());
    }
}
