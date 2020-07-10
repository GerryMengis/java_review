package HackeRank;

import java.util.*;
import java.io.*;
import java.math.*;
import java.time.LocalDate;

class Recursive
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum = 0;

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum = a;
            
            for(int j=0; j<n; j++){
            sum += (int) (Math.pow(2, j) * b);
            System.out.print(sum + " ");
            }
            System.out.println("\nTest it again ");

        }
        in.close();

        LocalDate ld = LocalDate.of(2020, 06, 10);
        System.out.println(ld.getDayOfWeek());

        for(int i=2; i<=t; i++){
            if(!(t % i == 0)){
                System.out.println(i);
            }
        }

    }

}