
import java.util.Scanner;

public class DosenDemo23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = Integer.parseInt(input.nextLine());

        Dosen23[] arrayOfDosen = new Dosen23[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jeniskel = input.nextLine().charAt(0);
            boolean jenisKelamin = (jeniskel == 'P' || jeniskel == 'p');
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.println("=========================================");
            arrayOfDosen[i] = new Dosen23(nama, kode, jenisKelamin, usia);
        }

        int nomor = 1;
        for (Dosen23 dosen23 : arrayOfDosen) {
            System.out.println("Data dosen ke-" + nomor);
            System.out.println("Kode         : " + dosen23.kode);
            System.out.println("Nama         : " + dosen23.nama);
            System.out.println("SKS          : " + (dosen23.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Jumlah Jam   : " + dosen23.usia);
            System.out.println("=========================================");
            nomor++;
        }
    }
}
