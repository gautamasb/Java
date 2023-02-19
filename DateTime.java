import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime{
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Date YYYY-MM-DD: ");
            String date1str = sc.next();
            String date2str = sc.next();
            LocalDate date1 = LocalDate.parse(date1str,DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate date2 = LocalDate.parse(date2str,DateTimeFormatter.ISO_LOCAL_DATE);
            Period p = Period.between(date1, date2);
            extracted2(p);
        }
    }

    private static void extracted2(Period p) {
        System.out.println(extracted(p));
    }

    private static String extracted(Period p) {
        return p.getYears()+"-"+p.getMonths()+"-"+p.getDays();
    }
}