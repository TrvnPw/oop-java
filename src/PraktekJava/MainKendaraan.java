/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktekJava;

import Pembantu.Helper;
import PraktekJava.Kendaraan;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainKendaraan extends Helper{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Kendaraan mobil = new Kendaraan();
        mobil.setJumlahPintu(6);
        mobil.setIsElectric(false);
        mobil.setBahanBakar("Batterai");
        mobil.setMerk("Toyota");
        System.out.println("Masukkan Harga Kendaraan");
        long harga = input.nextLong();
        mobil.setHargaKendaraan(harga);
        String merk = mobil.getMerk();
        boolean isElectric = mobil.getIsElectric();
        int jumlahPintu = mobil.getJumlahPintu();
        String bahanBakar = mobil.getBahanBakar();
        String isElectricString; 
        Date tanggal = new Date();
                
        if (!mobil.getIsElectric()){
            isElectricString = "Mobil listrik";
        }else { 
            isElectricString = "Bukan mobil listrik";
        }
            
        
        System.out.println("Mobil ini dengan merk " + merk + " Mempunyai jumlah pintu " 
                + jumlahPintu + " Bahan bakarnya " + bahanBakar+" Dan "+isElectricString+" Harganya "+mobil.getHargaKendaraan());
        
    }
}
