/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ethar;

/**
 *
 * @author tato_
 */

//Masuma Alqattan 2210003617
//Fatima Alsawad 2210003689
//Noor Abu for 2210003537
//Manar Albazbooz 2210003534
//Manar Alkhabbaz 2210003618

import java.util.Scanner;
public class Ethar  {

    public static void main(String[] args) {
        
        
        
         Scanner scanner = new Scanner(System.in);
        
         int optionSelected;
         show1();
//chose interface you want
    do {
        System.out.println("1- Login");
        System.out.println("2- sign in");
        System.out.println("3- Exit");
        System.out.print("Enter selected option: ");
        
        optionSelected = scanner.nextInt();
        
        if(optionSelected == 1){
            System.out.println("Login in progress\n");
            signin L=new signin();
            L.Login();
            Ch();
          optionSelected =3;
            
        } else if (optionSelected == 2){
            System.out.println("sign in in progress\n");
           signin S=new signin();
           S.signin();
           Ch();
           optionSelected =3;
           
           
        }
    } while (optionSelected != 3);
        
       
    
 
        
       


}
    //Choose interface you want

    public static void Ch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you Want to donate money(1) or blood(2) ?");
        int D;
        D= scanner.nextInt();
        if(D==1){
           Funds F=new Funds();
           F.show();
        }
        else if(D==2){
            Blood B=new Blood();
            B.donationBenefits();
            B.Notallowed();
            System.out.println("Do you want to see the Frequently Asked Questions (Enter 1)?");
            int Q; 
            Q=scanner.nextInt();
            if(Q==1){
                B.FAQ();
                infoBlood();
                
                
            }
            else
                infoBlood();
            
        }
        
            
        
        
    }
    //// method show to show interface 
    public static void show1()
    {         System.out.println("------------------------------------------------{وأحسنوا ان الله يحب المحسنين}--------------------------------------------------");
    System.out.println("                                                                                                                           ");
    System.out.println("---------------------------------------------------------- (بسم الله الرحمن الرحيم) -----------------------------------------------------");
    System.out.println("\n ------------------------------------------------------*< ETHRA DONATING CENTER >*-----------------------------------------------------");
   
    }
    //condition for booking an appointment

    public static void infoBlood(){
        Blood B=new Blood();
        Scanner sc = new Scanner (System.in);
	int age,weight;
       char gender;
       System.out.println("Enter gender: M/F");
       gender = sc.next().charAt(0);
       int C=0;
       while(C==0){
            if((gender=='F')||(gender=='M')){
                C=1;
             System.out.println("Enter age");
            age = sc.nextInt();
            
             if((age <= 18) && (age > 60)) {
                    System.out.println("Your age is not appropiate to donate....!");
                    C=1;
                    break;
    }
             else if((age >= 18) && (age < 60)){
                 System.out.println(" Enter your weight ");
                  weight = sc.nextInt();
                  if(weight < 50) {
                     System.out.println("Your weight is not appropiate to donate");
                     C=1;
                     break;
                     
			}
                  else
                      B.NearestHospital();
                      
                 C=1;
             }
       }
            C++;
       }

    }
}