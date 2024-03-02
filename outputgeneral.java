package DataStructures.Recursion;
/* 
class trial
{
    void func1()
    {
        System.out.println("fun 1");
    }
    void func2()
    {
        System.out.println("before fun 1");
        func1();
        System.out.println("after fun 1");
    }
}
*/
/*
class practice2
{
    void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
        }
}
*/
/*
class practice3
{
    void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
        }
}
*/
/*
class practice4
{
    // this function give log n with base 2 if we did 1+fun(n/3) it will log n with base 3
    int fun(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else{
            return 1+fun(n/2);
        }
    }
}
*/
class practice5
{
    //tells binary of a number
    void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        fun(n/2);
        System.out.println(n%2);
    } 
}
public class outputgeneral {
    public static void main(String[] args) {
          /* System.out.println("before fun 2");
            trial obj=new trial();
            obj.func2();
            System.out.println("after fun 2");
            */
            //practice2 obj=new practice2();
            //obj.fun(3);
           // practice3 obj=new practice3();
            //obj.fun(3);
           // practice4 obj=new practice4();
           practice5 obj=new practice5();
            obj.fun(13);
           
        
    }
}
