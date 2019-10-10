/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan17;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Program Tunjangan
 */

public class Latihan17 {

    public static void main(String[] args) {
        //kamus lokal
        double gajipokok, tunjangan;
        boolean menikah;
        String status;
        
        System.out.println("===============Program Tunjangan==============");
        Scanner input = new Scanner(System.in);
        
        //input gaji pokok
        System.out.print("Berapa gaji pokok anda perbulan? : Rp ");
        gajipokok = input.nextDouble();
        status = input.nextLine();
        
        //input menikah atau tidak
        System.out.print("Status Anda? (Menikah/Belum)     : ");
        status = input.nextLine(); 
        
        //menghitung tunjangan
        if((status.equals("Menikah")) || (status.equals("menikah")))
            menikah = true;
        else
            menikah = false;
        if(menikah)
            tunjangan = 0.35 * gajipokok;
        else
            tunjangan = 0;
        
        System.out.println("");
        System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok\t\t\t: Rp " + gajipokok);
        System.out.println("Tunjangan\t\t\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t\t\t: Rp " + (gajipokok + tunjangan)); 
        System.out.println("");
        System.out.println("Developed by : Zaenal Anzarry");
   
    }
    
}
