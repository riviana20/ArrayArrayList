package bagian2.arraylist;

import java.util.ArrayList; 

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        
        // 1. Menambah 4 item, lalu hapus item ke-2, lalu tampilkan isi list beserta jumlah akhirnya.
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Menambah elemen ke ArrayList
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Beras 5kg");
        daftarBelanja.add("Gula Pasir");
        daftarBelanja.add("Telur 1 Kg");
        
        // Menghapus item kedua (Beras 5kg) -> Indeks ke-1
        daftarBelanja.remove(1);
        
        // Menampilkan isi dengan perulangan ukuran .size()
        System.out.println("Isi keranjang belanja saat ini:");
        for (int i = 0; i < daftarBelanja.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBelanja.get(i));
        }
        System.out.println();

        
        // 2. Menampilkan nilai terbesar dengan menelusuri seluruh elemen.
        ArrayList<Integer> nilaiUjian = new ArrayList<>();
        nilaiUjian.add(75);
        nilaiUjian.add(88);
        nilaiUjian.add(92);
        nilaiUjian.add(65);
        nilaiUjian.add(84);
        
        // Elemen pertama adalah yang paling besar
        int nilaiTertinggi = nilaiUjian.get(0);
        
        // Menelusuri menggunakan for indeks biasa
        for (int j = 0; j < nilaiUjian.size(); j++) {
            if (nilaiUjian.get(j) > nilaiTertinggi) {
                nilaiTertinggi = nilaiUjian.get(j);
            }
        }
        System.out.println("Nilai ujian paling tinggi: " + nilaiTertinggi);
        System.out.println();

        
        // 3. Membuat program yang menambah 6 nama ke dalam ArrayList, lalu cetak hanya nama yang diawali huruf A
        ArrayList<String> listNama = new ArrayList<>();
        listNama.add("Andi");
        listNama.add("Budi");
        listNama.add("Anisa");
        listNama.add("Citra");
        listNama.add("Ahmad");
        
        System.out.println("Daftar nama yang berawalan huruf 'A':");
        for (int k = 0; k < listNama.size(); k++) {
            String namaSekarang = listNama.get(k);
            
            // Menggunakan .startsWith() untuk mengecek huruf depan
            if (namaSekarang.startsWith("A")) {
                System.out.println("- " + namaSekarang);
            }
        }
    }
}