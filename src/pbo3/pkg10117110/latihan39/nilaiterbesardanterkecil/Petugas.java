
package pbo3.pkg10117110.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

public class Petugas {
    public String namaPetugas;
    Nilai objNilai = new Nilai();
    Scanner scan = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scan.next();
    }
    
}
