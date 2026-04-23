public class DynamicStringList implements StringList{

    public String [] arr;
    public int size;

    public DynamicStringList(){
        arr = new String[4];
        size = 0;
    }
    public String get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        } 
        return arr[index];
        }
    }

    
    
    
}
