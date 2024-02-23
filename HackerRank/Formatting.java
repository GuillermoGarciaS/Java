package HackerRank;

import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            
            String s1 = sc.next();
            int x = sc.nextInt();


            while (s1.length() > 10) {
                
                System.out.println("Your language name is too long, please enter again:");
                s1 = sc.next();
                
            }

            String formattedNumber = String.format("%03d", x);

            System.out.printf("%-15s%s\n", s1, formattedNumber);
        }
        
        System.out.println("================================");

        sc.close();
        
    }

}