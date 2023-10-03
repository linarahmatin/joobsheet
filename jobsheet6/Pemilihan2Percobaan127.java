import java.util.Scanner;
public class Pemilihan2Percobaan127 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        double tahun;

        System.out.println("Masukkan tahun :");
        tahun = input27.nextDouble();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0){
                System.out.println("Tahun Kabisat"); 
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }  
}
