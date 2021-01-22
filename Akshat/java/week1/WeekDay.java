import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    
    public static String findDay(int month, int days, int year) 
    {
        String input_date=days+"/"+month+"/"+year;
        String s = new String();        
        try
        {
            Date d=new SimpleDateFormat("dd/MM/yyyy").parse(input_date);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            int day = c.get(Calendar.DAY_OF_WEEK);
            if(day == 1)
            {
                s = "SUNDAY";
            }
            else if(day == 2)
            {
                s = "MONDAY";
            }
            else if(day == 3)
            {
                s = "TUESDAY";
            }            
            else if(day == 4)
            {
                s = "WEDNESDAY";
            }            
            else if(day == 5)
            {
                s = "THURSDAY";
            }            
            else if(day == 6)
            {
                s = "FRIDAY";
            }            
            else if(day == 7)
            {
                s = "SATURDAY";
            }            
        }
        catch(Exception e)
        {
            s = "Not Possible";
        }
        return s;
    }

}

public class WeekDay {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
