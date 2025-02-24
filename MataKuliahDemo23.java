import java.util.Scanner;

public class MataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MataKuliah23[] arrayOfMataKuliah = new MataKuliah23[3];
        // String kode, nama, dummy;
        // int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah23();
            arrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
