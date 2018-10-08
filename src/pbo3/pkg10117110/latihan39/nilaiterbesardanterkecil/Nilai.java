/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117110.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;


public class Nilai {
    public int jumlahMhs;
    public int nMax = 0;
    public int nMin = 100;
    public int nilaiMhs[] = new int[40];
    Scanner scan = new Scanner(System.in);

    public void inputJumlahMhs(){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scan.nextInt();
    }

    public int hitungNilaiTerbesar(int i) {
        return nMax = ((nMax<=nilaiMhs[i])?nilaiMhs[i]:nMax);
    }

    public int hitungNilaiTerkecil(int i) {
        return nMin = ((nMin>=nilaiMhs[i])?nilaiMhs[i]:nMin);
    }

    public void hasilNilaiMhs(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" = "+nilaiMhs[i]+"\n");
        }
    }
    
}
