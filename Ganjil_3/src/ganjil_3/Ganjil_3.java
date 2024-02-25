/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ganjil_3;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Ganjil_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan jam masuk: "); 
        int jamMasuk = scan.nextInt(); 

        System.out.print("Masukan jam keluar: "); 
        int jamKeluar = scan.nextInt(); 
        
        int lamaKerja; 
        
        if (jamMasuk > jamKeluar) { 
            jamKeluar += 12;
        }
        
        lamaKerja = jamKeluar - jamMasuk; 
        
        System.out.println("Lama Bekerja " + lamaKerja + " Jam"); 
    }
}
