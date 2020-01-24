import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = null;

        scanner.close();
        
        int count = 0;
        
        if (b.length() < a.length()){
            
            c = a;
            a = b;
            b = c;
            
        }
        
        if (a.length() <= b.length()){
            
            
            while (a.length() > 0){
                String letter = a.substring(0,1);
            
              
            int countA = 0;
            int countB = 0;
            
            
            for (int k =0; k < a.length(); k++){
                if (a.substring(k,k+1).equalsIgnoreCase(letter)){
                    countA++;
                    
                }
                    
            }

            
            for (int l = 0; l < b.length(); l++){
                if (b.substring(l,l+1).equalsIgnoreCase(letter)){
                    countB++;
                }
            }
            
            if (countA > countB)
                count = count + countA - countB;
            else
                count = count + countB - countA;
                
                
            a = a.replaceAll(letter,"");
            b = b.replaceAll(letter,"");
                
            }
             
           }

            System.out.println(count + b.length());          
       
    }
}

