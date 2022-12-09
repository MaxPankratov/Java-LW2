import java.util.Scanner;
import java.util.regex.*;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String date = scanner.nextLine();

        Pattern trueDatePattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/19\\d{2}|[2-9]\\d{3}");
        Matcher trueDateMatcher = trueDatePattern.matcher(date);

        Pattern wrongFebruaryDayPattern = Pattern.compile("(3[01])/02/19\\d{2}|[2-9]\\d{3}"); //Для февраля
        Matcher wrongFebruaryDayMatcher = wrongFebruaryDayPattern.matcher(date);

        Pattern alternativeDatePattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[-.\s,](0[1-9]|1[012])[-.\s,]19\\d{2}|[2-9]\\d{3}");
        Matcher alternativeDateMatcher = alternativeDatePattern.matcher(date);

        if ( trueDateMatcher.matches() && !(wrongFebruaryDayMatcher.matches()) ) {
            System.out.println("Введённое выражение является датой");
        } else if (alternativeDateMatcher.matches()) {
            System.out.println("Введённое выражение не соответствует заданному формату даты dd/mm/yyyy");
        } else {
            System.out.println("Введённое выражение не является датой");
        }
    }
}
