import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran1 = 0.18,kdvOran2 = 0.08,kdvliTutar,kdvTutar,oran;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = inp.nextDouble();

        kdvTutar = tutar>1000 ? tutar * kdvOran2 : tutar * kdvOran1;
        kdvliTutar = tutar + kdvTutar;
        oran = tutar<1000 ? kdvOran2 : kdvOran1;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + oran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);



    }
}