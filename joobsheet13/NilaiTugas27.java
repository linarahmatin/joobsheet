package joobsheet13;
import java.util.Scanner;
public class NilaiTugas27 {
    static Scanner input = new Scanner(System.in);
    static int max = 0;
    static String minggu[] = {"minggu 1","minggu 2","minggu 3","minggu 4","minggu 5","minggu 6","minggu 7"};
    static String nama[] = {"Sari","Rina","yani","Dwi","Lusi"};
    static int nilai[][] = new int[5][7];

    public static void inputNilai() {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan nilai mahasiswa "+nama[i]+" "+minggu[j]+": ");
                nilai[i][j] = input.nextInt();
            }
            
        }   
    }
       public static void menampilkanNilai() {
        for (int i = 0; i < minggu.length; i++) {
            System.out.print("\t\t "+minggu[i]);

        }
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nama[i]+ "");
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("\t\t\t"+nilai[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    inputNilai();
        menampilkanNilai();
    }
}