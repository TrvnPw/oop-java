/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekDuluGaSih;

/**
 *
 * @author user
 */
public class Barang {

    private String kodeBarang, namaBarang;
    private int jumlahBarang;
    private double hargaBarang, totalBayar, uangBayar, uangKembali;

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getTotalBayar() {
        totalBayar = hargaBarang * jumlahBarang;
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public void setUangBayar(double uangBayar) {
        this.uangBayar = uangBayar;
    }

    public double getUangBayar() {
        return uangBayar;
    }

    public double getUangKembali() {
        return (uangBayar - totalBayar);
    }

    public void setSeleksiKodeBarang() {
        if (kodeBarang.equalsIgnoreCase("B001")) {
            namaBarang = "Pensil";
            hargaBarang = 3000;
        } else if (kodeBarang.equalsIgnoreCase("B002")) {
            namaBarang = "Buku";
            hargaBarang = 5000;
        } else if (kodeBarang.equalsIgnoreCase("B003")) {
            namaBarang = "Penggaris";
            hargaBarang = 1000;
        } else if (kodeBarang.equalsIgnoreCase("B004")) {
            namaBarang = "Penghapus";
            hargaBarang = 500;
        } else {
            namaBarang = "";
            hargaBarang = 0;
        }
    }
}
