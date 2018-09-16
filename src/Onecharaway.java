

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */

//Given 2 strings check whether they are only one character away ,all the characters anre smae only one character is missing.
public class Onecharaway {
    public static void main(String args[])
    {
      
        String one= "abcdefghi";
        String two= "abcdefghi";
        int count=0;
        
        if(one.length()-two.length()==1)
        {
        for(int i=0;i<=two.length()-1;i++)
        {
            
                if(one.charAt(i)==two.charAt(i) || one.charAt(i+1)==two.charAt(i))
                    
                {
                   count++;
                }
            
        }
        }
        
        if(count==two.length())
        {
            System.out.println("The strings are one character away");
        }
        else
        {
            System.out.println("not one char away");
        }
        
        
    }
}
