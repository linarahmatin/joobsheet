package joobsheet10;
import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        int menu = 0;
        while (menu != 3) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    if (baris < 1 || baris > 4) {
                        System.out.println("Nomor baris kursi tidak tersedia.");
                        break;
                    }
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    if (kolom < 1 || kolom > 2) {
                        System.out.println("Nomor kolom kursi tidak tersedia.");
                        break;
                    }
                    sc.nextLine();

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Maaf, kursi ini sudah terisi oleh penonton lainnnya " + penonton[baris - 1][kolom - 1]);
                        System.out.print("Apakah Anda ingin memilih kursi lain? (y/n): ");
                        next = sc.nextLine();
                        if (!next.equalsIgnoreCase("y")) {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Maaf, kursi ini sudah terisi oleh penonton lainnnya.");
                    break;

                case 2:
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.printf("%s \t %s\n", penonton[i][j], i + 1);
                        } else {
                            System.out.printf("*** \t %s\n", i + 1);
                            }
                        }
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
    }
}