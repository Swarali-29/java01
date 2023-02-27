import java.util.Scanner;

public class Prac2
{
    public static void main(String[]args)
    {
        Double a,b,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radii");
        r=sc.nextDouble();
        a=3.14*r*r;
        System.out.println("Area is"+a);
        b=2*3.14*r;
        System.out.println("cirm is"+b);

    }

    
}
