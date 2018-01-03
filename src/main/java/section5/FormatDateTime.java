package section5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatDateTime {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_DATE;
        System.out.println(dateTimeFormatter1.format(currentDate));

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_TIME;
        System.out.println(dateTimeFormatter2.format(currentTime));

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(dateTimeFormatter3.format(currentDateTime));

        DateTimeFormatter dateTimeFormatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(dateTimeFormatterLong.format(currentDateTime));

        DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTimeFormatterShort.format(currentDateTime));

        String shortFormat = dateTimeFormatterShort.withLocale(Locale.FRENCH).format(currentDateTime);
        String longFormat = dateTimeFormatterLong.withLocale(Locale.FRENCH).format(currentDateTime);
        System.out.println(shortFormat);
        System.out.println(longFormat);

        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral("||")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("||")
                .appendValue(ChronoField.YEAR);
        DateTimeFormatter builderDateTimeFormatter = dateTimeFormatterBuilder.toFormatter();
        System.out.println(builderDateTimeFormatter.format(currentDateTime));
    }
}
