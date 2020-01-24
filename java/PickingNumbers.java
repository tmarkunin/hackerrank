import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {

        ArrayList<Integer> al = new ArrayList<>();
        int length = 0;
        int size = 0;
        for (int i = 0; i < a.length; i++){
            al.clear();
            al.add(a[i]);
            for (int j = i + 1; j < a.length; j++){
                
                if ( i!=j && (Math.abs(a[i] - a[j]) < 2)){
                    al.add(a[j]);
                }
            }
            
            //System.out.println(al);
            
                int bigger = 0;
                int lesser = 0;
                int max = 0;
            
            for (int l = 0; l < al.size(); l++){
                if (al.get(l) > max)
                    max = al.get(l);
            }
            
            int med = max - 1;
            
            for (int k = 0; k < al.size(); k++){

                if ( al.get(k) - med == 1)
                    bigger++;
                if (al.get(k) - med == -1)
                    lesser++;   
                
            }
            if (lesser > bigger){
                size = al.size() - bigger;
 
            }
            else if (lesser < bigger)
                size = al.size() - lesser;
            else if (lesser == bigger)
                size = al.size() - lesser;
            System.out.println(al);
            System.out.println(size);
            if (size > length)
                length = size;
        }
        return length;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}