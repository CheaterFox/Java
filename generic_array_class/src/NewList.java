import java.util.Arrays;

public class NewList<T> {
    private T[] array;
    private int capacity = 10;
    private int indexSize = 0;

    public NewList(int capacity) {
        this.capacity = capacity;
        this.array = (T[])new Object[capacity];
    }

    public NewList(){
        this.array = (T[])new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }
    public int size(){
        return indexSize;
    }
    public void add(T data){
        if(indexSize == this.capacity){
            T[] newArray = (T[]) new Object[capacity * 2];
            int i = 0;
            for (T arr : this.array) {
                newArray[i] = arr;
                i++;
            }
            this.array = newArray;
            this.capacity = this.capacity*2;
        }
        array[indexSize] = data;
        indexSize++;
    }
    public T get(int index){
        if (index < 0 || index >= array.length){
            return null;
        }
        return array[index];
    }
    public T remove(int index){
        if (index >= 0 && index < indexSize){
            T oldValue = array[index];
            for (int i = index;i < indexSize;i++){
                array[i] = array[i+1];
            }
            indexSize-- ;
            return oldValue;
        } else {
            return null;
        }
    }
    public void set(int index, T data){
        if (index >= 0 && index < indexSize){
            array[index] = data;
        } else {
            System.out.println("null");
        }
    }
    @Override
    public String toString() {
        if (this.array == null){
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(T arr : this.array){
            if(arr != null){
                stringBuilder.append(arr.toString() + ",");
            }
        }
        if (!isEmpty()){
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    public int indexOf(T data){
        for (int i=0; i < indexSize; i++) {
            if (array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for (int i = (indexSize - 1); i >= 0; i--) {
            if (array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        return array[0] == null;
    }
    public T[] toArray(){
        return this.array;
    }
    public void clear(){
        this.array = (T[])new Object[10];
    }
    public NewList<T> sublist(int start, int finish){
        NewList<T> sublist = new NewList<>();
        for (int i = start; i <= finish; i++) {
            if (i >= 0 && i < array.length && finish < array.length){
                sublist.add(array[i]);
            }
            else {
                System.out.println("subArray's indexes must be between 0 and superArray's capacity");
                break;
            }
        }
        return sublist;
    }
    public boolean contains(T data){
        for (T arr : array){
            if (arr == data){
                return true;
            }
        }
        return false;
    }
}
