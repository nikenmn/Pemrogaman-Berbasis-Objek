package niken.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }


    public String getKode() {
        return kode;
    }

    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String info() { String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if(!(this.arrayKursi[nomor - 2] == nomor)) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        this.arrayKursi[nomor - 1].setNomor(String.valueOf(nomor)); }
    }


}
