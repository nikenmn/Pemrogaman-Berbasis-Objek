package kuis1PBO;

import java.util.Scanner;

public class mainPegawai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int j;
        do {
            System.out.println("------ Sistem Hitung Gaji Harian Pegawai -----");
            System.out.print("\nMasukkan NIP\t: ");
            input.nextLine();
            String nip = input.nextLine();
            System.out.print("Masukkan Nama\t: ");
            String name = input.nextLine();
            System.out.print("Banyak Jam Kerja : ");
            int jm = input.nextInt();
            Pegawai pgw = new Pegawai(nip, name, jm);
            pgw.setJamKerja(jm);
            pgw.hitungGajiHarian();
            pgw.cetakPenghasilan();
            System.out.println("\nUlangi Sistem? 1 = ya, 0 = tidak");
            j = input.nextInt();
        } while (j == 1);
    }
}
