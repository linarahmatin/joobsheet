package joobsheet14;
import java.util.Scanner;
public class Fibonacci {
    public static int jumlahPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulanKe12 = 12;
        int jumlahPasanganPadaBulanKe12 = jumlahPasanganMarmut(bulanKe12);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulanKe12 + ": " + jumlahPasanganPadaBulanKe12);
    }
}
    

