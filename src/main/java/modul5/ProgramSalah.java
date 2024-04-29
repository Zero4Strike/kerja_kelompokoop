/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Lenovo
 */
public class ProgramSalah {
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        
        int z = x + y;
        System.out.println("Hasil Penjumlahan: "+z);
        
        if (z >10){
            System.out.println("Nilai z lebih besar dari 10");
        }
        else{
            System.out.println("Nilai z kurang dari atau sama dengan 10");
        }
        for (int i = 0; i < 5 ; i++){
                System.out.println("iterasi ke-"+i);
        }
    }
}
