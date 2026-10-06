//import java.time.DayOfWeek;
//import java.time.LocalDate;

public class SundayCounter {
    int year;
    int month;
    int noOfDays;
    int noOfMonths;
    int date;
    int noOfSundays;
    boolean leapyear;
    int dayOfWeek;

    SundayCounter(int year, int noOfMonths, int date, int noOfSundays) {
        this.year = year;
        this.noOfMonths = noOfMonths;
        this.date = date;
        this.noOfSundays = noOfSundays;
        this.leapyear = isLeapYear(year);
    }

    if(dayOfWeek == 7) {
        dayOfWeek = 0;
    
    }
    if(date>noOfDays) {
        date = 1;
        month++;
    }
    month = 1;
    while (month <= 12) {
        day = 1;
        while (day <= noOfDays) {
            if (day == date && dayOfWeek == 0) {
                noOfSundays++;
            }
            dayOfWeek++;
            if (dayOfWeek > 7) {
                dayOfWeek = 1;
            }
            day++;
        }
       month++;
    

        
        month++;
    }


    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    int getDaysInMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return leapyear ? 29 : 28;
        }
        return 0;
    }

    void checkDate() {
        noOfSundays = 0;

        for (int currentMonth = 1; currentMonth <= 12; currentMonth++) {
            month = currentMonth;
            noOfDays = getDaysInMonth(month);

            for (int day = 1; day <= noOfDays; day++) {
                LocalDate currentDate = LocalDate.of(year, month, day);
                if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    noOfSundays++;
                }
            }
        }
    }

    void displaySundayCounter() {
        System.out.println("Number of Sundays: " + noOfSundays + " in all " + noOfMonths + " months of " + year + ".");
    }

    public static void main(String[] args) {
        SundayCounter counter = new SundayCounter(2026, 12, 1, 0);
        counter.checkDate();
        counter.displaySundayCounter();
    }
}