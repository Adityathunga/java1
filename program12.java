/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
public class program12 {
    public static String reverse(String s1){
        String s2=" ";
        int len1=s1.length();
        for(int i=0;i<len1;i++){
            s2=s2+s1.substring(len1-(i+1),len1-i);
            
            
            
        }
       return s2;
    }
    public static void main(String[] args){
        String result=" ";
        result=reverse("Aditya Thunga K");
        System.out.println("result");
        System.out.println(reverse("Virat"));
    }
}
        
 