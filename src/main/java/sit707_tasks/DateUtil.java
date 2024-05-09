package sit707_tasks;

public class DateUtil {

    private static final String[] MONTHS = new String[] {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };
    
    private int day, month, year;
    
    public DateUtil(int day, int month, int year) {
        validateDate(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private void validateDate(int day, int month, int year) {
        if (day < 1 || day > 31)
            throw new IllegalArgumentException("Invalid day: " + day + ", expected range 1-31");
        if (month < 1 || month > 12)
            throw new IllegalArgumentException("Invalid month: " + month + ", expected range 1-12");
        if (year < 1700 || year > 3000)
            throw new IllegalArgumentException("Invalid year: " + year + ", expected range 1700-3000");
        if (day > monthDuration(month, year))
            throw new IllegalArgumentException("Invalid day: " + day + ", max day: " + monthDuration(month, year));
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    public void increment() {
        // Increment logic
    }
    
    public void decrement() {
        // Decrement logic
    }
    
    public static int monthDuration(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    @Override
    public String toString() {
        return day + " " + MONTHS[month - 1] + " " + year;
    }
}
