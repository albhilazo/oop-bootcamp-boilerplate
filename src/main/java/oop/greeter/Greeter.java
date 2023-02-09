package oop.greeter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class Greeter {

    private static final String DEFAULT = "Hello";
    private static final String MORNING = "Good morning";
    private static final String EVENING = "Good evening";
    private static final String NIGHT = "Good night";

    private LocalTime time = LocalTime.now();

    public Greeter(LocalTime time) {
        this.time = time;
    }

    public String greet(String name) {
        String trimmedName = name.trim();
        String capitalizedName = capitalizeFirstLetter(trimmedName);
        return greetingByTime() + " " + capitalizedName;
    }

    private String capitalizeFirstLetter(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    private String greetingByTime() {
        if (isMorning()) {
            return MORNING;
        }
        if (isEvening()) {
            return EVENING;
        }
        if (isNight()) {
            return NIGHT;
        }
        return DEFAULT;
    }

    private boolean isMorning() {
        return time.isAfter(LocalTime.of(6, 0, 0)) &&
                time.isBefore(LocalTime.of(12, 0, 1));
    }

    private boolean isEvening() {
        return time.isAfter(LocalTime.of(18, 00, 00)) &&
                time.isBefore(LocalTime.of(22, 0, 1));
    }

    private boolean isNight() {
        return time.isAfter(LocalTime.of(22, 0, 0)) ||
                time.isBefore(LocalTime.of(6, 0, 1));
    }

}
