
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
98ii * @author satya
 */
public class ReverseString {
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter string");
        String input=in.nextLine();
        String reverse="";
        for(int i=input.length()-1;i>=0;i--)
        {
          reverse=reverse+input.charAt(i);
          
        }
        System.out.println(reverse);
        
    }
    
    
    
    
    
}
