import java.util.Scanner;

import java.util.Scanner;

public class Ifelse1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter num");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is max");
        }
        else if( b>a && b>c)
        {
            System.out.println("b is max");
        }
        else 
        {
            System.out.println("c is max");
        }
    }
}
