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

    }

    public void add(String value){

    }

    public String remove(int index){
        return null;
    }

    public int size(){
        return 0;
    }

    public int capacity(){
        return 0;
    }
}
