import java.util.Scanner;

public class PosNeg
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        double num = obj.nextDouble();

        String x = (num<0) ? "Negative": "Positive";
        System.out.println(x);

        if((num==0) && (num<1))
        {
            System.out.println("Zero");
        }
        if(num<1)
        {
            System.out.println("Small");
        }
        else if(num>1000000)
        {
            System.out.println("Large");
        }


    }
}
