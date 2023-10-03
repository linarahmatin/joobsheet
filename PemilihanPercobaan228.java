import java.util.Scanner;
public class PemilihanPercobaan228 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        double nilai;

        System.out.println("Masukkan nilai :");
        nilai = input28.nextDouble();
        
        if (nilai > 80) {
         System.out.println("hasil nilainya adalah " +nilai+ " A");
        }else if (nilai > 73){
         System.out.println("hasil nilainya adalah " +nilai+ " B+");
        }else if (nilai > 65){
         System.out.println("hasil nilainya adalah " +nilai+ " B");
        }else if (nilai > 60){
         System.out.println("hasil nilainya adalah " +nilai+ " C+"); 
        }else if (nilai > 50){ 
         System.out.println("hasil nilainya adalah " +nilai+ " C");
        }else if (nilai > 39){
         System.out.println("hasil nilainya adalah " +nilai+ " D");
        }else{
         System.out.println("hasil nilainya adalah " +nilai+ " E");
        }
     }
}