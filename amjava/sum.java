 //sample Jenkins Code
import java.util.Scanner;
public class sum
{

    public static void main(String[] args) 
{
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 =Integer.parseInt(args[0]);
        
        System.out.println("Enter Second Number: ");
        num2 = Integer.parseInt(args[0]);
        
       
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}