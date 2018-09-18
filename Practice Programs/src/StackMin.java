
import java.util.EmptyStackException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */



class StackNode
{
    StackNode next;
    int data;
}

class MyStack
{
    StackNode top;
    int min =0;
    public void push(int n)
    {
        StackNode newitem = new StackNode();
        newitem.data=n;
        
        if(top==null)
        {
            top=newitem;
            min=top.data; //This new addition is make all the methods O(1).
        }
        else
        {
            newitem.next=top;
            top=newitem;
            if(newitem.data<min)
                min=newitem.data;
        }
        
      
    }
    public int pop()
    {
        if(top==null)
        {
            throw new EmptyStackException();
        }
        int popvalue=top.data;
        top=top.next;
        return popvalue;
        
    }
    
    public int getmin()
    {
//        int min=top.data;  This method was implementing in O(n) time,That logic has been commeneted below.
       
//        if(top==null)
//        {
//            throw new EmptyStackException();
//        }
//        
//        while (top.next!=null)
//        {
//            if(min>top.data)
//            {
//                min=top.data;
//               
//            }
//            
//            
//             top=top.next;
//             
//        }
     return min;
    }
    
}

public class StackMin {
    public static void main(String args[])
    {
        MyStack stack=new MyStack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(11);
        stack.push(90);
        stack.push(19);
        stack.push(1);
        
        
        
        System.out.println(stack.getmin());
       
    }
}
