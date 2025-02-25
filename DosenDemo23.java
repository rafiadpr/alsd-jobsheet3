
import java.util.Scanner;

public class DosenDemo23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = Integer.parseInt(input.nextLine());

        Dosen23[] arrayOfDosen = new Dosen23[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            arrayOfDosen[i] = Dosen23.tambahDosen(input, i + 1);
        }

        // for (int i = 0; i < jumlahDosen; i++) {
        //     System.out.println("Data dosen ke-" + (i + 1));
        //     arrayOfDosen[i].cetakInfo();
        // }

        DataDosen23 dataDosen = new DataDosen23();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
