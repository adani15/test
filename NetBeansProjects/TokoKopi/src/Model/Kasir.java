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
public class Kasir {
    private String idKasir;
    private String namaKasir;
    private String password;

    public Kasir() {
    }

    public Kasir(String idKasir, String namaKasir, String password) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
