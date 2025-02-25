
public class DataDosen23 {

    public void dataSemuaDosen(Dosen23[] arrayDosen23s) {
        int nomor = 1;
        for (Dosen23 dosen23 : arrayDosen23s) {
            System.out.println("Data dosen ke-" + nomor);
            System.out.println("Kode         : " + dosen23.kode);
            System.out.println("Nama         : " + dosen23.nama);
            System.out.println("SKS          : " + (dosen23.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Jumlah Jam   : " + dosen23.usia);
            System.out.println("=========================================");
            nomor++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen23[] arrayDosen23s) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen23 dosen23 : arrayDosen23s) {
            if (dosen23.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah dosen pria   : " + jumlahPria);
        System.out.println("Jumlah dosen wanita : " + jumlahWanita);
        System.out.println("=========================================");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayDosen23s) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        for (Dosen23 dosen23 : arrayDosen23s) {
            if (dosen23.jenisKelamin) {
                jumlahPria++;
                totalUsiaPria += dosen23.usia;
            } else {
                jumlahWanita++;
                totalUsiaWanita += dosen23.usia;
            }
        }
        System.out.println("Rerata usia dosen pria   : " + (totalUsiaPria / jumlahPria));
        System.out.println("Rerata usia dosen wanita : " + (totalUsiaWanita / jumlahWanita));
        System.out.println("=========================================");
    }

    public void infoDosenPalingTua(Dosen23[] arrayOfDosen23s) {
        Dosen23 dosenTertua = arrayOfDosen23s[0];
        for (Dosen23 dosen23 : arrayOfDosen23s) {
            if (dosen23.usia > dosenTertua.usia) {
                dosenTertua = dosen23;
            }
        }
        System.out.println("Dosen tertua adalah : " + dosenTertua.nama);
        System.out.println("Dengan usia         : " + dosenTertua.usia);
        System.out.println("=========================================");
    }

    public void infoDosenPalingMuda(Dosen23[] arrayOfDosen23s) {
        Dosen23 dosenTermuda = arrayOfDosen23s[0];
        for (Dosen23 dosen23 : arrayOfDosen23s) {
            if (dosen23.usia < dosenTermuda.usia) {
                dosenTermuda = dosen23;
            }
        }
        System.out.println("Dosen termuda adalah : " + dosenTermuda.nama);
        System.out.println("Dengan usia          : " + dosenTermuda.usia);
        System.out.println("=========================================");
    }
}
