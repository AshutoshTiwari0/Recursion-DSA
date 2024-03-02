package DataStructures.Recursion;

import java.util.Scanner;

//tasks-> to print natural numbers from 1 to n and n to 1
//<------------- n to 1--------------->
//class ans
//{
    /*
    void solve(int a)
    {
        System.out.println(a);
        int b=--a;
        if(b>0)
        {
        solve(b);
        }
}*/
/*
void solve(int a)
{
    if(a==0)
    {
        return;
    }
    else
    {
        System.out.println(a);
        solve(a-1);
    }
}
}
*/
//<------------- 1 to n--------------->

/*
 * first print 1 to n-1 then print n
 */
class ans
{
    void func(int n)
    {
        if(n==0)
        {
            return;
        }
        func(n-1);
        System.out.println(n);

    }
    


}


public class naturalnumbers {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int a=ob.nextInt();
       // ans obj=new ans();
       // obj.solve(a);
       ans obj=new ans();
       obj.func(a);
       ob.close();

    }
}
