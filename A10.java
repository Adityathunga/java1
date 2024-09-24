/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class TimeTable{
    int year;
    String[]day={"monday","tuesday","wednesday","thursday","friday","saturday"};
    int[]period={1,2,3,4,5,6,};
    String[] batch={"4MW22CS","4MW23CS","4MW24CS"};
    String[]subjec={"oopj"};
    String[]faculty={"kuthyar","chaitra"};
    boolean isLab;
    String section;
    TimeTable(int y1,String s1){
        this.year=y1;
        this.section=s1;
    }
    public void printTimeTable(){
        String heading=year+"-"+batch[year-1];
        System.out.println("timetable of year"+heading+"section"+section);
        for(String d:day){
            System.out.println(d+":");
            for(int p:period){
                System.out.println("period"+p+";oopj");
       
            }
            System.out.println();
        }
        
    }
}
public class A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimeTable tt2a=new TimeTable(2,"A");
        TimeTable tt2b=new TimeTable(2,"B");
        tt2a.printTimeTable();
        tt2b.printTimeTable();
    
    
    
    }
    


  }
