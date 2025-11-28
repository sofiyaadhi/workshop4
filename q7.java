import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
     public static void main(String [] args){
    
        Scanner scan = new Scanner(System.in);
        float mp,discount=0,sp;
        char category;
        System.out.print("enter the marked price:");
        mp=scan.next().charAt(0);
        System.out.print("Enter category (A/B/C/D): ");
        category = scan.next().charAt(0);
        
        switch (Character.toUpperCase(category)){
         case 'A':
                discount = 60;
                break;

            case 'B':
                discount = 40;
                break;

            case 'C':
                discount = 20;
                break;

            case 'D':
                discount = 10;
                break;

            default:
                System.out.println("Invalid category!");
        }
        sp = mp -(mp* discount /100 );
        System.out.println("selling price =" +sp);

}
}