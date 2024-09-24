/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    Car(String mk,String md,int yr,String clr){
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.color=clr;
    }
    public void getCarDetails(){
        System.out.println(color+" "+make+"-"+model+" "+year);
    }
}
public class A9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car principalCar=new Car("hyundai","i20",2023,"white");
        Car viceprincipalCar=new Car("maruti","swift",2023,"grey");
        System.out.println("the two cars parked in front of colaage are");
        principalCar.getCarDetails();
        viceprincipalCar.getCarDetails();
    }
}    

