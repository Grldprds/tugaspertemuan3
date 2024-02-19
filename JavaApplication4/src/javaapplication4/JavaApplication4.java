/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Geral
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char karakterA = 'A';
        char karakterB = 'B';

        int kodeAsciiA = (int) karakterA;
        int kodeAsciiB = (int) karakterB;

        int jumlahAscii = kodeAsciiA + kodeAsciiB;

        System.out.println("Kode ASCII dari karakter 'A': " + kodeAsciiA);
        System.out.println("Kode ASCII dari karakter 'B': " + kodeAsciiB);
        System.out.println("Jumlah ASCII dari karakter 'A' dan 'B': " + jumlahAscii);
    }
    
}
