/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Lenovo
 */
public class ProgramSalah3 {
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        
        if(x<y){
            System.out.println("X lebih kecil dari Y");
        }
        else{
            System.out.println("X lebih besar dari Y");
        }
        
        int z = x+y;
        
        for (int i = 0; i <= z; i++){
            System.out.print(i+" ");
        }
    }
}
