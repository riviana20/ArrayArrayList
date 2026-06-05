package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // ArrayList yang menampung objek Mahasiswa
    private ArrayList<Mahasiswa> listMahasiswa;

    // Constructor untuk membuat objek pengelola kelas
    public KelasKuliah() {
        this.listMahasiswa = new ArrayList<>();
    }

    // 3.1 Method tambahMahasiswa
    public void tambahMahasiswa(Mahasiswa mhsBaru) {
        listMahasiswa.add(mhsBaru);
    }

    // 3.2 Method hitungRataRata
    public double hitungRataRata() {
        if (listMahasiswa.isEmpty()) {
            return 0.0; // supaya tidak error pembagian dengan nol jika data kosong
        }
        
        double totalNilai = 0;
        int jumlahMhs = listMahasiswa.size();
        
        // Menghitung total dengan perulangan indeks manual
        for (int i = 0; i < jumlahMhs; i++) {
            totalNilai = totalNilai + listMahasiswa.get(i).getNilai();
        }
        
        return totalNilai / jumlahMhs;
    }

    // 3.3 Method jumlahLulus
    public int jumlahLulus() {
        int banyakLulus = 0;
        
        for (int i = 0; i < listMahasiswa.size(); i++) {
            // Memanggil method lulus() dari objek Mahasiswa yang bertipe boolean
            if (listMahasiswa.get(i).lulus() == true) {
                banyakLulus++;
            }
        }
        
        return banyakLulus;
    }

    // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi, lalu menampilkan kembali jumlah data terbaru.
    public int hitungTotalData() {
        return listMahasiswa.size();
    }

    // 3.4 Method tampilkanSemua
    public void tampilkanSemua() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("NPM\t     \tNama\t                 \tNilai\tStatus");
        System.out.println("-------------------------------------------------------------");
        
        if (listMahasiswa.isEmpty()) {
            System.out.println("[Data mahasiswa di kelas ini masih kosong]");
            return;
        }

        for (int i = 0; i < listMahasiswa.size(); i++) {
            Mahasiswa m = listMahasiswa.get(i);
            
            // Konversi boolean lulus() menjadi teks Keterangan LULUS/GAGAL
            String statusKelulusan = "GAGAL";
            if (m.lulus()) {
                statusKelulusan = "LULUS";
            }
            
            System.out.println(m.getNpm() + "\t" + m.getNama() + "\t\t" + m.getNilai() + "\t" + statusKelulusan);
        }
        System.out.println("-------------------------------------------------------------");
    }
}