import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
    public void testSet(){
        //arrange 
        DynamicStringList list = new DynamicStringList();
        list.add("cat");

        //act 
        list.set(0,"dog");
       String actual = list.get(0);

        // Assert
        assertEquals("dog", actual);
    }

}
