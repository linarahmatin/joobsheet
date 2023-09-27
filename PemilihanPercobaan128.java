import java.util.Scanner;
public class PemilihanPercobaan128 {
    public static void main(String[] args) {
           Scanner input28 = new Scanner(System.in);
        System.out.print ("Masukan angka: ");
        int angka = input28.nextInt();
        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else
        System.out.println("Angka "+angka+" bilangan ganjil");
    }
}
