public class MataKuliah23 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah23(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah23(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = sks * 2;
    }

    public MataKuliah23() {
        this.kode = "XXX";
        this.nama = "Mata Kuliah Default";
        this.sks = 0;
        this.jumlahJam = 0;
    }
}
