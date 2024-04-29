/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelModul5;
import java.util.Scanner;
public class inputBilanganPrima {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();
        
        // Panggil method isPrime untuk memeriksa apakah bilangan tersebut prima atau tidak
        if (isPrime(bilangan)) {
            System.out.println("Bilangan tersebut adalah bilangan prima.");
        } else {
            System.out.println("Bilangan tersebut bukan bilangan prima.");
        }
        
        scanner.close();
    }
    
    // Method untuk memeriksa apakah sebuah bilangan prima atau tidak
    public static boolean isPrime(int n) {
        // Bilangan prima harus lebih besar dari 1
        if (n <= 1) {
            return false;
        }
        
        // Loop untuk memeriksa apakah bilangan dapat dibagi oleh bilangan lain selain 1 dan dirinya sendiri
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
