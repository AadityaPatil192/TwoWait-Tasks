import java.util.*;

class StringReverse
{
    public static void main(String args[])throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.next();
        System.out.println("String Before Reverse : "+s);

        for(int i=s.length()-1 ; i>=0 ; i--)
        {
            sb.append(s.charAt(i));
        } 

        System.out.println("String After Reverse : " +sb);
        
    } 
}