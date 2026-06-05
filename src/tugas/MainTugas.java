// RIVIANA SERLY SEPTIANTY
// 2410010248
package tugas;

public class MainTugas {

    public static void main(String[] args) {
        
        // 4. Menyimpan daftar nama mata kuliah dalam sebuah array String (minimal 3, ukuran tetap) dan menampilkannya.
        String[] arrayMatkul = new String[3];
        arrayMatkul[0] = "Pemrograman Berbasis Objek 1";
        arrayMatkul[1] = "Sistem Basis Data";
        arrayMatkul[2] = "Struktur Data Komputer";

        // Menampilkan daftar nama mata kuliah
        System.out.println("=== DAFTAR MATA KULIAH SEMESTER INI ===");
        for (int i = 0; i < arrayMatkul.length; i++) {
            System.out.println("Matkul ke-" + (i + 1) + ": " + arrayMatkul[i]);
        }
        System.out.println();

        // Membuat objek KelasKuliah (Class Pengelola)
        KelasKuliah pengelolaKelas = new KelasKuliah();

        // 3. menambah minimal 5 objek Mahasiswa,
        pengelolaKelas.tambahMahasiswa(new Mahasiswa("Riviana Serly Septianty", "2410010248", 98.5));
        pengelolaKelas.tambahMahasiswa(new Mahasiswa("Iqbaal Ramadhan Islami", "2410010247", 52.0));
        pengelolaKelas.tambahMahasiswa(new Mahasiswa("Reza Arap Oktavia", "2410010246", 85.0));
        pengelolaKelas.tambahMahasiswa(new Mahasiswa("Ariana Grande Grandul", "2410010245", 45.5));
        pengelolaKelas.tambahMahasiswa(new Mahasiswa("Syifa Hadju Istri El", "2410010244", 69.0));

        // Menampilkan data awal mahasiswa
        System.out.println("=== DATA MAHASISWA AWAL ===");
        pengelolaKelas.tampilkanSemua();
        System.out.println("Jumlah data awal: " + pengelolaKelas.hitungTotalData() + " orang.");
        System.out.println();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("--- Hasil Perhitungan Kelas ---");
        System.out.println("Rata-rata Nilai Kelas   : " + pengelolaKelas.hitungRataRata());
        System.out.println("Total Mahasiswa Lulus   : " + pengelolaKelas.jumlahLulus() + " anak");
        System.out.println();

        // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi,
        System.out.println("... Memasukkan data mahasiswa tambahan ...");
        pengelolaKelas.tambahMahasiswa(new Mahasiswa("Muhammad Rizky Abilatul", "2410010243", 92.0));

        // 6. lalu menampilkan kembali jumlah data terbaru.
        System.out.println("Jumlah total data mahasiswa sekarang: " + pengelolaKelas.hitungTotalData() + " orang.");
        System.out.println();

        // Menampilkan rekap hasil akhir untuk memastikan data masuk
        System.out.println("=== REKAP DATA MAHASISWA TERBARU ===");
        pengelolaKelas.tampilkanSemua();
        System.out.println("Rata-rata Nilai Terbaru : " + pengelolaKelas.hitungRataRata());
        System.out.println("Total Mahasiswa Lulus   : " + pengelolaKelas.jumlahLulus() + " anak");
    }
}