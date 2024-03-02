package DataStructures.Recursion;
import java.util.*;

//time complexity-> theta(n)
//space complexity->theta(n)
class sum
{
    int solve(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+solve(n-1);
    }
}
public class naturalsum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();
        sum obj=new sum();
        int ans=obj.solve(n);
        System.out.println(ans);
        ob.close();
    }
}
