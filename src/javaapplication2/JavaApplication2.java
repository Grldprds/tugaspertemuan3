/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan pecahan pertama (pisahkan pembilang dan penyebut dengan spasi): ");
        int pecahan1_pembilang = scanner.nextInt();
        int pecahan1_penyebut = scanner.nextInt();

        System.out.print("Masukkan pecahan kedua (pisahkan pembilang dan penyebut dengan spasi): ");
        int pecahan2_pembilang = scanner.nextInt();
        int pecahan2_penyebut = scanner.nextInt();

        System.out.print("Masukkan pecahan ketiga (pisahkan pembilang dan penyebut dengan spasi): ");
        int pecahan3_pembilang = scanner.nextInt();
        int pecahan3_penyebut = scanner.nextInt();

        int penjumlahan_pembilang = pecahan1_pembilang * pecahan2_penyebut * pecahan3_penyebut
                + pecahan2_pembilang * pecahan1_penyebut * pecahan3_penyebut
                + pecahan3_pembilang * pecahan1_penyebut * pecahan2_penyebut;
        int penjumlahan_penyebut = pecahan1_penyebut * pecahan2_penyebut * pecahan3_penyebut;
        System.out.println("Hasil penjumlahan: " + penjumlahan_pembilang + "/" + penjumlahan_penyebut);

        int pengurangan_pembilang = pecahan1_pembilang * pecahan2_penyebut * pecahan3_penyebut
                - pecahan2_pembilang * pecahan1_penyebut * pecahan3_penyebut
                - pecahan3_pembilang * pecahan1_penyebut * pecahan2_penyebut;
        int pengurangan_penyebut = pecahan1_penyebut * pecahan2_penyebut * pecahan3_penyebut;
        System.out.println("Hasil pengurangan: " + pengurangan_pembilang + "/" + pengurangan_penyebut);

        int perkalian_pembilang = pecahan1_pembilang * pecahan2_pembilang * pecahan3_pembilang;
        int perkalian_penyebut = pecahan1_penyebut * pecahan2_penyebut * pecahan3_penyebut;
        System.out.println("Hasil perkalian: " + perkalian_pembilang + "/" + perkalian_penyebut);

        int pembagian_pembilang = pecahan1_pembilang * pecahan2_penyebut * pecahan3_penyebut;
        int pembagian_penyebut = pecahan1_penyebut * pecahan2_pembilang * pecahan3_pembilang;
        System.out.println("Hasil pembagian: " + pembagian_pembilang + "/" + pembagian_penyebut);

        scanner.close();
    }
    
}
