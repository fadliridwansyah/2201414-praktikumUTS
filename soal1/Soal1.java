/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tiga digit integer: ");
        int number = scanner.nextInt();

        while (number < 100 || number > 999) {
            System.out.print("Masukkan tiga digit integer: ");
            number = scanner.nextInt();
        }

        if (cekPalindrom(number)) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }

        scanner.close();
    }

    public static boolean cekPalindrom(int number) {
        int digit1 = number / 100; // Digit pertama
        int digit3 = number % 10; // Digit terakhir

        return digit1 == digit3;
    }

}

