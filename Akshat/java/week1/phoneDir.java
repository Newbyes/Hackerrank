//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class phoneDir{
    private static Scanner inputsc;
	public static void main(String []argh)
	{
        Map<String, String> phoneBook = new HashMap<String, String>();
        inputsc = new Scanner(System.in);
        
        int num = inputsc.nextInt();
        inputsc.nextLine();
        
        for(int i=0; i<num; i++)
        {
            String name = inputsc.nextLine();
            String phone = inputsc.nextLine();
            phoneBook.put(name, phone);
        }    
        
        while(inputsc.hasNext())
        {
            String inputName = inputsc.nextLine();
            if(phoneBook.containsKey(inputName))
            {
                System.out.println(inputName+"="+phoneBook.get(inputName));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}



