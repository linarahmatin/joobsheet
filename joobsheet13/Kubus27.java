package joobsheet13;
import java.util.Scanner;
public class Kubus27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi kubus:");
        int sisi = input.nextInt();

        // Menggunakan fungsi dalam class Kubus27
        int volumeKubus = hitungVolume(sisi);
        int luasPermukaanKubus = hitungLuas(sisi);

        // Menampilkan hasil perhitungan
        System.out.println("Volume Kubus: " + volumeKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaanKubus);
    }

    // Fungsi untuk menghitung volume kubus
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    static int hitungLuas(int sisi) {
        return 6 * sisi * sisi;
    }
}
    

