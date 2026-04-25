import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DynamicStringListTest {
    @Test
    public void testAddAndGet() {
        StringList list = new DynamicStringList();
        //arrange
        list.add("Hello");
        list.add("World");
        //act
        //assert
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
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


    @Test 
    public void testCapacity() {
        StringList list = new DynamicStringList();
        //Arrange
        assert list.capacity() == 4; // Initial capacity
        //Act
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        //Assert
        assertEquals(4, list.capacity()); // Capacity should still be 4
    }

    @Test
    public void testSize() {
        StringList list = new DynamicStringList();
        //Arrange
        assert list.size() == 0; // Initial size
        //Act
        list.add("A");
        list.add("B");
        //Assert
        assertEquals(2, list.size()); // Size should be 2 after adding two elements
    }

    @Test 
    public void testRemove(){

         DynamicStringList list = new DynamicStringList();
        //arrange
        list.add("a");
        list.add("b");

        //act
        String actual = list.remove(0);

        //assert
        assertEquals("a", actual);
        assertEquals(1, list.size());
        
    }

}
