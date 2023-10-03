import java.util.Scanner;
public class HargaBayar28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        String merk;
        double dis=0.1, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku yang akan diteliti: ");
        merk=input.nextLine();
        System.out.println("Masukkan Jumlah Halaman buku yang akan dibeli ");
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan diskon buku: ");
        dis=input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anada dapat adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
