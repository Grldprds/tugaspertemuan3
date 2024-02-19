package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ranking berapa yang anda dapatkan : ");
        int ranking = scanner.nextInt();
        
        System.out.print("Apakah naik kelas? (true/false): ");
        boolean naikKelas = scanner.nextBoolean();
        
         if (ranking == 1 && naikKelas) {
            System.out.println("Selamat! Anda akan mendapatkan hadiah");
        } else {
            System.out.println("Belum ada hadiah untuk Anda saat ini.");
        }

        scanner.close();    
    }
    
}
