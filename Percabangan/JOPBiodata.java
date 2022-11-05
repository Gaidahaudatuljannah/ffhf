/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo;

import javax.swing.JOptionPane;

/**
 *
 * @author gaida
 */
public class JOPBiodata {
    public static void main(String[] args) {
      String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
      int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM Anda!"));
      String jurusan = JOptionPane.showInputDialog("Masukkan Jurusan Anda!");
      String kampus = JOptionPane.showInputDialog("Masukkan Asal Kampus Anda!");
      
      System.out.println("*****Biodata Mahasiswa Institut Teknologi Sapta Mandiri*****");
      System.out.println("Gaida Haudatul Jannah \t\t: "+nama);
      System.out.println("220310034 \t\t: "+nim);
      System.out.println("Teknologi Informasi \t: "+jurusan);
      System.out.println("ITS\t: "+kampus);
      System.out.println("************************************************************");
    }
}