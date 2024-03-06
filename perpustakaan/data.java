package perpustakaan;

public class data {
    private String[][]agama = {{"Sejarah Singkat Tuhan", "Karen Armstrong", "512", "2017", "Random House"},
                            {"The Case for Christ", "Lee Strobel", "256", "1998", "Zondervan"},
                            {"The Purpose Driven Life", "Rick Warren", "336", "2002", "Zondervan"},
                            {"Mere Christianity", "CS Lewis", "176", "1952", "HarperCollins"},
                            {"The Four Agreements", "Don Miguel Ruiz", "128", "1997", "Amber-Allen Publishing"}};
    
    private String[][]teknologi = {{"Homo Deus: A Brief History of Tomorrow", "Yuval Noah Harari", "416", "2015", "HarperCollins"},
                                {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "464", "2011", "HarperCollins"},
                                {"Zero to One: Notes on Startups, or How to Build the Future", "Peter Thiel", "208", "2014", "Crown Business"},
                                {"The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radively Successful Businesses", "Eric Ries", "328", "2011", "Crown Business"},
                                {"The Hard Thing About Hard Things: Building a Business When There Are No Easy Answers", "Ben Horowitz", "272", "2014", "HarperCollins"}};

    private String[][]filsafat = {{"Pengantar Filsafat", "Dr. Franz Magnis-Suseno", "384", "2000", "PT Gramedia Pustaka Utama"},
                                {"Sejarah Filsafat Barat", "Bertrand Russell", "976", "2010", "Pustaka Pelajar"},
                                {"Meditasi", "Marcus Aurelius", "208", "2015", "KPG (Kepustakaan Populer Gramedia)"},
                                {"Etika Nikomakhos", "Aristoteles", "240", "2012", "Pustaka Pelajar"},
                                {"Kritik Akal Murni", "Immanuel Kant", "768", "2007", "Pustaka Pelajar"}};

    private String[][]sejarah = {{"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "464", "2011", "HarperCollins"},
                                {"Senjata Kuman dan Baja", "Jared Diamond", "480", "1997", "Pustaka Utama Gramedia"},
                                {"Sejarah Indonesia Modern", "Taufik Abdullah", "520", "2008", "Pustaka Utama Gramedia"},
                                {"Revolusi Industri", "Eric Hobsbawm", "368", "2005", "Pustaka Utama Gramedia"},
                                {"Perang Dunia II", "Antony Beevor", "848", "2012", "Kepustakaan Populer Gramedia"}};

    private String[][]psikologi = {{"Pengantar Psikologi", "Sarlito Wirawan Sarwono", "644", "2020", "PT.RajaGrafindo Persada"},
                                {"Psikologi Umum", "John W. Santrock", "736", "2021", "Salemba Empat"},
                                {"Psikologi Kepribadian", "Feist & Feist", "672", "2020", "Salemba Empat"},
                                {"Psikologi Klinis", "Theodore Millon", "720", "2019", "Arcan"},
                                {"Psikologi Remaja", "Sarlito Wirawan Sarwono", "440", "2021", "PT.RajaGrafindo Persada"}};

    private String[][]politik = {{"Politik Indonesia: Dinamika dan Perkembangannya", "Miriam Budiardjo", "448", "2021", "PT Gramedia Pustaka Utama"},
                                {"Ilmu Politik: Suatu Pengantar", "C.F. Strong", "336", "2020", "PT. RajaGrafindo Persada"},
                                {"Pengantar Ilmu Politik", "M. Rusli Karim", "288", "2022", "Pustaka Pelajar"},
                                {"Demokrasi Indonesia: Dari Masa ke Masa", "Muhammad Syafii Maarif", "320", "2020", "LP3ES"},
                                {"Negara dan Politik: Sebuah Pengantar", "Mohtar Mas'oed", "312", "2019", "Prenada Media Group"}};

    private String[][]fiksi = {{"Laskar Pelangi", "Andrea Hirata", "528", "2005", "Bentang Pustaka"},
                            {"Sang Pemimpi", "Andrea Hirata", "536", "2006", "Bentang Pustaka"},
                            {"Negeri 5 Menara", "Ahmad Fuadi", "368", "2009", "Gramedia Pustaka Utama"},
                            {"Ranah 3 Warna", "Ahmad Fuadi", "360", "2011", "Gramedia Pustaka Utama"},
                            {"Lima Sekawan dan Rahasia Pulau Harta Karun", "Enid Blyton", "192", "2021", "Gramedia Pustaka Utama"}};

    public String[][] getBooksByCategory(int category) {
        switch (category) {
            case 1: return agama;
            case 2: return teknologi;
            case 3: return filsafat;
            case 4: return sejarah;
            case 5: return psikologi;
            case 6: return politik;
            case 7: return fiksi;
            default: return new String[0][];
        }
    }

    public static void printBooks(String[][] category) {
        int ke = 0;
        if (category.length == 0) {
            System.out.println("Tidak ada buku dalam kategori ini.");
            return;
        }
        for (String[] book : category) {
            ++ke;
            System.out.println("Buku ke-" + ke);
            System.out.println("Judul: " + book[0]); 
            System.out.println("Penulis: " + book[1]);
            System.out.println("Jumlah Halaman: " + book[2]);
            System.out.println("Tahun Terbit: " + book[3]);
            System.out.println("Penerbit: " + book[4]);
            System.out.println();
        }
    }
}