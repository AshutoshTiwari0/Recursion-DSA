package DataStructures.Recursion;
import java.util.*;
class basecase
{
    int factorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
public class factorial {
    public static void main(String[] args) {
        basecase obj=new basecase();
        System.out.println("enter a number");
        Scanner ob=new Scanner(System.in);
        int inp=ob.nextInt();
       int ans= obj.factorial(inp);
       System.out.println(ans);
       ob.close();
    }
}
