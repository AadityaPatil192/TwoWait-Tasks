import java.util.*;   
public class Permutation 
{  
   static int fact(int number) 
   {  
      int f = 1;  
      int j = 1;  
      while(j <= number) {  
         f = f * j;  
         j++;  
      }  
      return f;  
   }  
   public static void main(String args[]) 
   {  
         
      List<Integer> numbers = new ArrayList<Integer>();  
        
      numbers.add(16);  
      numbers.add(14);  
      numbers.add(6);  
      numbers.add(7);  
      numbers.add(3);
      numbers.add(9);   
      numbers.add(17);
      numbers.add(10);  

        
      int n = numbers.size();  
      int r = 4;  
      int result;  
        
      result = fact(n) / fact(n-r);  
      System.out.println("The permutation value for the numbers list is: " + result);  
   }  
}