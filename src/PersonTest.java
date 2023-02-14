import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    

    // test constructor
    @org.junit.jupiter.api.Test
    @DisplayName("Test Person constructor")
    void Person() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        assertEquals("John", p.getFirstName());
        assertEquals("Smith", p.getLastName());
        assertEquals("Mr.", p.getTitle());
        assertEquals(1990, p.getYOB());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Set First Name to Peter")
    void setFirstName() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        p.setFirstName("Peter");
        assertEquals("Peter", p.getFirstName());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Set Last Name to Jones")
    void setLastName() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        p.setLastName("Jones");
        assertEquals("Jones", p.getLastName());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Set Title to Mrs.")
    void setTitle() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        p.setTitle("Mrs");
        assertEquals("Mrs", p.getTitle());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Set YOB to 1995")
    void setYOB() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        p.setYOB(1995);
        assertEquals(1995, p.getYOB());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Expect Full Name to be John Smith")
    void fullName() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        assertEquals("John Smith", p.fullName());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Expect Formal Name to be Mr. John Smith")
    void formalName() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        assertEquals("Mr. John Smith", p.formalName());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Expect getAge() to return 33 since YOB is 1990")
    void getAge() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        assertEquals("33", p.getAge());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Expect getAge(2000) to return 10 since YOB is 1990 and current year would be 2000")
    void getAge2() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        assertEquals("10", p.getAge(2000));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Expect age to not change if YOB is set to 2015 because it is not between 1940 and 2000")
    void setYOB2() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        System.out.println("Before: " + p.getYOB());
        p.setYOB(2015);
        System.out.println("After: " + p.getYOB());
        assertEquals(1990, p.getYOB());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Expect toCSVDataRecord to be: 00001, John, Smith, Mr., 1990")
    void toCSVDataRecord() {
        Person p = new Person("00001", "John", "Smith", "Mr.", 1990);
        assertEquals("00001, John, Smith, Mr., 1990", p.toCSVDataRecord());
    }
}