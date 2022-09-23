package KoperasiSimpanPinjam;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args)
    {
        Scanner kp = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.print("\nMasukkan jumlah pinjaman: ");
        int jpinjam = kp.nextInt();
        donny.setJumlahPinjam(jpinjam);
        System.out.print("\nMembayar angsuran sebesar: ");
        int ang = kp.nextInt();
        donny.angsur(ang);
        donny.getJumlahPinjaman();
    }

}

