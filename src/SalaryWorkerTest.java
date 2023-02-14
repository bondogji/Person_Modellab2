import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    @Test
    @DisplayName("Test SalaryWorker constructor")
    void SalaryWorker() {
        SalaryWorker sw = new SalaryWorker("00001", "John", "Smith", "Mr.", 1990, 20.00, 100000.00);
        assertEquals("John", sw.getFirstName());
        assertEquals("Smith", sw.getLastName());
        assertEquals("Mr.", sw.getTitle());
        assertEquals(1990, sw.getYOB());
        assertEquals(20.00, sw.getHourlyPayRate());
        assertEquals(100000.00, sw.getAnnualSalary());
    }

    @Test
    @DisplayName("Expect Weekly Pay to be the Annual Salary divided by 52 that is $1923.076923076923 whether the hours worked is 40 or 80")
    void calculateWeeklyPay() {
        SalaryWorker sw = new SalaryWorker("00001", "John", "Smith", "Mr.", 1990, 20.00, 100000.00);
        assertEquals(1923.076923076923, sw.calculateWeeklyPay(40));
        assertEquals(1923.076923076923, sw.calculateWeeklyPay(80));
    }

    @Test
    @DisplayName("Expect displayWeeklyPay to return the Weekly Pay and Annual Salary using the format \"Weekly Pay: $%.2f, Annual Salary: $%.2f\"")
    void displayWeeklyPay() {
        SalaryWorker sw = new SalaryWorker("00001", "John", "Smith", "Mr.", 1990, 20.00, 100000.00);
        assertEquals("Weekly Pay: $1923.08, Annual Salary: $100000.00", sw.displayWeeklyPay(40));
        assertEquals("Weekly Pay: $1923.08, Annual Salary: $100000.00", sw.displayWeeklyPay(80));
    }
}