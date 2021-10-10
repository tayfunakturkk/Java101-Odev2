package Ödev2;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutkg,elmakg,domateskg,muzkg,patlicankg;

        System.out.print("Armut Kaç Kilo? :");
        armutkg=input.nextInt();

        System.out.print("Elma Kaç Kilo? :");
        elmakg=input.nextInt();

        System.out.print("Domates Kaç Kilo? :");
        domateskg=input.nextInt();

        System.out.print("Muz Kaç Kilo? :");
        muzkg=input.nextInt();

        System.out.print("Patlıcan Kaç Kg? :");
        patlicankg=input.nextInt();

        double toplam=(armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);
        System.out.print("Toplam Tutar:"+toplam +"TL");






    }
}
