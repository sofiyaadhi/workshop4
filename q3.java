import java.util.Scanner;

/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number");
    int num=scan.nextInt();
    if (num > 0)
    {
        System.out.println("this number is positive");
        
    
    
    }
    
    else if (num == 0){
        System.out.println("this number is zero");
    
    }
    
    else 
    {
        System.out.println("this number is negative");
    }
    
    
    }
}