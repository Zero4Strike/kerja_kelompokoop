package modul4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
 public class JumlahDeret {
    public static void main(String[] args) {
    int i = 1;
    int n = 5;
    int jumlah = 0;
    while (i <= n) {
        jumlah += i;
        i++;
    }
    System.out.println("Jumlah deret: " + jumlah);
    }
}
