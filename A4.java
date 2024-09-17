/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
package pkg1;
class Shape{
    public void draw(){
        System.out.println("drawing shape");
    }
    public void erase(){
        System.out.println("erasing shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("drawing circle");
        }
    public void erase(){
        System.out.println("erasing circle");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("drawing triangle");
}
    public void erase(){
        System.out.println("erasing triangle");
}

}
class Square extends Shape{
    public void draw(){
        System.out.println("drawing square");
        }
    public void erase(){
        System.out.println("erasing square");
    }
}
public class A4{
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("----------");
        }
    }
}