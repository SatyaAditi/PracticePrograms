/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */

class Vehicle
{
    void display()
    {
        System.out.println("display");
    }
}
class Car extends Vehicle
{
    @Override
    void display()
    {
        System.out.println("car dispay");
    }
}
public class Inheritance {
   
    public static void main(String args[])
    {
       Car c=new Car();
       c.display();
    }
            
}
