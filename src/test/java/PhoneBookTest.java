import junit.framework.TestCase;
import ru.netology.PhoneBook;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PhoneBookTest {
    @Test
    public void testAddContact() {
        PhoneBook phoneBook = new PhoneBook();
        int initialSize = phoneBook.add("John Doe", "1234567890");
        int newSize = phoneBook.add("Jane Smith", "9876543210");

        Assertions.assertEquals(1, initialSize);
        Assertions.assertEquals(2, newSize);
    }

    @Test
    public void testAddDuplicateContact() {
        PhoneBook phoneBook = new PhoneBook();
        int size = phoneBook.add("John Doe", "1234567890");
        size = phoneBook.add("John Doe", "9876543210");

        Assertions.assertEquals(1, size);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "1234567890");
        phoneBook.add("Jane Smith", "9876543210");

        String name = phoneBook.findByNumber("1234567890");
        Assertions.assertEquals("John Doe", name);

        name = phoneBook.findByNumber("9876543210");
        Assertions.assertEquals("Jane Smith", name);

        name = phoneBook.findByNumber("9999999999");
        Assertions.assertNull(name);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "1234567890");
        phoneBook.add("Jane Smith", "9876543210");

        String number = phoneBook.findByName("John Doe");
        Assertions.assertEquals("1234567890", number);

        number = phoneBook.findByName("Jane Smith");
        Assertions.assertEquals("9876543210", number);

        number = phoneBook.findByName("Alice");
        Assertions.assertNull(number);
    }
}
