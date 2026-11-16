
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class PickTheDay {

    public static void main(String[] args) {
        // Pick a specific date (Year, Month, Day) or use LocalDate.now()
        LocalDate date = LocalDate.of(2026, 11, 16);

        // 1. Get the day of the month (1-31)
        int dayOfMonth = date.getDayOfMonth(); // 16

        // 2. Get the DayOfWeek enum (MONDAY)
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // 3. Get the localized full name ("Monday")
        String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Day Enum: " + dayOfWeek);
        System.out.println("Day Name: " + dayName);
    }
}
