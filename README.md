# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana untuk mengelola data pegawai di lingkungan Bank BRI, dibuat menggunakan bahasa pemrograman Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, NIP, jabatan, dan masa kerja, dan output yang dihasilkan adalah informasi lengkap setiap pegawai yang telah dimasukkan, termasuk penghitungan gaji berdasarkan jabatan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PegawaiBRI`, `DetailPegawaiBRI`, dan `PegawaiBRIBeraksi` adalah contoh dari class.

```bash
public class PegawaiBRI {
    ...
}

public class DetailPegawaiBRI extends PegawaiBRI {
    ...
}

public class PegawaiBRIBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `DetailPegawaiBRI[] pegawai = new DetailPegawaiBRI[n];` adalah contoh pembuatan object.

```bash
DetailPegawaiBRI[] pegawai = new DetailPegawaiBRI[n];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `idBRI` adalah contoh atribut.

```bash
String nama;
String idBRI;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `PegawaiBRI` dan `DetailPegawaiBRI`.

```bash
public PegawaiBRI(String nama, String idBRI) {
    this.nama = nama;
    this.idBRI = idBRI;
}

public DetailPegawaiBRI(String nama, String idBRI, String Unit) {
    super(nama, idBRI);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setidBRI` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setidBRI(String idBRI) {
    this.idBRI = idBRI;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getidBRI`, `getTahunMasuk`, `getMasaKerja`, `getGajiPokok`, `getTunjangan` dan `getTotalGaji` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String idBRI() {
    return idBRI;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `idBRI` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String idBRI;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DetailPegawaiBRI` mewarisi `PegawaiBRI` dengan sintaks `extends`.

```bash
public final class DetailPegawaiBRI extends PegawaiBRI {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String Tambahan)` di `PegawaiBRI` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `DetailPegawaiBRI` merupakan override dari method `tampilkanInfo` di `PegawaiBRI`.

```bash
public String tampilkanInfo(String tambahan) {
    return tampilkanInfo() + "\nKeterangan Tambahan: " + tambahan;
}

@Override
public String tampilkanInfo() {
    return super.tampilkanInfo() +
           "\nUnit Kerja  : " + unitKerja +
           "\nMasa Kerja  : " + getMasaKerja() + " tahun" +
           "\nGaji Pokok  : Rp " + getGajiPokok() +
           "\nTunjangan   : Rp " + getTunjangan() +
           "\nTotal Gaji  : Rp " + getTotalGaji();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getTunjangan` dan seleksi `switch` dalam method `tentukanUnitKerja`.

```bash

public int getTunjangan() {
    int masaKerja = getMasaKerja() - 3;
    if (masaKerja < 1) {
        return 0;
    }
    return 4000000;
}

public String tentukanUnitKerja() {
    char kodeJabatan = getIdBRI().charAt(2);
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarPegawai.length; i++) {
    ...
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pegawai ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Pegawai:");
System.out.println(pegawai.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DetailPegawaiBRI[] daftarPegawai = new DetailPegawaiBRI[2];` adalah contoh penggunaan array.

```bash
DetailPegawaiBRI[] daftarPegawai = new DetailPegawaiBRI[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // Error Handling Angka
} catch (NumberFormatException e) {
    System.out.println("Format angka salah: " + e.getMessage());
}

try {
    // Error Handling Umum
} catch (NumberFormatException e) {
    System.out.println("Kesalahan umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Rifa'i
NPM: 2410010646
Ask AI
