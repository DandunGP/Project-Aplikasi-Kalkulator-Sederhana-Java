/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author ASUS A409F MC
 */
public class Method {
    static Scanner i = new Scanner(System.in); //pembuatan object
    private String pesan; //instance variabel
    static int x;   //static variabel
    static int y;   //static variabel
    static int jumlah;  //static variabel
    
    // Default Constructor
    public Method(){
        System.out.println("-- Kalkulator Sederhana --");
    }
    
    // Parameterized Constructor
    public Method(String nama1, String nama2, String nama3, String nama4){
        System.out.println("Nama Anggota Kelompok :");
        System.out.println("1. " + nama1);
        System.out.println("2. " + nama2);
        System.out.println("3. " + nama3);
        System.out.println("4. " + nama4);
        System.out.println("----------------------------------------------\n");
    }
    
    // Encapsulation
    public void setPesan(String pesan){
        this.pesan = pesan;
    }
    
    //Encapsulation
    public String getPesan(){
        return pesan;    
    }
    
    //Method void
    public static void jumlah(){
        System.out.print("Masukkan Bilangan 1 : "); x = i.nextInt();
        System.out.print("Masukkan Bilangan 2 : "); y = i.nextInt();
        jumlah = x + y;
        System.out.println("Hasil : " + jumlah);
    }
    
    public static void kurang(){
        System.out.print("Masukkan Bilangan 1 : "); x = i.nextInt();
        System.out.print("Masukkan Bilangan 2 : "); y = i.nextInt();
        jumlah = x - y;
        System.out.println("Hasil : " + jumlah);
    }
    
    public static void kali(){
        System.out.print("Masukkan Bilangan 1 : "); x = i.nextInt();
        System.out.print("Masukkan Bilangan 2 : "); y = i.nextInt();
        jumlah = x * y;
        System.out.println("Hasil : " + jumlah);
    }
    
    public static void bagi(){
        float a, b; //local variabel
        float jmlbg; //local variabel
        System.out.print("Masukkan Bilangan 1 : "); a = i.nextInt();
        System.out.print("Masukkan Bilangan 2 : "); b = i.nextInt();
        jmlbg = a / b;
        System.out.println("Hasil : " + jmlbg);
    }
}
