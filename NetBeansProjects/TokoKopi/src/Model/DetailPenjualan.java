/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author L. W. Aji
 */
public class DetailPenjualan {
    private String idPenjualan;
    private String idKopi;
    private String jenisKopi;
    private int jumlah;
    private int harga;
    private int total;

    public DetailPenjualan() {
    }

    public DetailPenjualan(String idPenjualan, String idKopi, String jenisKopi,
                           int jumlah, int harga, int total) {
        this.idPenjualan = idPenjualan;
        this.idKopi = idKopi;
        this.jenisKopi = jenisKopi;
        this.jumlah = jumlah;
        this.harga = harga;
        this.total = total;
    }

    public String getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public String getIdKopi() {
        return idKopi;
    }

    public void setIdKopi(String idKopi) {
        this.idKopi = idKopi;
    }

    public String getJenisKopi() {
        return jenisKopi;
    }

    public void setJenisKopi(String jenisKopi) {
        this.jenisKopi = jenisKopi;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotal() {
        return (jumlah*harga);
    }

    public void setTotal(int total) {
        this.total = (jumlah*harga);
    }
    
    
}
