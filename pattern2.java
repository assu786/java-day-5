/*54321
54321
54321
54321
54321
*/ 
import java.util.*;
class No
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(j+"");
            }
            System.out.println( );
        }
    }
}