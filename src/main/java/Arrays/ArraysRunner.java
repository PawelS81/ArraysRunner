package Arrays;

public class ArraysRunner {

    public static void main(String[] args) {

        System.out.println("Wyświetlam tabelę wypełnioną liczbami od 0 do 9");
        int[] nextNumbersTab = new int[10];
        for (int i = 0; i < nextNumbersTab.length; i++) {
            nextNumbersTab[i] = i;
            System.out.print(nextNumbersTab[i] + " ");
        }
        System.out.println();
        System.out.println("Teraz co druga liczba w tabeli jest zwiększona o wartośc jej poprzednika");

        for (int i = 0; i < nextNumbersTab.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + i - 1 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Teraz każdą liczbę parzystą dzielimy przez 2");
        for (int i = 0; i < nextNumbersTab.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + i - 1 + " ");
            } else {
                System.out.print(i / 2 + " ");
            }
        }
        System.out.println();
        System.out.println("Teraz sumujemy wszystkie liczby w tablicy");
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < nextNumbersTab.length; i++) {
            if (i % 2 != 0) {
                oddSum += (i + i - 1);
            } else {
                evenSum += (i / 2);
            }
            int sum = oddSum + evenSum;
            System.out.println("Suma liczb w tabeli to: " + sum);

        // Tu mam problem - nie wiem jak napisać aby drukowało tylko ostatni wynik.
        }
    }
}