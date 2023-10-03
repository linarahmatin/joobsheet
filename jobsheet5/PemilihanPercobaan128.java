import java.util.Scanner;
public class PemilihanPercobaan128 {
    public static void main(String[] args) {
           Scanner input28 = new Scanner(System.in);
           String hasil;

           System.out.print ("Masukan angka: ");
           int angka = input28.nextInt();
    
           hasil = (angka % 2 == 0)? "Bilangan Genap" : "Bilangan negatif";
            System.out.println(angka + " adalah " + hasil);  
    }
}
