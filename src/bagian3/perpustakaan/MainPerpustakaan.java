package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
    // Membuat objek pengelola
    Perpustakaan perpus = new Perpustakaan();
    
    // Membuat objek Buku lalu memasukkannya ke koleksi + 2. Tahun Terbit
    perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
    perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
    perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
    
    perpus.tampilkanKoleksi();
    
    System.out.println();
    perpus.pinjamBuku("Bumi Manusia");
    perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
    
    // 1.
    perpus.kembalikanBuku("Bumi Manusia");
    System.out.println();
    
    // 3.
    perpus.cariPenulis("Andrea Hirata");
    System.out.println();
        
    System.out.println();
    perpus.tampilkanKoleksi();
    System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}