/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DB.ConnectionManager;
import Model.Penjualan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L. W. Aji
 */
public class ExecutePenjualan {
    public ArrayList<Penjualan> getAllPenjualan() {
        ArrayList<Penjualan> listPenjualan = new ArrayList<Penjualan>();
        String query = "select * from penjualan";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                Penjualan pnj = new Penjualan();
                pnj.setIdPenjualan(rs.getString("idPenjualan"));
                pnj.setIdKasir(rs.getString("idKasir"));
                pnj.setNamaKasir(rs.getString("namaKasir"));
                pnj.setTanggal(rs.getDate("tanggal").toString());
                pnj.setTotal(rs.getInt("total"));
                listPenjualan.add(pnj);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKopi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listPenjualan;
    } 
    
    public ArrayList<Penjualan> getPenjualanByKasir(String nama) {
        ArrayList<Penjualan> listPenjualan = new ArrayList<Penjualan>();
        String query = "select * from penjualan where namaKasir = '"+nama+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                Penjualan pnj = new Penjualan();
                pnj.setIdPenjualan(rs.getString("idPenjualan"));
                pnj.setIdKasir(rs.getString("idKasir"));
                pnj.setNamaKasir(rs.getString("namaKasir"));
                pnj.setTanggal(rs.getDate("tanggal").toString());
                pnj.setTotal(rs.getInt("total"));
                listPenjualan.add(pnj);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKopi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listPenjualan;
    }
    
    public String getNewIdPenjualan() {
        String newIdPesan = null;
        Connection con = new ConnectionManager().logOn();
        try {
            PreparedStatement preSt = con.prepareStatement("SELECT * FROM penjualan");
            ResultSet rs= preSt.executeQuery();
            int size = 0;
            while (rs.next()) {
                size++;
            }
            size++;
            
            newIdPesan = "PNJ-" + String.valueOf(size);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteKopi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newIdPesan;
    }
    
    public int insertPenjualan(String idPenjualan, String idKasir, String namaKasir, int total) {
        int hasil = 0;
        Connection con = new ConnectionManager().logOn();
        try {
            PreparedStatement preSt = con.prepareStatement("INSERT INTO penjualan"
                    + " VALUES (?,?,?,?,?)");
            preSt.setString(1, idPenjualan);
            preSt.setString(2, idKasir);
            preSt.setString(3, namaKasir);
            SimpleDateFormat simpleDF = new SimpleDateFormat("YYYY-MM-dd");
            Calendar calen = Calendar.getInstance();
            preSt.setString(4, simpleDF.format(calen.getTime()));
            preSt.setInt(5, total);
            hasil = preSt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
}
