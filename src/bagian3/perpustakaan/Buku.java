package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku
    private String judul;
    private String penulis;
    private boolean dipinjam;
    // 1. Menambahkan method kembalikanBuku(String judul)
    private int tahunTerbit;
    
    // Constructor: dipanggil saat objek dibuat
    public Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit; // 1.
    this.dipinjam = false; // buku baru dianggap tersedia
    }
    
    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
        // 2. Menambahkan atribut tahunTerbit (int) pada class Buku, lengkapi constructor dan getter-nya,
    public int getTahunTerbit() {
        return tahunTerbit;
    } 
    
    public boolean isDipinjam() {
        return dipinjam;
    }
    
    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }
    
    // 2. lalu menampilkan tahun terbit di dalam method info.
    // Mengembalikan keterangan buku dalam bentuk teks
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}