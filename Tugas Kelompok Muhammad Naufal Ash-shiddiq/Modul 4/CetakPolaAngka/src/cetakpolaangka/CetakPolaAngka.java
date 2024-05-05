package cetakpolaangka;

public class CetakPolaAngka {
    public static void main(String[] args) {
        int tinggi = 5;
        int baris  = 1;

        for(; baris <= tinggi; baris++){
        int angka = 1;

        while (angka <= baris) {
        System.out.print(angka + " ");
        angka++;
        }

        System.out.println();
        } 
    }
    
}
