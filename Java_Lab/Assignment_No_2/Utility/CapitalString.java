package Utility;
import java.util.*;
public class CapitalString{
    public static String firstLetterCapital(String str){
        char firstchar = str.charAt(0);
        char CapitalChar = Character.toUpperCase(firstchar);
        String newString = String.valueOf(CapitalChar);
        for(int i = 1; i < str.length(); i++){
            newString += str.charAt(i);
        }
       return newString;
    }
}