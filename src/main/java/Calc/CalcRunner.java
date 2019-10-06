package Calc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalcRunner {
//    Zadania do domu:
//            1. Kalkulator wykonujący następujące działania:
//    a) dodawanie
//    b) odejmowanie
//    c) mnożenie
//    d) dzielenie
//    e) potęgowanie
//    Uwzględnijcie proszę wszystkie możliwości i wyjątki (np. dzielenie przez zero)

    public static void main(String[] args) {

        System.out.println("Podaj pierwszą liczbę: ");
        Scanner x = new Scanner(System.in);
        double a = x.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        Scanner y = new Scanner(System.in);
        double b = y.nextInt();

        System.out.println("Podałeś liczby: A: " + a + ", B: " + b );
        System.out.println("Wybierz rodzaj działania 1-5:  ");
        System.out.println("'1' + dodawanie");
        System.out.println("'2' - odejmowanie");
        System.out.println("'3' * mnożenie");
        System.out.println("'4' / dzielenie");
        System.out.println("'5' ^ potęgowanie");
        Scanner c = new Scanner(System.in);
        int choice = c.nextInt();



    }

}
