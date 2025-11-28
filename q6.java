import java.util.Scanner;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner (System.in);
        float mp;
        float discount= 0;
        float sp;
        char category;
        System.out.println("enter the marked price");
        mp=scan.nextFloat();
        System.out.println("enter category (A/B/C/D):");
         category= scan.next().charAt(0);
         
         if (category =='A'|| category =='a'){
             discount = 60;
            } else if (category == 'B'|| category == 'b'){
                discount =40;
            }else if (category == 'C'|| category == 'c'){
                discount =20;
            }else if (category == 'D'|| category == 'd'){
                discount =10;
            }else{
                System.out.println("Invalid category!");
                
                
            }
            sp = mp - (mp* discount/100);
            
            System.out.println("Selling price="+sp);
            
                
                
            
            
            
            
            
            }

}