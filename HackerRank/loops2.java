package HackerRank;

import java.util.Scanner;

public class loops2 {

    public static void main(String []argh) {
        
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int j;

        for(int i=0; i < q ; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            
            for (j = 0; j < n; j++) {

                a += Math.pow(2, j) * b;
                System.out.print(a + " ");

            } 

            System.out.println();

        }

        in.close();

    }
    
}