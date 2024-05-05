package hitunghurufvokal;

import java.util.Scanner;

public class HitungHurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine().toLowerCase(); // Mengonversi input menjadi huruf kecil untuk memudahkan perhitungan

        int jumlahVokal = hitungVokal(input);
        System.out.println("Jumlah huruf vokal dalam kata atau kalimat tersebut adalah: " + jumlahVokal);
    }

    // Fungsi untuk menghitung jumlah huruf vokal dalam sebuah string
    public static int hitungVokal(String kata) {
        int jumlahVokal = 0;
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }
    
}
