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

    @Test 
    public void testCapacity() {
        StringList list = new DynamicStringList();
        assert list.capacity() == 4; // Initial capacity
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        assert list.capacity() == 4; // Capacity should still be 4
    }

    @Test
    public void testSize() {
        StringList list = new DynamicStringList();
        assert list.size() == 0; // Initial size
        list.add("A");
        list.add("B");
        assert list.size() == 2; // Size should be 2 after adding two elements
    }
}
