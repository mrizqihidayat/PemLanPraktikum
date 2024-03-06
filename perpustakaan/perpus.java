package perpustakaan;
import java.util.*;

import perpustakaan.data;

public class perpus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        data buku = new data();

        int kategori;
        while (true) {
            System.out.print("=======[Perpustakaan]=======\n" +
                "Masukkan pilihan untuk melihat buku berdasarkan kategori\n" +
                "1. Agama\n" + "2. Teknologi\n" + "3. Filsafat\n" + "4. Sejarah\n" +
                "5. Psikologi\n" + "6. Politik\n" + "7. Fiksi\n" +
                "Pilihan anda: ");

            kategori = input.nextInt();
            input.nextLine(); 
            System.out.println();

            if (kategori < 1 || kategori > 7) {
                System.out.println("Pilihan tidak valid!");
                System.out.println();
                continue;
            } else {
                data.printBooks(buku.getBooksByCategory(kategori));
                System.out.println("Apakah mau lihat buku yang lainnya? (ya/tidak)");
                String lihatLagi = input.nextLine();

                if (lihatLagi.equalsIgnoreCase("ya")) {
                    System.out.println();
                    continue;
                } else {
                    break;
                }
            }
        }
    input.close();
    }
}