import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        
        String password = "abc";
        
        Pattern truePasswordPattern = Pattern.compile("[a-zA-Z0-9_]{8,}");
        Matcher truePasswordMatcher = truePasswordPattern.matcher(password);
        
        Pattern uppercasePasswordPattern = Pattern.compile("[A-Z]");
        Matcher uppercasePasswordMatcher = uppercasePasswordPattern.matcher(password);
        
        Pattern lowercasePasswordPattern = Pattern.compile("[a-z]");
        Matcher lowerPasswordMatcher = lowercasePasswordPattern.matcher(password);
        
        Pattern digitPasswordPattern = Pattern.compile("[0-9]");
        Matcher digitPasswordMatcher = digitPasswordPattern.matcher(password);
        
        boolean flag = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();

            if (truePasswordMatcher.matches() && uppercasePasswordMatcher.matches() && lowerPasswordMatcher.matches() && digitPasswordMatcher.matches()) {
                flag = true;
                System.out.println("Пароль надёжен");
            } else {
                flag = false;
                System.out.println("Пароль ненадёжен. Повторите ввод");}
            } while (flag == false);
         
    }
}
