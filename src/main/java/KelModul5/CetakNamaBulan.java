/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelModul5;
import java.util.Scanner;
public class CetakNamaBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka bulan (1-12): ");
        int angkaBulan = scanner.nextInt();
        
        // Panggil method getNamaBulan untuk mendapatkan nama bulan
        String namaBulan = getNamaBulan(angkaBulan);
        
        // Cetak nama bulan jika angka bulan valid, jika tidak, cetak pesan kesalahan
        if (namaBulan != null) {
            System.out.println("Nama bulan: " + namaBulan);
        } else {
            System.out.println("Angka bulan tidak valid.");
        }
        
        scanner.close();
    }
    
    // Method untuk mendapatkan nama bulan berdasarkan angka bulan yang dimasukkan pengguna
    public static String getNamaBulan(int angkaBulan) {
        switch (angkaBulan) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return null; // Angka bulan tidak valid
        }
    }
}
