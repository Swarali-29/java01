import java.util.Scanner;

public class Swap 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter two num");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a+"  "+b);
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
        }
    
}
