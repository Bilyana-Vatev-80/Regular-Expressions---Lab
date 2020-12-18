import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dates = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matchDates = pattern.matcher(dates);
        while (matchDates.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n", matchDates.group("day"), matchDates.group("month"),
                    matchDates.group("year"));
        }
    }
}
