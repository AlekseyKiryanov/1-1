package vsu.kiryanovao.task0101;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        b = b + c;
        c = b - c;
        b = b - c;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("%.3f%n",a);
        System.out.printf("%.3f%n",b);
        System.out.printf("%.3f%n",c);

    }
}
