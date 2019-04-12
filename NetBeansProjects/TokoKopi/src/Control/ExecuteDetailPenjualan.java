/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DB.ConnectionManager;
import Model.DetailPenjualan;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class ExecuteDetailPenjualan {
    public ArrayList<DetailPenjualan> getDetailPenjualan() {
        ArrayList<DetailPenjualan> listDetPenjualan = new ArrayList<DetailPenjualan>();
        String query = "select * from detail_penjualan";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                DetailPenjualan detPnj = new DetailPenjualan();
                detPnj.setIdPenjualan(rs.getString("idPenjualan"));
                detPnj.setIdKopi(rs.getString("idKopi"));
                detPnj.setJenisKopi(rs.getString("jenisKopi"));
                detPnj.setJumlah(rs.getInt("jumlah"));
                detPnj.setHarga(rs.getInt("harga"));
                detPnj.setTotal(rs.getInt("total"));
                listDetPenjualan.add(detPnj);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKopi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listDetPenjualan;
    }  
    
    public ArrayList<DetailPenjualan> getDetailPenjualanByIdPenjualan(String id) {
        ArrayList<DetailPenjualan> listDetPenjualan = new ArrayList<DetailPenjualan>();
        String query = "select * from detail_penjualan where idPenjualan = '"+id+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                DetailPenjualan detPnj = new DetailPenjualan();
                detPnj.setIdPenjualan(rs.getString("idPenjualan"));
                detPnj.setIdKopi(rs.getString("idKopi"));
                detPnj.setJenisKopi(rs.getString("jenisKopi"));
                detPnj.setJumlah(rs.getInt("jumlah"));
                detPnj.setHarga(rs.getInt("harga"));
                detPnj.setTotal(rs.getInt("total"));
                listDetPenjualan.add(detPnj);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ExecuteKopi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listDetPenjualan;
    }    
    
    public int insertDetailPenjualan(DetailPenjualan detPnj) {
        int hasil = 0;
        Connection con = new ConnectionManager().logOn();
        try {
            PreparedStatement preSt = con.prepareStatement("INSERT INTO detail_penjualan"
                    + " VALUES (?,?,?,?,?,?)");
            preSt.setString(1, detPnj.getIdPenjualan());
            preSt.setString(2, detPnj.getIdKopi());
            preSt.setString(3, detPnj.getJenisKopi());
            preSt.setInt(4, detPnj.getHarga());
            preSt.setInt(5, detPnj.getJumlah());
            preSt.setInt(6, detPnj.getTotal());
            hasil = preSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return hasil;
    }    
}
