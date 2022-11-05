/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programinput1;

import java.util.Scanner;

/**
 *
 * @author gaida
 */
public class Kelulusan1 {
    public static void main(String[] args) {
    // Buat Scanner
    Scanner inp = new Scanner(System.in);

   // Ambil Nama
   System.out.print("Masukkan nama anda = ");
   String Nama = inp.next();

  // Ambil NIM
  System.out.print("Masukkan NIM = ");
  String nim = inp.next();

  // Ambil Nilai
  System.out.print("Masukkan nilai=");
  int nilai = inp.nextInt(); 

  //print
  if(nilai > 55) {
  System.out.println("Anda lulus ");
}else {
System.out.println("Anda tidak lulus ");
}
}
}

