import java.util.Scanner;
public class Pemilihan2Percobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.println("Masukkan sudut 1:");
        float sudut1 = input27.nextFloat();
        System.out.println("Masukkan sudut 2:");
        float sudut2 = input27.nextFloat();
        System.out.println("Masukkan sudut 3:");
        float sudut3 = input27.nextFloat();
        float totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut3 == sudut1) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }else{
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
            } else
            System.out.println("Bukan Segitiga");
        }
    } 

