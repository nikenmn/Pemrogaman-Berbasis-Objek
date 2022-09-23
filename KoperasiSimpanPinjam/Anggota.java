package KoperasiSimpanPinjam;

public class Anggota {
    public String ktp;
    public  String nama;
    public int limitPinjam;
    public int jumlahPinjam;
    private int pinjam;
    private int angsur;

    Anggota (String ktp, String nama, int limitPinjam){
        this.ktp = ktp;
        this.nama =  nama;
        this.limitPinjam = limitPinjam;
    }

    public String getNama(){
        return this.nama;
    }

    public int getLimitPinjaman(){
        return this.limitPinjam;
    }

    public void setJumlahPinjam(int jPinjam){
        this.jumlahPinjam = jPinjam;
    }

    public int getJumlahPinjaman(){
        if (jumlahPinjam>limitPinjam){
            System.out.println("Maaf jumlah pinjaman melebihi batas");
            jumlahPinjam = 0;
        } System.out.println("Jumlah pinjaman saat ini: " +jumlahPinjam);
        return jumlahPinjam;
    }

    public int pinjam(int pinjam){
        return this.jumlahPinjam = pinjam;
    }

    public void angsuranMin(){
    }

    public void angsur(int angsur){
        if (angsur>=(jumlahPinjam*0.1)) {
            jumlahPinjam -= angsur;
            if(jumlahPinjam==0){
                System.out.println("Selamat, Pinjaman Anda Telah Lunas!");
            }
        } else {
            System.out.println("Maaf, angsuran minimal harus 10% dari jumlah pinjaman");
        }
    }
}
