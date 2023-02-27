import java.util.Scanner;

public class Prac1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary");
        double salary=sc.nextDouble();
        double da=0.2*salary;
        double hrs=0.4*salary;
        double gross=salary+hrs+da;
        System.out.println("da"+da);
        System.out.println("hrs"+hrs);
        System.out.println("gross"+gross);
    }
    
}
