import java.util.Scanner;

public class PendaftaranTamu {
    private static final int MAX_TAMU = 100; // Maksimum jumlah tamu yang dapat diakomodasi

    private String[] namaTamu = new String[MAX_TAMU];
    private int[] umurTamu = new int[MAX_TAMU];
    private int[] nomorKamar = new int[MAX_TAMU];
    private int jumlahTamu = 0;

    public static void main(String[] args) {
        PendaftaranTamu hotel = new PendaftaranTamu();
        Scanner scanner = new Scanner(System.in);

        // Pendaftaran tamu
        hotel.daftarTamu("Sesy", 30, 101);
        hotel.daftarTamu("Rendha", 25, 102);
        hotel.daftarTamu("Alfin", 40, 103);

        // Menampilkan daftar tamu
        hotel.tampilkanDaftarTamu();
    }

    public void daftarTamu(String nama, int umur, int kamar) {
        if (jumlahTamu < MAX_TAMU) {
            namaTamu[jumlahTamu] = nama;
            umurTamu[jumlahTamu] = umur;
            nomorKamar[jumlahTamu] = kamar;
            jumlahTamu++;
            System.out.println("Tamu " + nama + " telah berhasil mendaftar!");
        } else {
            System.out.println("Maaf, kamar hotel sudah penuh.");
        }
    }

    public void tampilkanDaftarTamu() {
        System.out.println("Daftar Tamu Hotel:");
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.println("Nama: " + namaTamu[i] + ", Umur: " + umurTamu[i] + ", Kamar: " + nomorKamar[i]);
        }
    }
}