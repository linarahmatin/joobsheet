import java.util.Scanner;
public class Gaji28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
    int jmlMasuk, jmlTdkMasuk, totGaji;
    int gaji, potGaji;

    System.out.println("masukkan gaji ");
    gaji=input.nextInt();
    System.out.println("Masukkan potongan gaji ");
    potGaji=input.nextInt();
    System.out.println("masukkan Jumlah Hari Masuk Kerja Anda ");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan Jmlah Hari Tidak Masuk Anda ");
    jmlTdkMasuk=input.nextInt();
    totGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
    System.out.println("Gaji yang anda terima adalah " +totGaji);
    }
    
  
}
