/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        System.out.println("Selamat datang");
        Scanner sc =new Scanner(System.in);
        System.out.println("Masukkan nama");
        String nama= sc.nextLine();
        System.out.println("Masukkan umur");
        int umur=sc.nextInt();
        System.out.println("Masukkan alamat");sc.nextLine();
        String alamat=sc.nextLine();
        System.out.println("Hallo " + nama + " Anda sudah registrasi");
        
    }
}
