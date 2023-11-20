package joobsheet13;
import java.util.Scanner;
public class UcapanTerimakasih_27 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapanTambahan = "Your guidance has truly made a positive impact on my life.";
        UcapanTambahan(ucapanTambahan);
    }
}
