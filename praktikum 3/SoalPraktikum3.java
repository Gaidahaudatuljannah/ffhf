
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gaida
 */
public class SoalPraktikum3 {
    public static void main(String[] args) {
        Scanner Ke1 = new Scanner (System.in);
        System.out.println("Pilih metode");
        System.out.println("1. luas persegi");
        System.out.println("2. keliling persegi");
        
        System.out.print("pilihan =");
        int pilihan = Ke1.nextInt();
        
        System.out.print("Masukkan panjang sisi persegi =");
        int sisi = Ke1.nextInt();
        
        switch (pilihan){
            case 1 -> System.out.println(sisi * sisi + "cm");
            case 2 -> System.out.println(sisi + sisi + "cm");
            default -> System.out.println("error");
        }   
    }
}

