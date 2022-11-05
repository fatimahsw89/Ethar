/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tato_
 */

package com.mycompany.ethar;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Blood extends signin {



    //method show override to show interface blood class
    public  void show() {
                        System.out.println("                                                                                                ");
           
                        System.out.println("   ===============================================================================================");
                        System.out.println("   ================================Welcome to ETHAR donatig website==================================");
                        System.out.println("   ======================================{من احيا نفسا فكأنما احيا الناس جميعا}==================================");
                        System.out.println("                                                                                                   ");
    }
//unaccebtable conditions for donating blood
   public void Notallowed(){System.out.println("                                                                                                   ");
               System.out.println("IF you have one OR more cases of these :");            
       System.out.println("1-less than 18 years old. ");
       System.out.println("2-people with infectious diseases like (HIV, HBV B or C, Syphilism, Malaria). ");
       System.out.println("3-people with chronic blood diseases. ");
       System.out.println("4-people with Anemia.");
       System.out.println("5-people with chronic diaseases (diabetes, HTN, CANCER)"+"\n \n");
       System.out.println("   *********** SORRY YOU ARE NOT ALLOWED TO DONATE BLOOD ***********");
}
   //Some frequently asked questions
   public void FAQ(){
        int B=0;
        do{
        System.out.println("_____________________________________");
  
       System.out.println(" Some frequently asked questions about blood donation..... choose the number of question that arouses your curiosity:                       ");
       System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("1-how long does the blood donation process take? . ");
       System.out.println("2-how many times can i blood donate? ");
       System.out.println("3-what are the condition for donating?  ");
       System.out.println("4-how can i get started to donate? ");
       System.out.println("5- can i donate if i have covid-19?)");
       System.out.println("6- can i donate while receiving care from a dentist? ");
       System.out.println("7- can i donate if i have recently had a tatto or piercingt? ");
       System.out.println("8-can i donate if i have cold, flu or fever? ");
       int C = input.nextInt();
      
       
      
           
       
       if (C==1){
           System.out.println("blood donation takes time between 45-60 mintues. ");}
       else if(C==2){
           System.out.println("you can blood donate every 84/56 days at least. ");
       }
       else if(C==3){
           System.out.println("adult people with 16 years old can donate, 50kg at least. ");
       }
       else if(C==4){
           System.out.println("before donating, you must eat healthy meal and drink a lot of water, go to hospital after you get plenty of rest and wear a shirt with sleeves. ");
       }
       else if(C==5){
           System.out.println("You must waiting for 14 days after the test. ");
       }
       else if(C==6){
           System.out.println("Depending on your situation, you may be eligible to donate. The donation is accepted after routine dental cleaning. ");
       }
       else if(C==7){
           System.out.println("Getting a tatto or body piercing with a licensed institution doesn't make you ineligible to donate blood. ");
       }
       else if(C==8){
           System.out.println("N0. To be able to donate, you must be free of cold, flu and fever symptoms on the day of the donation. ");
       }
       System.out.println("Do you want to show the List again (Enter 1)");
       B=input.nextInt();
       
        }while(B==1);
  
           
      
       
   }
   
 Scanner input =new Scanner(System.in);


 //to find nearest donating center
    public void NearestHospital(){
        Scanner input=new Scanner(System.in);
    
     System.out.println("Please Enter your region \n 1-Al qatif \n 2-Al Dammam \n 3-Al Ahsaa \n 4-Hafar Al Batin \n 5-Al khobar");
     int ch=input.nextInt(); 

int num;
    switch (ch) { 
       
    case(1):
         System.out.println(" *****These are the places avalible in your city**** \n                             Choose one of them: \n"); 
         System.out.println("1-Qatif Central Hospital");
         System.out.println("2-Prince Mohaamed bin Fahad Hospital");
         System.out.println("3-Anak Hospital");
         num=input.nextInt();
         dayTime();
         System.out.println("     BE READY AT THE EXACT DAY AND TIME!!! WE ARE WAITING FOR YOU... STAY SAFE <3" );
         
    break; 
     
    case (2): 
        
        System.out.println(" These are centers avalible- Choose one of them \n"); 
        System.out.println("1-Dammam Medical Complex ");
         System.out.println("2-King Fahad Specialist Hospital");
         System.out.println("3-Imam abdulrahmman bin Faisal Hospital"); 
         num=input.nextInt();
         dayTime();
         System.out.println("     BE READY AT THE EXACT DAY AND TIME!!! WE ARE WAITING FOR YOU... STAY SAFE <3" );
    break; 
     
    case (3): 
          System.out.println(" These are centers avalible- Choose one of them \n"); 
          System.out.println("1-king Fahad Hospital");
         System.out.println("2-Prince Saud bin Jalawy Hospital");
         System.out.println("3-Abqaiq General Hospital");
         num=input.nextInt();
         dayTime();
         System.out.println("     BE READY AT THE EXACT DAY AND TIME!!! WE ARE WAITING FOR YOU... STAY SAFE <3" );
          
          
    break; 
     
    case (4): 
      System.out.println(" These are centers avalible- Choose one of them \n"); 
          System.out.println("1-king Khalid General Hospital");
         System.out.println("2-Convalescent  Hospital");
         System.out.println("Hafar Al Batin General Hospital");
         num=input.nextInt();
         dayTime();
         System.out.println("     BE READY AT THE EXACT DAY AND TIME!!! WE ARE WAITING FOR YOU... STAY SAFE <3" );
    break; 
    
      
    case (5): 
      System.out.println(" These are centers avalible- Choose one of them \n"); 
          System.out.println("1-king Fahad university Hospital");
         System.out.println("2-AlYousef Hospital");
         System.out.println("3-Govermental Hospital Khobar Hospital");
         num=input.nextInt();
        dayTime();
         System.out.println("     BE READY AT THE EXACT DAY AND TIME!!! WE ARE WAITING FOR YOU... STAY SAFE <3" );
    break; 
    
    default: 
    System.out.println("!!!!!!!!!!invalid input!!!!!!!!!!!!");
    } 
     
   


}
    //display donation Benefits
 public static void donationBenefits(){
System.out.println("                                                                                                             ");
System.out.println("                   The benefits of donating blood:                    ");
System.out.println("**You Can Be Part of a Greater Community**");
System.out.println("**Donating blood saves lives and improve your emotional well-being**");
System.out.println("**benefit your physical health and reduce stress**");
System.out.println(" **Reveal potential health problems and avoid heart atack**");
System.out.println("**reduce your risk of developing cancer**");
System.out.println("**Donating can keep your iron level balanced** \n \n");
}
 public static void dayTime() {
                LocalDateTime myObj = LocalDateTime.now();
                System.out.println("************Your appointment Date and Time :"+myObj+ "************");
              }


    
}
