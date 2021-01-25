import java.util.*;
class Solution{
    
    public void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(checkbalance(input));
        }
        sc.close();
        
    }
    
    boolean checkbalance(String input)
    {
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<input.length();i++)
        {
            char c = input.charAt(i);
          //  char p = stack.getFirst();
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(String.valueOf(c));
            }
            else if(!stack.empty())
            {
               if(c == ')')
               {
                   if(stack.peek() == '(')
                   {
                       stack.pop();
                   }
                   else
                   {
                       return false;
                   }
               } 
               else if(c == '}')
               {
                   if(stack.peek() == '{')
                   {
                       stack.pop();
                   }
                   else
                   {
                       return false;
                   }
               }
               else if(c == ']')
               {
                   if(stack.peek() == '[')
                   {
                       stack.pop();
                   }
                   else
                   {
                       return false;
                   }
               }
               else 
               {
                   return true;
               }
               
            }
        }
        return stack.empty();
    } 
}




