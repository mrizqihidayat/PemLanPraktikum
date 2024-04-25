package TugasBab5Dan6;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan(); 
    }

    public String toString() {
        String jenis = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + jenis + "\nPendapatan: " + getPendapatan();
    }
}
