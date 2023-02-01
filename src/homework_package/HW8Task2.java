package homework_package;


import java.util.Arrays;
import java.util.Scanner;

public class HW8Task2 {
    public static void main(String[] args) {

        int n = 4;
        String keyword = "hello";
        String keyword2 = "friends";
        String[] lines = new String[n];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки:");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(lines));

        for (String line : lines) {
            if (line.contains(keyword) & line.contains(keyword2)) {
                System.out.println("String: \"" + line + "\" contains " + keyword);
            }
        }

        // логическое И &
        // логическое ИЛИ ||

    }
}
