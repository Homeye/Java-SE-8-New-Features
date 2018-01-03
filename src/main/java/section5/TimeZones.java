package section5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class TimeZones {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(dateTimeFormatter.format(localDateTime));

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
        System.out.println(gmt);
        System.out.println(dateTimeFormatter.format(gmt));

        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(dateTimeFormatter.format(newYork));

        Set<String> timeZones = ZoneId.getAvailableZoneIds();
//        timeZones.forEach(zone -> System.out.println(zone));
        Predicate<String> condition = zone -> zone.contains("London");
        timeZones.forEach(zone -> {
            if (condition.test(zone)) {
                System.out.println(zone);
            }
        });
    }
}
