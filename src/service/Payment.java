package service;

import java.time.LocalTime;
import java.util.Locale;

public class Payment {
    LocalTime entry;
    LocalTime exit;

    public Payment(LocalTime entry, LocalTime exit) {
        this.entry = entry;
        this.exit = exit;
        System.out.println("total charge = "+(exit.getSecond()-entry.getSecond())*10);
    }
}
