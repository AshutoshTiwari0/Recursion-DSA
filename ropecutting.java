package DataStructures.Recursion;

import java.util.Scanner;

/*
 * question we are given a rope of length n and we want to cut it into max no of peices such that length of peices is either a or b or c
 * n=5, a=2,b=5,c=1->
 * 5 hai length rope ki 
 * a=2 -> 2 ki 2 kato aur phir ek ki
 * b=5-> zero cuts here
 * c=1-> 1 ki 5 kato->5 kato ek ki-> this will give max peices so this is ans
 * 
 */
class solution
{
    int ans(int n,int a,int b,int c)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return -1;
        }
           int res= Math.max(ans(n-a, a, b, c), 
           Math.max(ans(n-b, a, b, c), 
           ans(n-c, a, b, c)));

           if(res==-1)
           {
            return -1;
           }
        return res+1;
    }
}



public class ropecutting {
    public static void main(String[] args) {
        solution obj=new solution();
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        int answer=obj.ans(n, a, b, c);
        System.out.println(answer);
        ob.close();

    }
}
