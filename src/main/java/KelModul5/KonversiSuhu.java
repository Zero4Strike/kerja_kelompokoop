/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KelModul5;
import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        double suhuCelsius = scanner.nextDouble();
        
        // Panggil method konversiCelsiusKeFahrenheit untuk mengonversi suhu dari Celsius ke Fahrenheit
        double suhuFahrenheit = konversiCelsiusKeFahrenheit(suhuCelsius);
        
        // Cetak hasil konversi dengan presisi dua desimal
        System.out.printf("Suhu dalam derajat Fahrenheit: %.2f%n", suhuFahrenheit);
        
        scanner.close();
    }
    
    // Method untuk mengonversi suhu dari Celsius ke Fahrenheit
    public static double konversiCelsiusKeFahrenheit(double suhuCelsius) {
        // Rumus konversi dari Celsius ke Fahrenheit: F = (C * 9/5) + 32
        double suhuFahrenheit = (suhuCelsius * 9 / 5) + 32;
        return suhuFahrenheit;
    }
}
