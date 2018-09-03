import java.io.*;
import java.util.*;
  public class Palindrome{
    public static void main(String args[])
      {
        int ans=0,temp,n,input;
        System.out.println("Enter any integer:");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        temp=input;
        while(input>0)
          {
            n=x%10;
            ans=ans*10+n;
            input=input/10;
          }
          
        if(ans==temp)
          {
          System.out.println("The given num is palindrome");
          else
          {
          System.out.println("The given num is not palindrome");
          }
     }
}     
