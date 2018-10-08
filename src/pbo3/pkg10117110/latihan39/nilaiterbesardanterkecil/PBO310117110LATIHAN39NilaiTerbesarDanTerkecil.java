/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Nilai Terbesar dan Terkecil dari data yang user inputkan Dengan Menggunakan 
 * Konsep OOP
 */
package pbo3.pkg10117110.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

public class PBO310117110LATIHAN39NilaiTerbesarDanTerkecil {


    public static void main(String[] args) {
        
        Petugas objPetugas = new Petugas();
        Nilai objNilai = new Nilai();
        Scanner scan = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        objPetugas.inputPetugas();
        objNilai.inputJumlahMhs();


        for (int i=0; i<objNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            objNilai.nilaiMhs[i] = scan.nextInt();
            objNilai.hitungNilaiTerbesar(i);
            objNilai.hitungNilaiTerkecil(i);
        }
        objNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+objNilai.nMax);
        System.out.println("Nilai Terkecil adalah "+objNilai.nMin);

        System.out.print("\nPetugas : "+objPetugas.namaPetugas);
    }
    
}
