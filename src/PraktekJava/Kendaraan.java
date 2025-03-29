/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktekJava;

/**
 *
 * @author user
 */
public class Kendaraan {

    private String merk;
    private boolean isElectric;
    private int jumlahPintu;
    private String bahanBakar;
    private long hargaKendaraan;

    public long getHargaKendaraan() {
        return hargaKendaraan;
    }

    public void setHargaKendaraan(long hargaKendaraan) {
        this.hargaKendaraan = hargaKendaraan;
    }
    
//    public Kendaraan(String merk, boolean isElectric, int jumlahPintu, String bahanBakar) {
//        this.merk = merk;
//        this.isElectric = isElectric;
//        this.jumlahPintu = jumlahPintu;
//        this.bahanBakar = bahanBakar;      
//    }
    public String getMerk(){
        return this.merk;
    }
    public boolean  getIsElectric(){
        return this.isElectric;
    }
    public int getJumlahPintu(){
        return this.jumlahPintu;
    }
    public String getBahanBakar(){
        return this.bahanBakar;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
}
