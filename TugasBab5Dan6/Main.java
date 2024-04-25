package TugasBab5Dan6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Test Manusia
        Manusia manusia1 = new Manusia("Budi", true, "123456789", true);
        System.out.println(manusia1.toString());
        Manusia manusia2 = new Manusia("Maria", false, "987654321", true);
        System.out.println(manusia2.toString());
        Manusia manusia3 = new Manusia("Brillian", true, "443532546", false);
        System.out.println(manusia3.toString());
        System.out.println();

        // Test MahasiswaFilkom
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Rusdi", true, "12456743", false, "235150407111039", 2.8);
        System.out.println(mahasiswa1.toString());
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Siti", false, "457357535", true, "235150407111323", 3.2);
        System.out.println(mahasiswa2.toString());
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Sultan", true, "356531789", true, "235150407111673", 3.8);
        System.out.println(mahasiswa3.toString());
        System.out.println();

        // Test Pekerja
        Pekerja pekerja1 = new Pekerja("Andre", true, "34689675", true, 5000, LocalDate.of(2020, 1, 1), 2);
        System.out.println(pekerja1.toString());
        Pekerja pekerja2 = new Pekerja("Lisa", false, "246890866", false, 6000, LocalDate.of(2013, 1, 1), 0);
        System.out.println(pekerja2.toString()); 
        Pekerja pekerja3 = new Pekerja("Beni", true, "687457345", true, 7000, LocalDate.of(2000, 1, 1), 10);
        System.out.println(pekerja3.toString()); 
        System.out.println();

        // Test Manager
        Manager manager = new Manager("Erwin", true, "346798521", true, 7500, LocalDate.of(2009, 1, 1), 0, "HR");
        System.out.println(manager.toString()); 
    }
}

