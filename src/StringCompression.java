/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */
public class StringCompression {
    public String StringCompression(String s)
    {
        int count=0,j=0,i=0;
        StringBuilder c=new StringBuilder();
        for( i=0;i<=s.length()-1;i++)
        {
            
            if(s.charAt(i)==s.charAt(j))
            {
                count ++;
                
            }
            else 
            {
                c.append(s.charAt(j));
                c.append(count);
                count=1;
                j=i;
                
            }
            
            
        }
        if(i!=j)
        {
            c.append(s.charAt(j));
            c.append(count);
        }
        if(s.length() < c.length())
        {
            return s;
        }
      
        else return c.toString();
     
    }
    
    public static void main(String args[])
    {
        StringCompression s=new StringCompression();
       System.out.println(s.StringCompression("aaabbbccdeeeffffff"));
    }
}
