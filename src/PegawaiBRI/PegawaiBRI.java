package PegawaiBRI;

//1. Class
public class PegawaiBRI {
     //3. Atribut + 7. Enkapsulasi
    private String nama;
    private String idBRI;

    //4. Konstruktor (method khusus yang dijalankan saat objek dibuat)
    public PegawaiBRI(String nama, String idBRI) {
        this.nama = nama;
        this.idBRI = idBRI;
    }

    //5. Method Mutator (untuk mengubah nilai atribut/Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdBRI(String idBRI) {
        this.idBRI = idBRI;
    }

    //6. Method Accessor (untuk mengambil nilai atribut/Setter)
    public String getNama() {
        return nama;
    }

    public String getIdBRI() {
        return idBRI;
    }

    //9. Polimorfisme (penimpaan method dilakukan di subclass)
    public String tampilkanInfo() {
        return "Nama Pegawai BRI : " + nama +
               "\nID Pegawai BRI   : " + idBRI;
    }
}
