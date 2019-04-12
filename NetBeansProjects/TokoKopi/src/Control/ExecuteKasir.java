/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DB.ConnectionManager;
import Model.Kasir;
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
public class ExecuteKasir {
    public ArrayList<Kasir> getAllKasir() {
        ArrayList<Kasir> allKasir = new ArrayList<Kasir>();
        String query = "select * from kasir";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                Kasir kasir = new Kasir();
                kasir.setIdKasir(rs.getString("idKasir"));
                kasir.setNamaKasir(rs.getString("namaKasir"));
                kasir.setPassword(rs.getString("password"));
                allKasir.add(kasir);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return allKasir;
    }
    
    public ArrayList<Kasir> getKasirByNama(String nama) {
        ArrayList<Kasir> allKasir = new ArrayList<Kasir>();
        String query = "select * from kasir where namaKasir = '"+nama+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                Kasir kasir = new Kasir();
                kasir.setIdKasir(rs.getString("idKasir"));
                kasir.setNamaKasir(rs.getString("namaKasir"));
                kasir.setPassword(rs.getString("password"));
                allKasir.add(kasir);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return allKasir;
    }
}
