package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        double x;
        System.out.println("Enter x");
        x = sc.nextDouble();
        System.out.println(x * 2);


        sc.close();
    }
}
