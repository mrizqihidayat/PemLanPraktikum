package Polimorfisme;

public class MainKue {
    public static void main(String[] args) {
        Kue[] daftarKue = {
            new KuePesanan("Nastar", 10000, 0.5),
            new KuePesanan("Kue Lumpur", 20000, 0.75),
            new KuePesanan("Lapis Legit", 30000, 1.0),
            new KuePesanan("Bolu Kukus", 40000, 1.25),
            new KuePesanan("Dadar Gulung", 50000, 1.5),
            new KueJadi("Klepon", 8000, 10),
            new KueJadi("Kue Leker", 12000, 20),
            new KueJadi("Kue Cubit", 15000, 5),
            new KuePesanan("Kue Lumpur Surabaya", 20000, 1.2),
            new KuePesanan("Kue Pisang", 25000, 1.0),
            new KueJadi("Tiramisu", 10000, 10),
            new KueJadi("Pukis", 15000, 20),
            new KueJadi("Kue Lapis", 18000, 15),
            new KueJadi("Kue Pukis", 7000, 5),
            new KueJadi("Kue Pandan", 16000, 8),
            new KueJadi("Kue Cucur", 10000, 12),
            new KueJadi("Kue Lumpur Bandung", 23000, 15),
            new KueJadi("Kue Talam", 20000, 18),
            new KueJadi("Kue Putu", 30000, 20),
            new KueJadi("Kue Mangkok", 25000, 25)
        };

        System.out.println("Daftar Kue:");
        for (Kue kue : daftarKue) {
            System.out.println(kue + "\nJenis Kue\t: " + kue.getClass().getSimpleName() + "\n");
        }

        double totalHarga = 0;
        for (Kue kue : daftarKue) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("\nTotal Harga: " + totalHarga);

        double totalHargaPesanan = 0, totalBeratPesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                KuePesanan kuePesanan = (KuePesanan) kue;
                totalHargaPesanan += kuePesanan.hitungHarga();
                totalBeratPesanan += kuePesanan.getBerat();
            }
        }

        System.out.println("Total Harga KuePesanan: " + totalHargaPesanan);
        System.out.println("Total Berat KuePesanan: " + totalBeratPesanan);

        double totalHargaJadi = 0, totalJumlahJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                KueJadi kueJadi = (KueJadi) kue;
                totalHargaJadi += kueJadi.hitungHarga();
                totalJumlahJadi += kueJadi.getJumlah();
            }
        }
        System.out.println("Total Harga KueJadi: " + totalHargaJadi);
        System.out.println("Total Jumlah KueJadi: " + totalJumlahJadi);

        Kue kueTermahal = null;
        double hargaTerbesar = 0;
        for (Kue kue : daftarKue){
            double hargaKue = kue.hitungHarga();
            if (hargaKue > hargaTerbesar){
                kueTermahal = kue;
                hargaTerbesar = hargaKue;
            }
        }
        System.out.println();
        System.out.println("Kue dengan harga terbesar: " + kueTermahal + ", Harga Total: " + hargaTerbesar + "\nJenis\t: " +  kueTermahal.getClass().getSimpleName());
    }
}