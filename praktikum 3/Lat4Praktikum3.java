
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gaida
 */
public class Lat4Praktikum3 {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in).useDelimiter("\n");
System.out.println("Apakah anda mahasiswa ITS Mandiri + GAIDA HAUDATUL JANNAH");
String jawaban = scan.next();
if ("Y".equals(jawaban)){
System.out.println("Selamat berjuang di ITS Mandiri      ");
}else{
System.out.println("Selamat datang di     ");
}
}
}

