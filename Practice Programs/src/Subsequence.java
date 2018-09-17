/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */
public class Subsequence {
     public int findLUSlength(String a, String b) {
         char c,d = 0;
         int count = 0,ans=0;
        for(int i=0;i<a.length();i++){
        c=a.charAt(i);
        for(int j=0;j<b.length();j++)
        {
         d=b.charAt(j);
         if(c!=d)
         {
           count ++;  
         }
        }
        
        }
     if(b.length()!=0)
       {
       ans=count/b.length();
       }
       System.out.println(ans);
       if(count!=0)
       {
       return ans;
       }
       else
       {
           return -1;
       }
        
        
        
    }
     public static void main(String args[])
     {
         Subsequence s= new Subsequence();
         s.findLUSlength("yyeeyyurryyyrrr",
"yyr");
     }
}
