package joobsheet14;
import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo; // Basis, mengembalikan nilai saldo
        } else {
            return 1.11 * hitungLaba(saldo, tahun - 1); // Rekursi
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        
        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();

        System.out.println("Proses Ekspansi dan Substitusi untuk hitungLaba(" + saldoAwal + ", " + tahun + "):");
        double hasil = hitungLaba(saldoAwal, tahun);
        System.out.println("Hasil: " + hasil);

       
    }
}
