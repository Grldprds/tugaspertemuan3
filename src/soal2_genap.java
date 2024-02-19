/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Geral
 */
public class soal2_genap {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Ranking berapa yang anda dapatkan : ");
        int ranking = input.nextInt();
        
        System.out.print("Apakah naik kelas? (true/false): ");
        boolean naikKelas = input.nextBoolean();
        
         if (rangking == 1 && naikKelas) {
            System.out.println("Selamat! Anda akan mendapatkan hadiah karena meraih rangking 1 dan naik kelas.");
        } else {
            System.out.println("Belum ada hadiah untuk Anda saat ini.");
        }

        input.close();
    }
}
