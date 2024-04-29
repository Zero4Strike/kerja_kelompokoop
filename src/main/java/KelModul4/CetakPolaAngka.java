/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelModul4;

public class CetakPolaAngka {
    public static void main(String[] args) {
        int tinggiSegitiga = 5; // Tinggi segitiga
        
        // Loop untuk mengatur baris
        for (int i = 1; i <= tinggiSegitiga; i++) {
            // Loop untuk mencetak angka pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Pindah ke baris baru setelah mencetak angka pada baris tersebut
            System.out.println();
        }
    }
}
