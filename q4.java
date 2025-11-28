import java.util.Scanner;

/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{public static void main(String [] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number");
    int num=scan.nextInt();
    
    if (num % 3==0){
    
    if(num% 5==0) 
    {
        System.out.println("Divisible by both 3 and 5");
    }
    else
    {
        System.out.println("Divisible by 3 but not by 5");
    }
    }
    else
    {
        System.out.println("Not divisible by both 3 and 5");
     }
    
    
    }
}