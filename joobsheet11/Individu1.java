package joobsheet11;
import java.util.Scanner;
public class Individu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3 atau lebih.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("  "); // Cetak spasi
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
    

