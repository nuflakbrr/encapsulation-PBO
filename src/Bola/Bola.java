/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bola;

/**
 *
 * @author ASUS
 */
public class Bola {
    private double Jarijari;
    
    public void setJarijari(int newJarijari){
        Jarijari = newJarijari;
        System.out.println("Jari-jari bola adalah : "+Jarijari);
    }
    
    //method menampilkan diameter
    public void showDiameter(){
        double diameter = Jarijari*2;
        System.out.println("Diameter bola adalah : "+diameter);
    }
    
    //method menampilkan luas permukaan
    public void showLuasPermukaan(){
        double luaspermukaan;
        if (Jarijari % 7 == 0){
            luaspermukaan = 4*22*Jarijari*Jarijari/7;
            System.out.println("Luas permukaan bola adalah : "+luaspermukaan);
        }else{
            luaspermukaan = 4*3.14*Jarijari*Jarijari;
            System.out.println("Luas permukaan bola adalah : "+luaspermukaan);
        }
    }
    
    //method menampilkan volume bola
    public void showVolume(){
        double volume;
        if (Jarijari % 7 == 0){
            volume = 4*22/7*Jarijari*Jarijari*Jarijari/7;
            System.out.println("Volume bola adalah : "+volume);
        }else{
            volume = 4*3.14*Jarijari*Jarijari*Jarijari/3;
            System.out.println("Volume bola adalah : "+volume);
        }
    }
}
