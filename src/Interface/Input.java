package Interface;

import java.time.LocalDate;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static double getDouble(String message) {
        System.out.println(message);
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

    public static String getString(String message) {
        System.out.println(message);
        String userString = scanner.nextLine();
        return userString;
    }

    public static int getInt(String message) {
        System.out.print(message);
        int userInt = scanner.nextInt();
        return userInt;
    }

    public static LocalDate getDate() {
        System.out.println("Digite a data.");
        System.out.print("Dia: ");
        int day = scanner.nextInt();
        System.out.print("Mês: ");
        int month = scanner.nextInt();
        System.out.print("Ano: ");
        int year = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }
}
