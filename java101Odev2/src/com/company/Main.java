package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextDouble()*2.14;
        System.out.print("Elma Kaç Kilo ? :");
        elma=input.nextDouble()*3.67;
        System.out.print("Domates Kaç Kilo ? :");
        domates=input.nextDouble()*1.11;
        System.out.print("Muz Kaç Kilo ? :");
        muz=input.nextDouble()*0.95;
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcan=input.nextDouble()*5.00;

        double tutar = armut+elma+domates+muz+patlıcan;
        System.out.print("Toplam Tutar = " + tutar);
    }
}
