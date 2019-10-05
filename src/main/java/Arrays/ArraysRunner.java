package Arrays;

public class ArraysRunner {

    public static void main(String[] args) {

        int[] nextNumbersTab = new int[10];
        for (int i = 0; i < nextNumbersTab.length; i++) {
            nextNumbersTab[i] = i;
            System.out.print(nextNumbersTab[i] + ", ");
        }

        System.out.println();
        System.out.println("Teraz co druga liczba w tabeli jest zwiększona o wartośc jej poprzednika");

        int[] tab2 = new int[10];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i;
            if (tab2[i] % 2 != 0) {
                tab2[i] = i + i - 1;
            } else {
                tab2[i] = i;
            }
            System.out.print(tab2[i] + ", ");
        }
        System.out.println();
        System.out.println("Teraz każdą liczbę parzystą dzielimy przez 2");

        int[] tab3 = new int[10];
        for (int i = 0; i < tab3.length; i++) {
            if (i % 2 != 0) {
                tab3[i] = i + i - 1;
            } else {
                tab3[i] = i / 2;
            }
            System.out.print(tab3[i] + ", ");
        }
        System.out.println();
        System.out.println("Teraz sumujemy wszystkie liczby w tablicy");


        int suma = 0;
        int nr = 0;
        while (nr < tab3.length) {
            suma = suma + tab3[nr];
            nr++;
        }

        System.out.print("Suma liczb w tabeli to: " + suma);
    }
}