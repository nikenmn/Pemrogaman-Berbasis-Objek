package kuis1PBO;

public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok= 2000;
    private double lembur;
    private double uangMakan;
    private double transport;
    private int jumlahJamKerja;
    private double payoff;

    Pegawai(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }

    Pegawai(String nama, String nip, int jumlahJamKerja){
        this.nama = nama;
        this.nip = nip;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void hitungGajiHarian(){
        if (jumlahJamKerja > 7){
            lembur = 1.5*((jumlahJamKerja-7)*gajiPokok);
            if(jumlahJamKerja >= 8 && jumlahJamKerja < 9){
                uangMakan = 3500;
            } else if (jumlahJamKerja >= 9){
                uangMakan = 3500;
                transport = 4000;
            }
        }
        gajiPokok *= jumlahJamKerja;
        payoff +=(gajiPokok+lembur+uangMakan+transport);
    }

    public void cetakPenghasilan(){
        System.out.println("\n==== GAJI HARIAN ====");
        System.out.println("NIP\t\t\t\t: "+nip);
        System.out.println("Nama\t\t\t: "+nama);
        System.out.println("Gaji pokok\t\t: "+gajiPokok);
        System.out.println("Lembur\t\t\t: "+lembur);
        System.out.println("Uang Makan\t\t: "+uangMakan);
        System.out.println("Transport lembur: "+transport);
        System.out.println("Take Home Pay\t: "+payoff);
    }

}
