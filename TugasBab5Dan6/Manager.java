package TugasBab5Dan6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * super.getGaji());
    }

    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}