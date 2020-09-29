import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l = A.length();
        int c=0;
        for(int i=0;i<l;i++){
            if(A.charAt(i) == A.charAt(l-i-1))
                c++;
        }
        if(c==l)
        System.out.println("Yes");
        else
        System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

