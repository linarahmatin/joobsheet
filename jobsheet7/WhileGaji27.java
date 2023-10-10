import java.util.Scanner;

public class WhileGaji27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input27.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            String jabatan = input27.next();

            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input27.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            i++;
        }

        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
           
