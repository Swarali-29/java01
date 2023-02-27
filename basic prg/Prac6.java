import java.util.Scanner;

public class Prac6 
{
    public static void main(String[]args)
    {
        Double c,f ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp in f");
        f=sc.nextDouble();
        c=(5.0/9.0)*(f-32);
        System.out.println(c);
        }
    
}
