package KelModul4;
import java.util.Scanner;
public class BilanganPositif {
    public static void main (String[] args){
       Scanner input = new Scanner (System.in);
       int bilangan;
       int JumlahBilangan = 0;
       
    
       do{
           System.out.println("Masukkan bilangan positif: ");
           bilangan = input.nextInt();
           if (bilangan >= 0){
               JumlahBilangan += bilangan;
           }
       }while (bilangan >= 0);
       
       
        System.out.println("jumlah bilangan positif yang dimasukkan adalah: " +JumlahBilangan);
    }
}
