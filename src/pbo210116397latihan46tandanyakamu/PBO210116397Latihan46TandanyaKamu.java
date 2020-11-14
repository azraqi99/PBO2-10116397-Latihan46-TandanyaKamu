/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Tandanya kamu
 */
package pbo210116397latihan46tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Age mal1 = new Age(2018);
        System.out.print("Masukkan Tahun Lahir : ");
        mal1.setYearBirth(baca.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : " + mal1.getYearBirth());
        System.out.println("Hari ini Tahun : " + mal1.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " + mal1.hitungUmur() + " Tahun");
        mal1.tandanyaKamu(mal1.hitungUmur());
        
    }
    
}
