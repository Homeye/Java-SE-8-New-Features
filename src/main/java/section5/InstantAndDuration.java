package section5;

import java.time.Duration;
import java.time.Instant;

public class InstantAndDuration {

    public static void main(String[] args) {

        Instant start = Instant.now();
        System.out.println(start);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();
        System.out.println(end);

        Duration elapsed = Duration.between(start, end);
        System.out.println("Elapsed: " + elapsed.toMillis() + " milliseconds.");
    }
}
