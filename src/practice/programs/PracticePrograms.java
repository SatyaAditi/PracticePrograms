/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.programs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author satya
 */
public class PracticePrograms {

    /**
     * @param args the command line arguments
     */
    
//    public List<Integer> selfDividingNumbers(int left, int right) {
//        
//        ArrayList<Integer> numberlist= new ArrayList<>();
//        numberlist.add(left);
//        numberlist.add(right);
//        int nextnumber=0;
//        for(int i=1;i<=right;i++)
//        {
//        nextnumber= left+i;
//       int  rem= nextnumber%10;
//        if(nextnumber%rem==0)
//        {
//            numberlist.add(nextnumber);
//           
//        }
//       
//        }
//        System.out.println(numberlist);
//        return numberlist;
//        }
//        
//         
//    
//    public static void main(String[] args) {
//        try{
//       PracticePrograms p= new PracticePrograms();
//       p.selfDividingNumbers(11, 15);
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
    
    public static void main(String args[])
    {
        int n=23;
        int input=23,count=0,temp;
        ArrayList<Integer> a= new ArrayList<>();
        temp=input;
        int temp1=input;
        while(input!=0)
               {

                input/=10;
                count++;
                }
        System.out.println(count);
        for(int i=1;i<=count;i++)
           {
            
            
                temp=temp%10;
                if(temp!=0)
                   a.add(temp);
                temp1/=10;
                temp=temp1;
            
           }
        for(int k:a)
            {
             System.out.println(k);
            }
        
        for(int i=0;i<=a.size()-1;i++)
        {
            if(n%a.get(i)==0)
            {
                System.out.println("self diving");
            }
            else
            {
                System.out.println("not");
            }
            
        }
        
    }
    
    
    
    
    
    
    }
    

