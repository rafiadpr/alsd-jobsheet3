
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
            System.out.print("Jenis Kelamin (P/W): ");
            char jeniskel = input.nextLine().charAt(0);
            boolean jenisKelamin = (jeniskel == 'P' || jeniskel == 'p');
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.println("=========================================");
            arrayOfDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }
        
        DataDosen23 dataDosen = new DataDosen23();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
