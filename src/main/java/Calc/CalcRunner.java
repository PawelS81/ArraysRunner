package Calc;

import java.util.InputMismatchException;
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

        Calculator calc = new Calculator();
        boolean error = false;
        do {
            try {

                System.out.println("Podaj pierwszą liczbę: ");
                Scanner x = new Scanner(System.in);
                int a = x.nextInt();

                System.out.println("Podaj drugą liczbę: ");
                Scanner y = new Scanner(System.in);
                int b = y.nextInt();

                System.out.println("Podałeś liczby: A: " + a + ", B: " + b);
                System.out.println("Wybierz rodzaj działania 1-5:  ");
                System.out.println("'1' + dodawanie");
                System.out.println("'2' - odejmowanie");
                System.out.println("'3' * mnożenie");
                System.out.println("'4' / dzielenie");
                System.out.println("'5' ^ potęgowanie");

                Scanner c = new Scanner(System.in);
                int choosen = c.nextInt();
                if (choosen >= 0 && choosen <= 5) {
                    error = false;
                    switch (choosen) {
                        case 1:
                            System.out.println(a + " + " + b + " = " + calc.add(a, b));
                            break;
                        case 2:
                            System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
                            break;
                        case 3:
                            System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
                            break;
                        case 4:
                            System.out.println(a + " / " + b + " = " + calc.divide(a, b));
                            break;
                        case 5:
                            System.out.println(a + " ^ " + b + " = " + calc.MathPow(a, b));
                            break;
                    }
                } else {
                    System.out.println("Podaj cyfrę od 1 do 5, spróbuj jeszcze raz.");
                    error = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Podano niewłaściwe dane, spróbuj jeszcze raz.");
                error = true;
            } catch (ArithmeticException z) {
                System.out.println("Dzielenie przez 0 jest niewykonalne!");
                error = true;
            }
        } while (error = true);
            }
    }


