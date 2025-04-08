package Array;

import Pembantu.Helper;
import java.util.Date;
import java.util.Scanner;

public class LatihanSoalArray extends Helper {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String[] kodeBarang, namaBarang;
        int i, j;
        int[] jumlahBarang, hargaBarang, totalHarga;
        int totalPendapatan = 0;
        
        Date tanggal = new Date();
        
        kodeBarang = new String[10];
        namaBarang = new String[10];
        jumlahBarang = new int[10];
        hargaBarang = new int[10];
        totalHarga = new int[10];


        System.out.println("\t\tPT.PERMATA\"PRATAMA\"");
        System.out.println("===========================================================");
        System.out.print("Masukkan nama petugas :");
        nama = input.nextLine();
        System.out.println("Tanggal :" + formatTanggal(tanggal));
        System.out.print("Masukkan data yang akan dimasukkan :");
        j = input.nextInt();
        System.out.println("===========================================================");
        for (i = 1; i <= j; i++) {
            System.out.println("Data ke- " + i);
            boolean kodeBarangIsNotValid = false;
            do {
                System.out.println("Masukkan kode barang [P001/V001/M001]: ");
                kodeBarang[i] = input.next();
                System.out.print("Masukkan jumlah barang :");
                jumlahBarang[i] = input.nextInt();

                if (kodeBarang[i].equalsIgnoreCase("P001")) {
                    namaBarang[i] = "Printer";
                    hargaBarang[i] = 700000;
                } else if (kodeBarang[i].equalsIgnoreCase("V001")) {
                    namaBarang[i] = "VGA Card";
                    hargaBarang[i] = 75000;
                } else if (kodeBarang[i].equalsIgnoreCase("M001")) {
                    namaBarang[i] = "Motherboard";
                    hargaBarang[i] = 950000;
                } else {
                    kodeBarangIsNotValid = true;
                }
            } while (kodeBarangIsNotValid);

            totalHarga[i] = hargaBarang[i] * jumlahBarang[i];
            totalPendapatan += totalHarga[i];

        }
        System.out.println("\n\t\tPT. PERMATA\"PRATAMA\"");
        System.out.println("============================================================");
        System.out.println("Nama petugas                :" + nama + "\t\t\tTanggal :" + formatTanggalLengkap(tanggal));
        System.out.println("Jumlah data yang dimasukkan :" + j);
        System.out.println("===========================================================");
        System.out.printf("%-10s %-15s %-15s %-13s %-15s %-13s\n","Data ke","Kode barang","Nama barang","Harga barang","Jumlah barang","Total harga");
        System.out.println("===========================================================");
for (i=1;i<=j;i++){
    System.out.printf("%-10d %-15s %-15s Rp.%-13d %-15d Rp.%-13d\n", 
                              (i), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBarang[i], totalHarga[i]);
}        
        System.out.println("=====================================================");
        System.out.println("Total pendapatan pada tanggal " + formatTanggal(tanggal) + " adalah sebesar" + totalPendapatan);

    }
}