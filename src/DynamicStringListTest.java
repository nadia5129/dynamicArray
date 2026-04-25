import org.junit.Test;

public class DynamicStringListTest {
    @Test
    public void testAddAndGet() {
        StringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        assert list.get(0).equals("Hello");
        assert list.get(1).equals("World");
    }
}
