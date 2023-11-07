package joobsheet11;
import java.util.Scanner;

public class NestedLoop2341720029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
            }
            
            // Hitung nilai rata-rata kota
            double total = 0;
            for (double temp : temps[i]) {
                total += temp;
            }
            double rataRata = total / temps[i].length;
            
            System.out.println("\nRata-rata kota ke-" + (i + 1) + ": " + rataRata);
            System.out.println();
        }
    }
}