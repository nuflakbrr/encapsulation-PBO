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
public class Bus {
    private double penumpang,maxpenumpang,average,beratpenumpang,totalberat;
    
    // konstruktor
    public Bus(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
        beratpenumpang = 0;
        average = 0;
    }
    
        //method password
    public void getPenumpang(int password){
        if (password==31){
            System.out.println("Password benar");
        }
        else{
            System.out.println("Password salah");
        }
    }
    
    //method mutator 
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Penumpang melebihi kapasitas");
        }else{
            this.penumpang=temp;
        } 
    }
    
    //method berat penumpang
    public void getWeight(double beratpenumpang){
        totalberat = this.beratpenumpang+beratpenumpang;
        this.beratpenumpang = totalberat;
    }
    
    //method average
    public void getAverage(){
        average = totalberat / penumpang;
        this.average = average;
    }
    //method cetak
    public void Print(){
        System.out.println("Penumpang sekarang adalah : "+penumpang);
        System.out.println("Penumpang seharusnya adalah : "+maxpenumpang);
        System.out.println("Total berat badan penumpang adalah : "+beratpenumpang);
        System.out.println("Rata-rata berat badan penumpang adalah : "+average);
    }
}