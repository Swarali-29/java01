import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ifelse6 
{
    public static void main(String[]args)
    {
        
        char ch;
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input");
        ch=sc.next().charAt(0);
        x=ch;
        if(x>=65 && x<=90)
        {
            System.out.println("alphabet");
        }
        else if(x>=97 && x<=122)
        {
            System.out.println("alphabet");
        }
        else 
        {
            System.out.println("not a alphabet");
        }
        }

    }
    

