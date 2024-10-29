/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Outer{
    void display(){
        System.out.println("outer class display method");
        
    }
    class Inner{
        void display(){
            System.out.println("inner class display method");
            
        }
    }
}
public class Program8 {
    public static void main(String[] args){
        String title0="lab 8 program=Nested Class";
        String title1="Devlop a java program to create an outer class with afunction display";
        String title2="Call another class inside the outer class named inner with a function called display";
        String title3="Call thethethe two functions in thethethe main class";
        System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n");
        Outer o1=new Outer();
        o1.display();
        Outer.Inner i1=o1.new Inner();
        i1.display();
    }
    
}
