
package com.mycompany.ethar;

import java.util.Scanner;


public class signin  {  
    
    User []U=new User[1];
    public String name,  username ,  password;
    //method show override
    public void show(){
    
}
    //method for Login
    public void Login(){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your Username :");
        String user=in.nextLine();
        System.out.println("Enter your password :");
        String pass=in.nextLine();
        //to check for logging
if (pass.equals("Noor123")&&user.equals("Noor AbuFoor")) {
            System.out.println("*welcom Noor you loged in succusfully*");
           
}
else if (pass.equals("Ma456")&&user.equals("Manar Albazbooz ")) {
            System.out.println("*welcom Manar you loged in succusfully*");
           
}
else if (pass.equals("F*3")&&user.equals("Fatimah Alsawad")) {
            System.out.println("*welcom Fatimah you loged in succusfully*");
 
           
}
else if (pass.equals("Ma46")&&user.equals("Masuma Alqattan")) {
            System.out.println("*welcom Masuma you loged in succusfully*");
 
}
else if (pass.equals("M842a")&&user.equals("Manar Alkhabbaz ")) {
            System.out.println("*welcom Manar you loged in succusfully*");
           
}

else{

            System.out.println("inavalid user!");
            signin();
} 
    }


//method for signin 
    public void signin( ){
        System.out.println("--------- singin--------");
   Scanner in = new Scanner(System.in);
            for(int i=0;i<1;i++){
                System.out.println("Enter your Name :");
                name=in.nextLine();
                System.out.println("Enter your Username :");
                username=in.nextLine();
                System.out.println("Enter your password :");
                password=in.nextLine();
                U[i]=new User(name,username, password);   
     
    }  
           
    }           
    
}
