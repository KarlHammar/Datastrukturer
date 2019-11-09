import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

public class SortingU5 {//Check if words are anagrams of eachother!
    //We do this by sorting the characters in each word and then compare if they are the same!

    public static void main(String[] args){
        String[] words = new String[2];
        words[0] = "hej";
        words[1] = "jeh";

        System.out.println(words[0] + " ; " + words[1]);
        System.out.println(isAnagram(words[0], words[1]));

    }
    

    public static boolean isAnagram(String s1, String s2){
        char[] c1 = sortChar(s1.toCharArray());
        char[] c2 = sortChar(s2.toCharArray());
        if (c1.equals(c2)){
            return true;
        }else{
            return false;
        }
    }

    public static char[] sortChar(char[] s){
        //What sorting algorithm to use?
        //We can use s[1].compareTo(s[2]) to sort in alpabetical
        s = Arrays.sort(s);
        return s;
    }
}