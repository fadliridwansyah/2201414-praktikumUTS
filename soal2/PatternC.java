/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patternc;

/**
 *
 * @author Lenovo
 */
public class PatternC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int baris = 6;
        for (int i = 1; i <= baris; i++) {
            // Menentukan jumlah spasi yang harus dicetak sebelum angka
            for (int k = 1; k <= baris - i; k++) {
                System.out.print(" ");
            }
            // Mencetak angka dalam urutan menurun
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
