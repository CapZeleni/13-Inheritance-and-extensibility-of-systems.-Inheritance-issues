import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void test() {
        Book book1 = new Book(10, "one Master and Margarit", 99, "Bulgakov");
        Book book2 = new Book(1, "black obelisk", 199, "Remark");
        Book book3 = new Book(5, "one hail doomed", 299, "Strugackie");

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("black");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        Book book1 = new Book(10, "one Master and Margarit", 99, "Bulgakov");
        Book book2 = new Book(1, "black obelisk", 199, "Remark");
        Book book3 = new Book(5, "one hail doomed", 299, "Strugackie");

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("one");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Book book1 = new Book(10, "one Master and Margarit", 99, "Bulgakov");
        Book book2 = new Book(1, "black obelisk", 199, "Remark");
        Book book3 = new Book(5, "one hail doomed", 299, "Strugackie");

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("zone");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}
