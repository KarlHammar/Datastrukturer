import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

public class uppgift1  {
    public static void main(String[] args) {
        String s1 = args[0];
        //String s2 = args[1];

        //isRotation test
        /*Boolean isRot = isRotation(s1, s2);
        System.out.println(isRot);*/

        //reversegeneric test
        for (int i = 0 ; i < args.length; i++){
            System.out.println(i);
            System.out.println(reverseGeneric(args)[i]);
        }
        


    }

    public static boolean isRotation(String s, String t){
        return (s.length() == t.length()) && (s.concat(s).indexOf(t) >= 0); // Check if same length and if the second string fits into the pattern when the first is repeated
    }

    public static String reverse(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return reverse(b) + reverse(a);
    }

    public static <T> T[] reverseGeneric(T[] array){ // should reverse in place
        int N = array.length; // .length() is only for length of string etc
        if (N <= 1) return array;
        int midpoint = (int) (array.length)/2;
        T[] array1 = (T[])new Object[midpoint]; //UNSAFE CAST
        array1 = reverseGeneric((T[]) Arrays.copyOfRange(array, 0, midpoint)); 
        T[] array2 = (T[])new Object[array.length-midpoint];
        array2 = reverseGeneric((T[]) Arrays.copyOfRange(array,midpoint, array.length));
        
        T[] result = (T[])new Object[array.length];
        for (int i = 0 ; i < array2.length; i++){
            result[i] = array2[i];
        }
        for (int i = array2.length ; i < array.length; i++){
            System.out.println("we are on " + (array.length-midpoint));
            System.out.println("we are on " + array2.length);
            result[i] = array1[i-array2.length];
        }
        return result;
    }

    public static boolean isPalindrome(String string){
        return reverse(string).equals(string);
    }

    public static boolean isPalindromeAdvanced(String string){
        //Clean up string from spaces, wierd chars and lower/upper case
        String workingString = "";
        System.out.println("we are working with: " + string + " of length " + string.length());
        for (int i = 0 ; i <= string.length()-1; i++){
            if (Character.isAlphabetic(string.charAt(i))){
                workingString = workingString + Character.toUpperCase(string.charAt(i));
                System.out.println("At index " + i + "we have this: " +workingString);
            }
        }
        return isPalindrome(workingString);
    }
}