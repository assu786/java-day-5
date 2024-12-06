import java.util.*;
class F
{
    public static void main(String args[])
    {
        Scanner b=new Scanner (System.in);
        int t=b.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=b.nextInt();
            int rev=0;
            while(n>0)
            {
                int dig=n%10;
                rev=rev*10+dig;
                n/=10;
            }
            System.out.println(rev);
        }
    }
}