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
public class Kopi {
    private String idKopi;
    private String jenisKopi;
    private int hargaKopi;
    private int stokKopi;

    public Kopi() {
    }

    public Kopi(String idKopi, String jenisKopi, int hargaKopi, int stokKopi) {
        this.idKopi = idKopi;
        this.jenisKopi = jenisKopi;
        this.hargaKopi = hargaKopi;
        this.stokKopi = stokKopi;
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

    public int getHargaKopi() {
        return hargaKopi;
    }

    public void setHargaKopi(int hargaKopi) {
        this.hargaKopi = hargaKopi;
    }

    public int getStokKopi() {
        return stokKopi;
    }

    public void setStokKopi(int stokKopi) {
        this.stokKopi = stokKopi;
    }
}
