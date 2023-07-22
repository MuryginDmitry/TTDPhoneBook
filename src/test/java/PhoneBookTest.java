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

        Assertions.assertEquals(0, initialSize);
        Assertions.assertEquals(1, newSize);
    }
}
