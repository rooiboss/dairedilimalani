package Daireninalani;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {

        double pi=3.14,a,r,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz :");
        r = input.nextDouble();
        System.out.print("a açısını giriniz : ");
        a =input.nextDouble();

        sonuc = (pi*(r*r)*a)/360;
        System.out.print("Dilimin Alanı : "+sonuc);








    }
}
