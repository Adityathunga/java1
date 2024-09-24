/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Bank2{
    int getInterestRate(){
        return 0;
    }
}
class canara extends Bank2{
    int getInterstRate(){
        return 5;
    }
}
class SBI extends Bank2{
    int getInterstRate(){
        return 6;
    }
}
class SCDCC extends Bank2{
    int getInterstRate(){
    return 8;    
    }
}
public class A7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        canara bank1=new canara();
        SBI bank2=new SBI();
        SCDCC bank3=new SCDCC();
        System.out.println("bank1 "+bank1.getInterstRate()+" %");
        System.out.println("bank2 "+bank2.getInterstRate()+" %");
        System.out.println("bank3 "+bank3.getInterstRate()+" %");
    }
    
}
