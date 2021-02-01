/**
 * ControlFlow
 */

import java.util.*; 
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUp;


public class ControlFlow {

    public static void printNumbers(){
        // prints valid numeric numebrs
        System.out.print("\nThe valid numbers are : ");
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }   
    }
    public static void printLowerCase(){
        // prints valid lovercase alphebets
        System.out.print("\nThe valid lowercase alphebets are : ");
        for(char ch='a';ch<='z';ch++){
                        System.out.print(ch + " ");     
        }   
    }
    public static void printUpperCase(){
        // prints valid lovercase alphebets
        System.out.print("\nThe valid uppercase alphebets are : ");
        for(char ch='A';ch<='Z';ch++){
                        System.out.print(ch + " ");     
        }   
    }

//public class Magicball {
    public static void main(String[] args) {
        
        AsciiChars.printNumbers();
        AsciiChars.printUpperCaseLetters();
        AsciiChars.printLowerCaseLetters();

        Scanner sc = new Scanner(System.in);
        String continueOption;
        
        System.out.print("\nPlease enter your name : ");
        String name = sc.next();
        System.out.println("Hello "+name);
        System.out.print("If you wish to continue to the ineractive portion. Enter yes/no : ");
        String option = sc.next();
        if(option.equals("yes") || option.equals("y")){
            do{

                
                System.out.print("Do you have a red car?(yes, no) : ");
                String redCar = sc.next();

                System.out.print("What is the name of your favorate pet : ");
                String petName = sc.next();

                System.out.print("What is the age of your favorite pet : ");
                int petAge = sc.nextInt();

                System.out.print("What is your lucky number : ");
                int luckyNumber = sc.nextInt();

                System.out.print("Do you have a favorite quarterback?(yes, no)  : ");
                option = sc.next();
                int jerseyNumber = 0;
                if(option.equals("yes") || option.equals("y")){
                    System.out.print("What is the jersey number : ");
                    jerseyNumber = sc.nextInt();
                }

                System.out.print("What is the two digit model year of your car?  : ");
                int modelYear = sc.nextInt();

                System.out.print("What is the first name of the their favorite actor or actress?  : ");
                String actressName = sc.next();


                System.out.print("Enter a random number between 1 and 50  : ");
                int randomNumber = sc.nextInt();

                // Generating output : 
                Random rand = new Random(); 
                int magicballNumber;
                
                int rand1 = rand.nextInt(50);
                int rand2 = rand.nextInt(50);
                int rand3 = rand.nextInt(50);
                if((rand.nextInt(2) == 1) && (jerseyNumber != 0) ) {
                    // choose the jersey number else choose the lucky number
                    magicballNumber = jerseyNumber * rand1;
                }
                else{
                    magicballNumber = luckyNumber * rand1;
                }
                if(magicballNumber > 75){
                    
                    magicballNumber = magicballNumber - 75;
                }
                
                int number1 , number2, number3, number4, number5;
                
                
                number1 =  modelYear + luckyNumber;
    
                if(number1>65)
                    number1 = number1 - 65;
                if(number1<1)
                    number1 = number1 + 65;
            
                number2 =  rand2 - rand.nextInt(50);
                
                if(number2>65)
                    number2 = number2 - 65;
                if(number2<1)
                    number2 = number2 + 65;
                number3 =  42;
               
                number4 =  petAge + modelYear;
                
                if(number4>65)
                    number4 = number4 - 65;
                if(number4<1)
                    number4 = number4 + 65;
            
                number5 =  (int)actressName.charAt(0);
                if(number5>65)
                    number5 = number5 - 65;
                if(number5<1)
                    number5 = number5 + 65;
                System.out.print("\nLottery numbers : ");
                System.out.print(number1+", ");
                System.out.print(number2+", ");
                System.out.print(number3+", ");
                System.out.print(number4+", ");
                System.out.print(number5+", ");
                System.out.print(" Magic ball: "+magicballNumber);
                System.out.println("\nIf you like to answer question to generate another set of numbers, (yes ,no)? :");
                continueOption = sc.next();

            }while(continueOption.equals("yes"));  
        }
        else{
            System.out.println("\nPlease return later to complete the survey");
        }
        System.out.println();
    }

}
    
