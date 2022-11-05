package com.mycompany.ethar;

import java.util.Scanner;
import java.util.Random;

public class Payment {
    // pay method contain pay information
    public void pay(){
    Scanner in = new Scanner(System.in);
       String  accountnum;
       int cvv;
       
        System.out.print("Enter your account number");
        accountnum = in.nextLine();
        if(accountnum.length() == 16)
        {
             System.out.println(" Enter your cvv number:");
             cvv=in.nextInt();
             Code(); 
        }
           else {
             System.out.println("Error!!! not coorect accountnum ");
              pay();
            }
        }
      
      
      
// Code method to provide verification code

    public static void Code(){
        
        Scanner input= new Scanner(System.in);
        
        String alphabet ="fhAsddfi5154H632M4fgh4g6h4sRd65N";
        StringBuilder S = new StringBuilder ();
        
        Random random = new Random();
        
        int length=5;
        for(int i=0 ; i<length ; i++){
            int randomInt = random.nextInt(alphabet.length());
            char randomchar =alphabet.charAt(randomInt);
            S.append(randomchar); 
            }
        String randomStr = S.toString();
        System.out.println("The code is :"+randomStr);
        
        
        System.out.println("enter the code:");
         String Code=input.nextLine();
         
         if(!Code.equals(randomStr)){
             System.out.println("Not correct input !!");
         }
         else{
             System.out.println("successful ");
         }
}

}