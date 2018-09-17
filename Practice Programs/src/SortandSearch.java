
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */
 class SortBruteForce {
    void  SortDesc()
    {
        int s[]={54,17,60,5,3,1,2,465,24,0,43,457,10};
        int temp = 0;
        int i=0;
        for(int j=0;j<s.length-1;j++)
        {
        for( i=0;i<s.length-1;i++)
        {
            if(s[i]<s[i+1])
            {
                temp=s[i];
                s[i]=s[i+1];
                s[i+1]=temp;
            }
        }
        }
        for(i=0;i<=s.length-1;i++)
        {
            System.out.print(s[i]+",");
        }
        System.out.println();
    }
    int[] SortAsc()
    {
       int s[]={11,2,3,6,4,20,9};
        int temp = 0;
        int i=0;
        for(int j=0;j<s.length-1;j++)
        {
        for( i=0;i<s.length-1;i++)
        {
            if(s[i]>s[i+1])
            {
                temp=s[i];
                s[i]=s[i+1];
                s[i+1]=temp;
            }
            temp=0;
        }
        }
        for(i=0;i<=s.length-1;i++)
        {
            System.out.print(s[i]+",");
        }
        System.out.println();
        return s;
    }
    
}
class BinarySearch
{

   

     boolean  BinarySearch(int[] arr,  int start, int end,int given)
    {
        
        int mid=(int)(end+start+1)/2;
        while(start<=end && mid<=end)
        {
            if(given<arr[mid])
            {
               return BinarySearch(arr,start,mid-1,given);
               
            }
            else if(given==arr[mid])
            {
                System.out.println("it exists at index " + mid );
                return true;
            }
            else if(given>arr[mid])
            {
                return BinarySearch(arr,mid+1,end,given);
                
            }
       
        } 
        System.out.println("it doesnt exist");
        return false;    
        
        
        
    }
}
public class SortandSearch
{
    public static void main(String args[])
    {
        SortBruteForce s=new SortBruteForce();
        System.out.println("Ascending");
        int arr1[]=s.SortAsc();
        System.out.println("Descending" );
        s.SortDesc();
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number to search");
        int input=in.nextInt();
        BinarySearch b=new BinarySearch();
        boolean output = b.BinarySearch(arr1,0,arr1.length-1,input);
        System.out.println("return value:"+output);
       
      
     }  
    
}
