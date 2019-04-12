/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DB.ConnectionManager;
import Model.Kopi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L. W. Aji
 */
public class ExecuteKopi {
    public ArrayList<Kopi> getAllKopi() {
        ArrayList<Kopi> listKopi = new ArrayList<Kopi>();
        String query = "select * from kopi";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                Kopi kopi = new Kopi();
                kopi.setIdKopi(rs.getString("idKopi"));
                kopi.setJenisKopi(rs.getString("jenisKopi"));
                kopi.setStokKopi(rs.getInt("stok"));
                kopi.setHargaKopi(rs.getInt("harga"));
                listKopi.add(kopi);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKopi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listKopi;
    }

    public ArrayList<Kopi> getKopiByJenis(String jenis) {
        ArrayList<Kopi> listKopi = new ArrayList<Kopi>();
        String query = "select * from kopi where jenisKopi = '"+jenis+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                Kopi kopi = new Kopi();
                kopi.setIdKopi(rs.getString("idKopi"));
                kopi.setJenisKopi(rs.getString("jenisKopi"));
                kopi.setStokKopi(rs.getInt("stok"));
                kopi.setHargaKopi(rs.getInt("harga"));
                listKopi.add(kopi);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKopi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listKopi;
    }    
    
    public int updateStok(String id, int stokAw, int jumlah){
        int stok = stokAw-jumlah;
        String query = "update kopi set stok = "+stok+" WHERE idKopi = '"+id+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try {
            Statement stm = con.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return hasil;
    }

    public int restoreStok(String id, int stokAw, int jumlah){
        int stok = stokAw+jumlah;
        String query = "update kopi set stok = "+stok+" WHERE idKopi = '"+id+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try {
            Statement stm = con.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return hasil;
    }
}
