/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Human{
    public void job(){
        System.out.println("working professional1");
    }
}
class Teacher extends Human{
    public void job(){
        System.out.println("teacher");
    }
}
class Doctor extends Human{
    public void job(){
        System.out.println("doctor");
    }
}
public class A8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Human amar=new Human();
       Teacher babu=new Teacher();
       Doctor chandra=new Doctor();
       Human dinesh=new Doctor();
       amar.job();
       babu.job();
       chandra.job();
       dinesh.job();
     }
}
