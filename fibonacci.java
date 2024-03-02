package DataStructures.Recursion;

import java.util.Scanner;

class fiborecursive
{
    int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
public class fibonacci {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the nth number");
        int n=ob.nextInt();
        fiborecursive obj=new fiborecursive();
        int ans=obj.fibo(n);
        System.out.println(ans);
        ob.close();
    }
}
