import java.util.*;
import java.io.BufferedReader;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

public class Guess {
    public static void main(String[] args) {
        System.out.println("Give me a number between 1 and inf and I will guess it! (Binary)");
        int low = 1;
        int high = 10000;
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in));
        int target = 0;
        try{
            target = Integer.parseInt(reader.readLine());
        }catch(Exception a){
            System.out.println("mahahaha");
        }
        
        int guess = (high+low)/2;
        while (target > high){
            high = high*2;
        }
        while (guess != target){
            
            guess = (high+low)/2;
            if (guess < target){
                low = guess;
            }else{
                high = guess;
            }
        }
        System.out.println("Your number was: " + guess);
    }
}