package Pertemuan5Kasus;

import Pembantu.Helper;
import java.io.*;

public class Pertemuan5Kasus1 extends Helper {

    public static void main(String[] args) throws IOException {
        InputStreamReader KeyReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(KeyReader);

        int i, j;
        double total = 0;
        String[] merek, ukuran, nama;
        int[] jumlahBeli;
        double[] harga, jumlahHarga, pajak, totalBayar;
        merek = new String[10];
        ukuran = new String[10];
        jumlahBeli = new int[10];
        harga = new double[10];
        jumlahHarga = new double[10];
        pajak = new double[10];
        totalBayar = new double[10];
        nama = new String[10];

        System.out.print("Masukkan jumlah data :");
        j = Integer.parseInt(input.readLine());
        for (i = 1; i <= j; i++) {
            System.out.println("Data ke -" + i);
            System.out.print("Merek helm [KYT/BMC] :");
            merek[i] = input.readLine();
            System.out.print("Jumlah beli :");
            jumlahBeli[i] = Integer.parseInt(input.readLine());
            System.out.println("Ukuran S/M : ");
            ukuran[i] = input.readLine();
            System.out.println("");

            if (merek[i].equalsIgnoreCase("KYT")) {
                nama[i] = "kyt GT";
                if (ukuran[i].equalsIgnoreCase("S")) {
                    harga[i] = 80000;
                } else if (ukuran[i].equalsIgnoreCase("M")) {
                    harga[i] = 70000;
                } else {
                    harga[i] = 60000;
                }

            } else {
                nama[i] = "bmc RC";
                if (ukuran[i].equalsIgnoreCase("S")) {
                    harga[i] = 90000;
                } else if (ukuran[i].equalsIgnoreCase("M")) {
                    harga[i] = 85000;
                } else {
                    harga[i] = 75000;
                }
            }
            jumlahHarga[i] = harga[i] * jumlahBeli[i];
            pajak[i] = jumlahHarga[i] * 0.1;
            totalBayar[i] = jumlahHarga[i] + pajak[i];
            total = total + totalBayar[i];
        }
        System.out.println("Toko helm pak Tarno");
        System.out.println("");

        for (i = 1; i <= j; i++) {
            System.out.println("Data ke -" + i);
            System.out.println("Nama helm :"+nama[i]);
            System.out.println("Merek Helm : " + merek[i]);
            System.out.println("Ukuran : " + ukuran[i]);
            System.out.println("Harga : " + formatRupiah(harga[i]));
            System.out.println("Jumlah Harga : " + formatRupiah (jumlahHarga[i]));
            System.out.println("Pajak : " + formatRupiah(pajak[i]));
            System.out.println("Total Bayar : " + formatRupiah(totalBayar[i]));
            System.out.println("");
        }
        System.out.println("Harga Semuanya adalah " + formatRupiah(total));
    }
}
