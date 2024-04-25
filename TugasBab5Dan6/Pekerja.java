package TugasBab5Dan6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        int tahunBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunBekerja >= 0 && tahunBekerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunBekerja > 5 && tahunBekerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus() + (jumlahAnak * 20);
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String tahunMasukFormat = tahunMasuk.format(formatter);
        return super.toString() + "\nTahun Masuk: " + tahunMasukFormat + "\nJumlah Anak: " + jumlahAnak + "\nGaji: " + gaji;
    }
}