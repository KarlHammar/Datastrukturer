import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;


public class DynamicArray<T> {

    private T[] array;
    private int size; //number of occupied spaces

    public DynamicArray(T[] arrayin) {
        this.array = (T[])new Object[arrayin.length*2];
        for (int i = 0 ; i <= size-1; i++){
            this.array[i] = arrayin[i];
        }
        size = arrayin.length;
    }

    public void add(T value){
        //resize array if neccecary
        if (this.array.length >= size){
            T[] array2 = (T[])new Object[size*2];
            for (int i = 0 ; i <= size-1; i++){
                array2[i] = array[i];
            }
            this.array = array2;
        }
        //add new value
        this.array[size] = value;
        size++;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Only indices between 0 and " + (size-1) + " are allowed");
        }
        return this.array[index];
    }

    public void set(int index, T value) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Only indices between 0 and " + (size-1) + " are allowed");
        }
        this.array[index] = value;
    }

    public static void main(String[] args){
        DynamicArray<String> a = new DynamicArray<>(args);
        a.add("String2");

        System.out.println(a.get(1));



    }

}