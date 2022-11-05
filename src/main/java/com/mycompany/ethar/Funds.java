/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ethar;

import java.util.Scanner;
public class Funds extends  signin{
 
    

// method show override to show interface funds class
    @Override
    public  void show() {
		System.out.println("                                                                                                ");
	
		System.out.println("   ===============================================================================================");
		System.out.println("   ================================WELCOME to our donatig website==================================");
		Scanner input=new Scanner(System.in);
                int i=0;
                
                int A=0;
		while(i==0){
                    System.out.println("   ================================please choose type of cahrity:==================================");
                    System.out.println("   1-clothes\n\n   2-food basket\n \n  3-amount of money to donate ");
                    int choice=input.nextInt();
                    
                    //choice type of cahrity and call her method

                    switch(choice) {
                    case 1:
                        //total calculation
			A+=Clothes();
			break;
                    case 2:
			A+=BasketFood();
			break;
                    case 3:
			A+=Charity();
			break;
		}
                    
                    i++;
                    System.out.println("Do you want to Donate again? (Enter 0) (Enter any number to continue ");
                    i=input.nextInt();
                    
                }
                System.out.println("calculate= "+A );
                
                //to pay
                Payment p=new Payment();
                p.pay();
	}
    // clothes method to  donate clothes
public static int Clothes () {
		Scanner input=new Scanner(System.in);
		
		int pics;
		int x = 0;
		int total = 0;
		do {
			
		System.out.println("please choose the clothes that you want and how many pieces");
		System.out.println("1- T-shirt(60SR)\n 2- pants (90SR) \n 3- kids clothes(75SR)");
		int type =input.nextInt();
		pics=input.nextInt();
		if(type==1) {
			total=total+(60*pics);
			System.out.println(total);
		}
		else if(type==2) {
		total=total+(90*pics);
		System.out.println(total);
		}
		else if(type==3) {
			total=total+(75*pics);
			System.out.println(total);
		}
		else
			System.out.println("invalid input");
		
		System.out.println("thank you so much for your donation if you want to add something else, choose 1, otherwise click 0:");
		x=input.nextInt();
		
		} while(x==1);
                
		return total;
		
		}
//charity method to  donate money
	public static int Charity() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the amounte you want to donate: ");
		int D=input.nextInt();
                
		return D;
		
		
	}
        //BasketFood method to  donate food
	public static int BasketFood() {
		Scanner input=new Scanner(System.in);
		System.out.println("*********{ ويطعمون الطعام على حبه مسكينا ويتيما واسيرا}*************\n");
		System.out.println("****Please press  the number of basket  that you want to donate with: ***\n");

		System.out.println(" 1- (Ramadan Basket {10kg Rice, 6 chicken , 2kg meat, mixed vegtables, mixed fruits} *699SR*)\n");
		System.out.println(" 2- (Small Basket {5kg Rice, 3 chicken , 1kg meat, mixed vegtables, mixed fruits} *599SR*)\n");
		System.out.println(" 3- (friuts Basket {1kg Banana, 1kg Orange , 1kg Apple, 1kg grabes } *170SR*)\n");
		System.out.println(" 4- (vegtables Basket {1kg cucumber, 1kg tomatos , 1kg carrots, 1kg bell pepper } *160SR*)\n");
		System.out.println(" 5- (mixed Basket {coking oil, flour , sugar, milk, salt, rice, pasta, cheese, date,eggs, oats,tomato paste, tea, beans } *510SR*)\n");
		System.out.println("______________________________________________\n");
		int basket=input.nextInt();
        System.out.println("****Please enter how many baskets do you want: ***\n");
    	int am=input.nextInt();//number of basket
    	int total = 0;
    	if(basket==1) {
		total=total+(699*am);
		System.out.println("the bill is: "+total);
		}
		else if(basket==2) {
		total=total+(599*am);
		System.out.println("the bill is: "+total);
		}
		else if(basket==3) {
			total=total+(170*am);
			
			System.out.println("the bill is: "+total);
		}
		else if(basket==4) {
			total=total+(160*am);
			
			System.out.println("the bill is: "+total);
		}
		else if(basket==5) {
			total=total+(510*am);
			
			System.out.println("the bill is: "+total);
		}
                else{
			System.out.println("invalid input");}
        return total;
   
	}
}

