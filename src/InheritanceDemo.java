import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> data = new ArrayList<Worker>();
        createWorkers(data);

        int[] weeklyPeriods = {40, 50, 40};
        for (int i = 0; i < weeklyPeriods.length; i++) {
            System.out.println("Week #" + (i + 1) + ", Hours worked: " + weeklyPeriods[i]);
            // display header: ID, Full Name, Week Pay
            String header = String.format("%-10s %-20s %-20s", "ID", "Full Name", "Week Pay");
            System.out.println(header);
            for (Worker w : data) {
                // display ID, Full Name, Week Pay
                String line = String.format("%-10s %-20s $%-20.2f", w.getID(), w.fullName(), w.calculateWeeklyPay(weeklyPeriods[i]));
                System.out.println(line);
            }
            System.out.println();
        }

    }

    private static void createWorkers(ArrayList<Worker> data) {
        // create 3 workers
        //Pick reasonable hourly rates for the workers and reasonable salary rates for the salaryworkers.  Of course all workers have names, ids, and YOBs.
        data.add(new Worker("001", "John", "Doe", "Mr.", 1978, 20.00));
        data.add(new Worker("002", "Jane", "Williams", "Mrs.", 1984, 21.5));
        data.add(new Worker("003", "Alex", "Smith", "Mr.", 1980, 14.75));
        System.out.println("******************************** Workers ********************************\n");
        String header = String.format("%-10s %-20s %-20s", "ID", "Full Name", "Hourly Pay Rate");
        System.out.println(header);
        for (Worker w : data) {
            String line = String.format("%-10s %-20s $%-20.2f", w.getID(), w.fullName(), w.getHourlyPayRate());
            System.out.println(line);
        }
        System.out.println();

        // create 3 SalaryWorkers
        //Pick reasonable hourly rates for the workers and reasonable salary rates for the salaryworkers.  Of course all workers have names, ids, and YOBs.
        data.add(new SalaryWorker("004", "Martha", "Jones", "Mrs.", 1970, 18.65, 50000));
        data.add(new SalaryWorker("005", "Sally", "Johnson", "Ms.", 1997, 22.00, 68510));
        data.add(new SalaryWorker("006", "Bob", "Brown", "Mr.", 1985, 15.00, 40000));
        System.out.println("******************************** Salary Workers ********************************\n");
        header = String.format("%-10s %-20s %-20s", "ID", "Full Name", "Salary");
        System.out.println(header);
        for (int i = 3; i < data.size(); i++) {
            SalaryWorker sw = (SalaryWorker) data.get(i);
            String line = String.format("%-10s %-20s $%-20.2f", sw.getID(), sw.fullName(), sw.getAnnualSalary());
            System.out.println(line);
        }
        System.out.println("\n------------------------------------------------------------------------\n");

    }
}