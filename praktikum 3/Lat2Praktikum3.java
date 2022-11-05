
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gaida
 */
public class Lat2Praktikum3 {
    public static void main(String[] args){
        var belanja = 0;
      Scanner scan = new Scanner(System.in).useDelimiter("\n");
      System.out.print("Total Belanjaan: Rp");
      belanja = scan.nextInt();
      if (belanja > 100000){
          System.out.println("Selamat, anda mendapatkandiskon!");
      }
      System.out.println("Terima Kasih..");
    }
}    