import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

public class BigArray {

    private String[] array;

    public BigArray(String[] arrayIN){
        this.array = new String[arrayIN.length*2];
        for (int i = 0; i < arrayIN.length; i++){
            this.array[i] = arrayIN[i];
        }
    }
    public BigArray(){
        this.array = new String[10];
    }

    public String get(int index){
        if (index >= this.array.length){
            String[] temp = new String[index*2];
            for (int i = 0; i < this.array.length; i++){
                temp[i] = this.array[i];
            }
            this.array = temp;
        }
        return this.array[index];
    }

    public void set(int index, String value){
        if (index >= this.array.length){
            String[] temp = new String[index*2];
            for (int i = 0; i < this.array.length; i++){
                temp[i] = this.array[i];
            }
            this.array = temp;
        }
        this.array[index] = value;
    }



    public static void main(String[] args){

    }
}