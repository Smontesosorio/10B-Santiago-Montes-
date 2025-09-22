public class MinutesToYearsDays {
    public static void main(String[] args) {
        // Given number of minutes
        long minutes = 3456789;

        // Constants
        long minutesInHour = 60;
        long hoursInDay = 24;
        long daysInYear = 365;

        // Convert minutes to days
        long days = minutes / (minutesInHour * hoursInDay);

        // Calculate years and remaining days
        long years = days / daysInYear;
        long remainingDays = days % daysInYear;

        // Output
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}
