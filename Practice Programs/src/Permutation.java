
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */
public class Permutation {
    public static void main(String args[])
    {
        String str1="abcd";
        String str2="bacd";
        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];
        if(str1.length()==str2.length())
        {
        for(int i=0;i<=str1.length()-1;i++)
        {
            arr1[i]=str1.charAt(i);
            arr2[i]=str2.charAt(i);
            
        }
        }
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        boolean a= Arrays.equals(arr1, arr2);
        if(a==true)
        {
            System.out.println("they are a permutation of each other");
        }
        else
        {
            System.out.println("not permuted");
        }
    }
}
