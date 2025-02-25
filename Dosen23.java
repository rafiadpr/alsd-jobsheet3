
import java.util.Scanner;

public class Dosen23 {

    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen23(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("=========================================");
    }

    public static Dosen23 tambahDosen(Scanner input, int nomor) {
        System.out.println("Masukkan data dosen ke-" + nomor);
        System.out.print("Kode: ");
        String kode = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Jenis Kelamin (P/W): ");
        char jeniskel = input.nextLine().charAt(0);
        boolean jenisKelamin = (jeniskel == 'P' || jeniskel == 'p');
        System.out.print("Usia: ");
        int usia = input.nextInt();
        input.nextLine();
        System.out.println("=========================================");

        return new Dosen23(kode, nama, jenisKelamin, usia);
    }
}
