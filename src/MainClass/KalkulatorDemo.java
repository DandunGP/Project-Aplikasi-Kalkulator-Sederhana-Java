/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;
import OOP.Method;
import java.util.Scanner;

/**
 *
 * @author ASUS A409F MC
 */
public class KalkulatorDemo extends Method{ //inheritance
    static Scanner i = new Scanner(System.in); // pembuatan objek
        public static void main(String[] args){ // main class
            new Method("Sigit Her Bilowo", "Dandun Gigih Prakoso", "Ilyas Muhlisin", "Indriarto Dwi Nugroho");
            char back; //local variabel dengan tipe char
            int pilih; //local variabel
            do {
                Method m = new Method(); //pembuatan object sekaligus menjalankan default constructor
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                System.out.println("5. Keluar\n");
                System.out.print("Masukan Pilihan : ");
                pilih = i.nextInt();
                switch (pilih) {
                    case 1:
                        jumlah();
                        break;
                    case 2:
                        kurang();
                        break;
                    case 3:
                        kali();
                        break;
                    case 4:
                        bagi();
                        break;
                    case 5:
                        m.setPesan("Kalkulator sederhana berhenti");
                        System.out.println(m.getPesan());
                        break;
                    default:
                        System.out.println("Pilihan yang anda masukkan salah");
                        break;   
                }
                if(pilih == 5)
                {
                    back ='T';
                }
                else
                {
                    System.out.print("\nGunakan kembali ? [Y/T] : ");back = i.next().charAt(0);
                    System.out.println("----------------------------------------------\n");
                }
            } 
                while (back != 'T');
        }
} 