/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelModul4;

/**
 *
 * @author Lenovo
 */
public class CetakPolaBintang {
     public static void main (String[] args){
        int n = 5;
        for (int i = n; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
             System.out.print("* ");
            }
            System.out.println();
        }
    }
}
