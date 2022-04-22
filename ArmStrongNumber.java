import java.io.*;
import java.util.*;
//import java
class ArmStrongNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int temp=n;
        double sum=0;
        int rev=0;
        while(n>0)
        {
            int k=n%10;
            sum=sum+Math.pow(k,3);
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Armstrong number");
        }
        else
        {
                System.out.println(" not a Armstrong number");
        }
    }

}
