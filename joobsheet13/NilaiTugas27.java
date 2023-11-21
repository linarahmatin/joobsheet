package joobsheet13;
import java.util.Scanner;
public class NilaiTugas27 {
    static Scanner scanner = new Scanner(System.in);
    // Fungsi untuk meninputkan data nilai mahasiswa
    static double[] [] inputNilaiMhs(int jmlMhs, int jmlMinggu) {
    double[][] nilaiMhs = new double[jmlMhs][jmlMinggu];

    for (int i = 0; i < jmlMhs; i++) {
         System.out.println("Mahasiswa ke-" + ( i+ 1) + ":"); 
         for (int j = 0; j < jmlMinggu; j++) { 
              System.out.print("Masukkan nilai untuk minggu ke-" + (j + 1) + ": ");
              nilaiMhs[i][j] = scanner.nextDouble(); 
       }
    }
return nilaiMhs;
}
   // Fungsi untuk menampilkan seluruh nilai mahasiswa 
   static void tampilkanNilaiMhs(double[] [] nilaiMhs) { 
        System.out.println("\nData Nilai Mahasiswa:");
         for (int i = 0; i < nilaiMhs.length; i++) { 
            System.out.println("Mahasiswa ke-" + (i + 1) + ":"); 
            for (int j = 0; j < nilaiMhs[1].length; j++) { 
                System.out.println("Minggu ke-" + (j + 1) + ":" + nilaiMhs[i][j]);
       }
    }
}
     // Fungsi untuk mencari hari keberapakah terdapat nilai tertinggi 
     static int cariHariNilaiTertinggi (double[] [] nilaiMhs) {
         int mingguTertinggi = 1; 
         double nilaiTertinggi = nilaiMhs[0][0];

          for (int j = 0; j < nilaiMhs[0].length; j++) {
               for (int i = 0; i < nilaiMhs.length; i++) { 
                   if (nilaiMhs[1][j] > nilaiTertinggi) {
                     nilaiTertinggi = nilaiMhs[1][j]; 
                     mingguTertinggi = j + 1;
       }
   }
}
    return mingguTertinggi;
}

// Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
static void tampilkanMhsTertinggi (double[][] nilaiMhs, int mingguTertinggi) {
    int mhsTertinggi = -1;
    double nilaiTertinggi = nilaiMhs[0][mingguTertinggi - 1];

    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i][mingguTertinggi - 1]> nilaiTertinggi) { 
            nilaiTertinggi = nilaiMhs[i][mingguTertinggi - 1]; 
            mhsTertinggi = 1 + 1;
        }
    }

    if (mhsTertinggi != -1) {
        System.out.println("\nMahasiswa dengan nilai tertinggi:");
        System.out.println("Mahasiswa ke-" + mhsTertinggi +" pada minggu ke-" + mingguTertinggi + " dengan nilai:" + nilaiTertinggi);
    } else {
        System.out.println("Tidak ada mahasiswa dengan nilai tertinggi pada minggu ke-" + mingguTertinggi);
    }
} 
    public static void main(String[] args) {
        int jmlMhs = 5;
        int jmlMinggu = 7;
    
        double[][] nilaiMhs = inputNilaiMhs(jmlMhs, jmlMinggu);

        tampilkanNilaiMhs(nilaiMhs);
    
        int mingguTertinggi= cariHariNilaiTertinggi (nilaiMhs);
        System.out.println("\nNilai tertinggi ditemukan pada minggu ke-" + mingguTertinggi);
    
        tampilkanMhsTertinggi(nilaiMhs, mingguTertinggi);

        // Menutup objek Scanner
        scanner.close();
    }
}
    
   