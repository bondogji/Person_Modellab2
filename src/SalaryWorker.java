public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    public String displayWeeklyPay(double hoursWorked) {
        return String.format("Weekly Pay: $%.2f, Annual Salary: $%.2f", calculateWeeklyPay(hoursWorked), annualSalary);
    }
}
