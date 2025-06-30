package PegawaiBRI;

    // 8. Inheritance (Pewarisan dari satu kelas induk ke satu kelas anak)
public class DetailPegawaiBRI extends PegawaiBRI {
    // 3. Atribut unit kerja diambil dari ID + 7. Enkapsulasi
    private final String unitKerja;

    // 4. Konstruktor (method khusus yang dijalankan saat objek dibuat)
    public DetailPegawaiBRI(String nama, String idBRI, String dummyUnit) {
        // unit diambil dari ID
        super(nama, idBRI); 
        // otomatis tentukan unit kerja dari ID
        this.unitKerja = tentukanUnitKerja(); 
    }

    // 6. Method Accessor (untuk mengambil nilai atribut/Setter)
    // Mengambil tahun masuk dari 2 digit pertama ID
    public int getTahunMasuk() {
        return Integer.parseInt(getIdBRI().substring(0, 2)) + 2000;
    }
    
    //6. Method Accessor (untuk mengambil nilai atribut/Setter)
    // Masa kerja = Tahun sekarang - tahun masuk + 3 tahun masa kontrak
    public int getMasaKerja() {
        return 2025 - getTahunMasuk() + 3;
    }
    
    // 10. Seleksi (Menentukan unit kerja dari digit ketiga ID)
    public String tentukanUnitKerja() {
        char kodeJabatan = getIdBRI().charAt(2); // ambil karakter ke-3 dari ID
        return switch (kodeJabatan) {
            case '1' -> "kantor pusat";
            case '2' -> "pimpinan cabang";
            case '3' -> "suvervisor";
            case '4' -> "rm sme";
            case '5' -> "rm briguna";
            case '6' -> "customer service";
            case '7' -> "teller";
            default -> "lainnya";
        };
    }

    // 6. Method Accessor (untuk mengambil nilai atribut/Setter)
    // Gaji pokok sesuai unit kerja
    public int getGajiPokok() {
        return switch (unitKerja.toLowerCase()) {
            case "kantor pusat" -> 42000000;
            case "pimpinan cabang" -> 35000000;
            case "suvervisor" -> 15000000;
            case "rm sme" -> 10000000;
            case "rm briguna" -> 8000000;
            case "customer service" -> 4500000;
            case "teller" -> 4500000;
            default -> 3800000;
        };
    }

    // 6. Method Accessor (untuk mengambil nilai atribut/Setter)
    // Tunjangan hanya dapat jika masa kerja diluar kontrak >= 1 tahun
    public int getTunjangan() {
        // abaikan dari kontrak kerja 3 Tahun
        int MasaKerja = getMasaKerja() - 3;
        if (MasaKerja < 1) {
            return 0;
        }
        return 4000000;
    }

    // 6. Method Accessor (untuk mengambil nilai atribut/Setter)
    // Total gaji = gaji pokok + tunjangan
    public int getTotalGaji() {
        return getGajiPokok() + getTunjangan();
    }

    // 9. Polimorfisme (penimpaan method dilakukan di subclass)
    // Override untuk menampilkan info pegawai lengkap
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nUnit Kerja       : " + unitKerja +
               "\nTahun Masuk      : " + getTahunMasuk() +
               "\nMasa Kerja       : " + getMasaKerja() + " tahun" +
               "\nGaji Pokok       : Rp " + String.format("%,d", getGajiPokok()).replace(",", ".") +
               "\nTunjangan        : Rp " + String.format("%,d", getTunjangan()).replace(",", ".") +
               "\nTotal Gaji       : Rp " + String.format("%,d", getTotalGaji()).replace(",", ".");
    }    
}
