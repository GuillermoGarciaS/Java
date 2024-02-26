package HackerRank;

import java.util.Scanner;

public class endOfLife {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contador = 1;

        while (sc.hasNext()) {

            String input = sc.nextLine();
            System.out.print(contador + " " + input);
            System.out.println();
            contador++;

        }

        sc.close();

    }
    
}