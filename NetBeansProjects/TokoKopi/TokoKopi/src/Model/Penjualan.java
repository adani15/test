/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;

/**
 *
 * @author L. W. Aji
 */
public class Penjualan {
    private String idPenjualan;
    private String idKasir;
    private String namaKasir;
    private String tanggal;
    private int total;

    public Penjualan() {
    }

    public Penjualan(String idPenjualan, String idKasir, String namaKasir, 
                     String tanggal, int total) {
        this.idPenjualan = idPenjualan;
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
        this.tanggal = tanggal;
        this.total = total;
    }

    public String getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
