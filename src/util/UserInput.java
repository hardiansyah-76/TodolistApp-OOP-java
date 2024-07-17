package util;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String input (String info) {
        System.out.println(info + ": ");

        var data = scanner.nextLine();
        return data;
    }
}
