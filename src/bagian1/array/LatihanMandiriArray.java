package bagian1.array; // Pastikan baris package ini ada di paling atas!

public class LatihanMandiriArray {
    
    public static void main(String[] args) {
        
        // 1. Menampilkan suhu tertinggi dan terendah.
        double[] suhuHarian = {29.5, 31.0, 34.2, 28.8, 30.1, 32.4};
        double max = suhuHarian[0];
        double min = suhuHarian[0];

        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > max) {
                max = suhuHarian[i];
            }
            if (suhuHarian[i] < min) {
                min = suhuHarian[i];
            }
        }
        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah: " + min);
        System.out.println(); // Biar ada jarak saat di-print

        // 2. Mencetak hanya nama hari yang memiliki lebih dari 5 huruf
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("Hari dengan lebih dari 5 huruf:");
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("- " + hari);
            }
        }
        System.out.println();

        // 3. Menghitung dan tampilkan berapa banyak angka genap di dalamnya
        int[] kumpulanAngka = {4, 8, 15, 16, 23, 42};
        int hitungGenap = 0;

        for (int angka : kumpulanAngka) {
            if (angka % 2 == 0) {
                hitungGenap++;
            }
        }
        System.out.println("Banyaknya angka genap: " + hitungGenap);
        
    }
}