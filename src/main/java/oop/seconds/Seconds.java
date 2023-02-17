package oop.seconds;

public class Seconds {

    public static String format(int seconds) {
        Integer restSeconds = seconds % 60;
        Integer minutes = (seconds % 3600) / 60;
        Integer hours = seconds / 3600;
        return String.format("%02d:%02d:%02d", hours, minutes, restSeconds);
    }
}
