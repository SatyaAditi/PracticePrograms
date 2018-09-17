/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */


      
 class Node
 {
     int data;
     Node next;
     
 }
 
 class LinkedList
 {
     Node head;
     
     public void insert(int data)
     {
         Node new_node=new Node();
         new_node.data=data;
         
         new_node.next=null;
         
         if(head==null)
         {
             head=new_node;
             
         }
         else
         {
             Node temp=new Node();
             temp=head;
             while(temp.next!=null)
             {
                 temp=temp.next;
             }
             temp.next=new_node;        
         }
         
     }
     
     public void show()
     {
         Node node=head;
         while(node.next!=null)
         {
             System.out.println(node.data);
             node=node.next;
         }
         System.out.println(node.data);
     }
     
     public LinkedList ReverseList()
     {
         Node node= head;
         LinkedList list=new LinkedList();
         while(node.next!=null)
         {
            list.insertreverse(node);
            node=node.next;
         }
        return list; 
     }
     
     public void insertAtstart(int data)
     {
         Node new_node=new Node();
         new_node.next=null;
         new_node.next=head;
         head=new_node;
         
     }
     
     public void insertreverse(Node d)
     {
       
         if(head==null)
         {
             head = new Node();
             head.data=d.data;
             head.next=null;
         }
         else
         {
            Node new_head= new Node();
            new_head.data = d.data;
            new_head.next=head;
            head=new_head; 
         }
     }
 }
public class PalindromeLinkedList {
    
    Node tail;
    
    
    public static void main(String args[])
    {
    LinkedList list=new LinkedList();
    
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(5);
    
    list.show();
    
    LinkedList reverseList=new LinkedList();
    reverseList=list.ReverseList();
    
    reverseList.show();
    
    if(reverseList==list)
    {
        System.out.println("list is palindrome");
    }
    
   
    }
}
