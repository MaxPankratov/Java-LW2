import java.util.Scanner;
import java.util.regex.*;

public class Task_2 {

    public static void main(String[] args) {

        String password;

        Pattern truePasswordPattern = Pattern.compile("[a-zA-Z0-9_]{8,}");

        Pattern uppercasePasswordPattern = Pattern.compile("[A-Z]");

        Pattern lowercasePasswordPattern = Pattern.compile("[a-z]");

        Pattern digitPasswordPattern = Pattern.compile("[0-9]");

        boolean flag;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();

            if (truePasswordPattern.matcher(password).matches() && uppercasePasswordPattern.matcher(password).find() && lowercasePasswordPattern.matcher(password).find() && digitPasswordPattern.matcher(password).find()) {
                flag = true;
                System.out.println("Пароль надёжен");
            } else {
                flag = false;
                System.out.println("Пароль ненадёжен. Повторите ввод");}
        } while (!flag);

    }
}
