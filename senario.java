import java.util.Scanner;

/**
 * Write a description of class senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senario
{
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. Ask age group
        System.out.println("Enter your age group (child/adult/senior): ");
        String ageGroup = scan.next().toLowerCase();

        double basePrice = 0;

        if (ageGroup.equals("child")) {
            basePrice = 150;
        } else if (ageGroup.equals("adult")) {
            basePrice = 250;
        } else if (ageGroup.equals("senior")) {
            basePrice = 200;
        } else {
            System.out.println("Invalid age group!");
            return;
        }

        System.out.println("Enter movie language (nepali/hindi/english): ");
        String language = scan.next().toLowerCase();

        if (language.equals("hindi")) {
            basePrice += 50;
        } 
        else if (language.equals("english")) {
            basePrice += 100;
        }
        else if (!language.equals("nepali")) {
            System.out.println("Invalid movie language!");
            return;
        }

        System.out.println("Are you a student? (yes/no): ");
        String student = scan.next().toLowerCase();

        System.out.println("Is it a festival day? (yes/no): ");
        String festival = scan.next().toLowerCase();

        double finalPrice = basePrice;

        if (student.equals("yes")) {
            finalPrice = finalPrice - (finalPrice * 0.20); 
        }

        if (festival.equals("yes")) {
            finalPrice = finalPrice - (finalPrice * 0.15); // 15% off
        }

        System.out.println("--------------------------------------");
        System.out.println("Base Price: Rs. " + basePrice);
        System.out.println("Final Ticket Price: Rs. " + finalPrice);
    }
}
