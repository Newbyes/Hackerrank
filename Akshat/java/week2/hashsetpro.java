import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hashsetpro {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
       int flag = 0,count=0;
        
        for (int j=0; j<pair_left.length && j<pair_right.length;j++)
        {
            flag=0;
            for(int k=0;k<j;k++)
            {
                if(pair_left[j].equals(pair_left[k]) && pair_right[j].equals(pair_right[k]))
                {
                    flag=1;
                        
                }
            }
            if(flag != 1)
            {
                count++;
            }
            System.out.println(count);
        }
    }
}