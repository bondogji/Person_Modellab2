import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    @DisplayName("Test Worker constructor")
    void Worker() {
        Worker w = new Worker("00001", "John", "Smith", "Mr.", 1990, 20.00);
        assertEquals("John", w.getFirstName());
        assertEquals("Smith", w.getLastName());
        assertEquals("Mr.", w.getTitle());
        assertEquals(1990, w.getYOB());
        assertEquals(20.00, w.getHourlyPayRate());
    }

    @Test
    @DisplayName("Expect Weekly Pay to be the Hourly Pay Rate multiplied by the hours worked if the hours worked is less than or equal to 40")
    void calculateWeeklyPay() {
        Worker w = new Worker("00001", "John", "Smith", "Mr.", 1990, 20.00);
        assertEquals(40 * w.getHourlyPayRate(), w.calculateWeeklyPay(40));
    }

    @Test
    @DisplayName("Expect Weekly Pay to be the Hourly Pay Rate multiplied by 40 plus the Hourly Pay Rate multiplied by 1.5 times the hours worked minus 40 if the hours worked is greater than 40")
    void calculateWeeklyPay2() {
        Worker w = new Worker("00001", "John", "Smith", "Mr.", 1990, 20.00);
        double workHours = 80;
        double regularPay = 40 * w.getHourlyPayRate();
        double overtimePay = (workHours - 40) * w.getHourlyPayRate() * 1.5;
        assertEquals(regularPay + overtimePay, w.calculateWeeklyPay(workHours));
    }

    @Test
    @DisplayName("Expect displayWeeklyPay to return the Weekly Pay using the format \"Regular Hours: %.2f, Regular Pay: $%.2f, Overtime Hours: %.2f, Overtime Pay: $%.2f, Total Pay: $%.2f\"")
    void displayWeeklyPay() {
        Worker w = new Worker("00001", "John", "Smith", "Mr.", 1990, 20.00);
        assertEquals("Regular Hours: 40.00, Regular Pay: $800.00, Overtime Hours: 0.00, Overtime Pay: $0.00, Total Pay: $800.00", w.displayWeeklyPay(40));
        assertEquals("Regular Hours: 40.00, Regular Pay: $800.00, Overtime Hours: 40.00, Overtime Pay: $1200.00, Total Pay: $2000.00", w.displayWeeklyPay(80));
    }
}