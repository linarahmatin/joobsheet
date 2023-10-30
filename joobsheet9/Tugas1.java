package joobsheet9;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlElemen, nilaiTertinggi, nilaiTerendah, total;
        double rataRata;

        System.out.print("Masukkan jumlah elemen nilai : ");
        jmlElemen = sc.nextInt();
        int [] nilai = new int [jmlElemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai [i] = sc.nextInt ();
            }

        nilaiTertinggi = nilai[0];
        nilaiTerendah = nilai[0];
        total = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
            total += nilai[i];
        }

        rataRata = (double) total/nilai.length;

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Rata-Rata Nilai: " + rataRata);
    }
    
}