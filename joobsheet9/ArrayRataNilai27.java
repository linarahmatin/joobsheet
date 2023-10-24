package joobsheet9;
import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = input.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2Lulus;
        double rata2TidakLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }

        int jumlahLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) { 
                jumlahLulus++;
            }
        }

        rata2Lulus = totalLulus / jumlahLulus;
        rata2TidakLulus = totalTidakLulus / (nilaiMhs.length - jumlahLulus);

        System.out.println();
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
