import java.util.Scanner;
import java.util.regex.*;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        Pattern truePasswordPattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])._.{8,}");
        Matcher truePasswordMatcher = truePasswordPattern.matcher(password);

        if (truePasswordMatcher.matches()) {
            System.out.println("Пароль надёжен");
        } else {
            System.out.println("Пароль ненадёжен. Повторите ввод");
        }
    }
}