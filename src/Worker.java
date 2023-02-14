public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        // Hours under 40 are at the HourlyRate, hours above 40 are at time and a half (1.5)
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            return (40 * hourlyPayRate) + ((hoursWorked - 40) * hourlyPayRate * 1.5);
        }
    }

    /*
    displayWeeklyPay should indicate the number of hours of regular pay (40) and the total and
     the number of hours of overtime pay and the total as well as the total combined pay.
     */
    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = 40 * hourlyPayRate;
        double overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
        double totalPay = regularPay + overtimePay;
        double regularHours = Math.min(hoursWorked, 40);
        return String.format("Regular Hours: %.2f, Regular Pay: $%.2f, Overtime Hours: %.2f, Overtime Pay: $%.2f, Total Pay: $%.2f", regularHours, regularPay, hoursWorked - 40, overtimePay, totalPay);
    }


}
