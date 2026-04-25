public class DynamicStringList implements StringList{

    private String[] arr;
    private int size;

    public DynamicStringList(){
        arr = new String[4];
        this.size = 0;
    }
    public String get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        } 
        return arr[index];
    }


    public void set(int index, String value){
        if (index < 0 || index >= size){
        throw new IndexOutOfBoundsException();
        }
     arr[index] = value;

    }

    public void add(String value){
       arr[size] = value;
       size++;
    }

    public String remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }        
         String removedValue = arr[index];
        for (int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
        return removedValue;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return arr.length;
    }

}
