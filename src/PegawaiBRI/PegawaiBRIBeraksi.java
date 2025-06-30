package PegawaiBRI;

// 12. IO Sederhana (mengimpor kelas Scanner untuk membaca input dari keyboard)
import java.util.Scanner;

// 1. Class
public class PegawaiBRIBeraksi {
    public static void main(String[] args) {
        // 12. IO Sederhana
        // Membuat objek Scanner untuk input dari keyboard
        Scanner input = new Scanner(System.in);

        // 13. Membuat array untuk menyimpan 2 data pegawai
        DetailPegawaiBRI[] daftarPegawai = new DetailPegawaiBRI[2];

        // Header aplikasi
        System.out.println("======================================");
        System.out.println("        PENDAPATAN PEGAWAI BRI        ");
        System.out.println("======================================\n");

        // 14. Error Handling (penanganan kesalahan)
        try {
            // 11. Perulangan untuk input data pegawai
            for (int i = 0; i < daftarPegawai.length; i++) {
                // Menampilkan nomor pegawai
                System.out.println(">> Masukkan Data Pegawai BRI ke-" + (i + 1)); 
                // Input nama
                System.out.print("Nama Pegawai         : "); 
                String nama = input.nextLine();
                // Input ID
                System.out.print("ID Pegawai BRI       : "); 
                String id = input.nextLine();

                System.out.print("Unit Kerja (kantor pusat/cabang/cabang pembantu/unit): "); // Input unit kerja
                String unit = input.nextLine();

                // Membuat objek DetailPegawaiBRI dan simpan ke array
                daftarPegawai[i] = new DetailPegawaiBRI(nama, id, unit);
                System.out.println(); // Baris kosong
            }

            // Menampilkan semua data pegawai
            System.out.println("\n=========== DATA PEGAWAI BANK BRI ===========");
            int count = 1;
            for (DetailPegawaiBRI pegawai : daftarPegawai) {
                System.out.println("Pegawai ke-" + count++); // Nomor urut
                System.out.println(pegawai.tampilkanInfo()); // Menampilkan semua info pegawai
                System.out.println("--------------------------------------------");
            }

            System.out.println("======= TERIMA KASIH INSAN BRILIAN =======");

        } catch (NumberFormatException e) {
            // Error handling angka
            // Jika format angka salah (misalnya substring ID tidak bisa jadi integer)
            System.out.println("⚠️  Format angka salah: " + e.getMessage());
        } catch (Exception e) {
            // Error handling umum
            // Menangani kesalahan umum lainnya
            System.out.println("⚠️  Kesalahan umum: " + e.getMessage());
        } finally {
            // Menutup scanner
            input.close();
        }
    }
}