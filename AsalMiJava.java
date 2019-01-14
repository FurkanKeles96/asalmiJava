/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalmijava;

import java.util.Scanner;

/**
 *
 * @author furkan
 */
public class AsalMiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    double max = inp.nextDouble();
    //write your code below
    int i_max = (int)max;
    int sayi=0;
    int [ ] bolen= new int [i_max] ;
    
    if(i_max==1){
      System.out.println("Not prime");
    }
    else if(i_max==2){
      System.out.println("prime");
    }
    else if(i_max>2){
        for(int i = 2; i<i_max; i++){
          if(i_max%i==0){
                sayi++;
                bolen[i]=i;
            }
        }
        if(sayi!=0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
      
        System.out.print("Bolenler(Kendisi hariç) : ");
            for(int i = 0; i<bolen.length; i++){
                if(bolen[i]!=0){
                    System.out.print(bolen[i]+" ");            
                }            
            }
        }
    }
    
}
