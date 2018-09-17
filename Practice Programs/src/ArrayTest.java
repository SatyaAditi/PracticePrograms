/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */
import java.util.*;
public class ArrayTest {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        
        Iterator i=list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
        HashMap<Integer,String> h=new HashMap<>();
        
        h.put(2,"aditi");
        h.put(3,"ravi");
        h.put(7,"kavi");
        h.put(4,"aditi");
        
        System.out.println(h.get(3));
         System.out.println(h.entrySet());
       // Map.Entry m=MAp.Entry
        
    }
}
