/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ganjil_2;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Ganjil_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hasil;
        
        System.out.println("Masukan sisi: ");
        int sisi1 = scan.nextInt();
        int sisi2 = scan.nextInt();
        int sisi3 = scan.nextInt();
        
        if (sisi1 == sisi2 && sisi1 == sisi3 && sisi2 == sisi3) {
            hasil = "Termasuk kubus";
        } else { 
            hasil = "Bukan termasuk kubus";
        }
        
        System.out.println(hasil); 
    }
}
