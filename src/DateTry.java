import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTry {

    public static void main (String...argv) {
        String dateString = "20180219230000+0000";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMDDhhmmss+xxxx");
        LocalDateTime localDate1 = LocalDateTime.parse(dateString, formatter);
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateString);
        LocalDate localDate = zonedDateTime.plusHours(Duration.ofSeconds(zonedDateTime.getOffset().getTotalSeconds()).toHours()).toLocalDate();
        System.out.println(localDate);
    }

}
