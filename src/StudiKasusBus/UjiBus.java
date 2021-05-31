/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasusBus;

/**
 *
 * @author ASUS
 */
public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busBesar=new Bus(5);
        busBesar.getPenumpang(31);
        busBesar.Print();

        busBesar.addPenumpang(1);
        busBesar.getWeight(60);
        busBesar.getAverage();
        busBesar.Print();
        
        busBesar.addPenumpang(1);
        busBesar.getWeight(75);
        busBesar.getAverage();
        busBesar.Print();
        
        busBesar.addPenumpang(1);
        busBesar.getWeight(50);
        busBesar.getAverage();
        busBesar.Print();
    }
}