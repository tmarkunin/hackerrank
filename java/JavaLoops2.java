import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            ArrayList al = new ArrayList();
            
            int sum = a;
                
            for (int k = 0; k < n; k++){
                
                sum = sum + (int)Math.pow(2,k)*b;
                al.add(k,sum);
                
                }
            for (int l = 0; l < al.size(); l++){
                System.out.print(Integer.toString(al.get(l)) + " ");
            }
            System.out.println();
            
        }
        in.close();
    }
}
