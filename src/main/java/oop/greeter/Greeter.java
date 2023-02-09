package oop.greeter;

import java.util.Locale;

public class Greeter {

    public String greet(String name) {
        String trimmedName = name.trim();
        String capitalizedName = capitalizeFirstLetter(trimmedName);
        return "Hello " + capitalizedName;
    }

    private String capitalizeFirstLetter(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

}
