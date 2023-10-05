import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import contacts.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    // make objects static so there is one occurence of contact object to test with
    private static Contact joe;
    private static Contact jane;

    @BeforeAll
    static void createContacts() {
        // create contact objects to test with before calling any test methods
        joe = new Contact("Joe", "Smith", "jsmith@gmail.com", false);
        jane = new Contact("Jane", "Smith", "jsmith@gmail.com", true);
    }

    @Test
    void getName() {
        assertEquals("Joe Smith", joe.getName());
        assertEquals("Jane Smith", jane.getName());
    }

    @Test
    void getNum() {
        // joe is the first object created so contact number is 1
        assertEquals(1, joe.getNum());

        // jane is the second object created so contact number is 2
        assertEquals(2, jane.getNum());
    }

    @Test
    void testToString() {
        assertEquals("Contact: #1 Joe Smith (jsmith@gmail.com)", joe.toString());
        assertEquals("Contact: #2 Jane Smith (jsmith@gmail.com)", jane.toString());
    }

    /*  add your test code here */
}