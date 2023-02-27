import java.util.Scanner;

public class Ifelse4
 {
    public static void main(String[]args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");

        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
