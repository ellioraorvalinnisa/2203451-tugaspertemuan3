/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ganjil_1;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Ganjil_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        boolean hasil = false; 
        
        System.out.println("Masukan karakter: "); 
        String karakter1 = scan.nextLine();
        String karakter2 = scan.nextLine(); 
        String karakter3 = scan.nextLine(); 
        
        if ((!(karakter1.equals("a")) &&
            !(karakter1.equals("i")) &&
            !(karakter1.equals("u")) &&
            !(karakter1.equals("e")) &&
            !(karakter1.equals("o"))) &&
            (!(karakter3.equals("a")) &&
            !(karakter3.equals("i")) &&
            !(karakter3.equals("u")) &&
            !(karakter3.equals("e")) &&
            !(karakter3.equals("o"))) &&
            (karakter2.equals("a") ||
            karakter2.equals("i") ||
            karakter2.equals("u") ||
            karakter2.equals("e") ||
            karakter2.equals("o"))
            ) { 
            hasil = true; 
        } else { 
            hasil = false; 
        }
        
        System.out.println(hasil); 
    }
    
}
