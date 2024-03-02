package DataStructures.Recursion;

/*
 * about the problem
 * we are given an array with a target sum
 * find all the substes which have sum equal to target
 * ex->[0,1,2,3,4] sum->4
 * [1,3] [0,4] [4] [2,2]
 * output->4
 */
import java.util.Scanner;

class Solution
{
    int solutionof(int a[],int n,int sum)
    {
        if(n==0)
        {
            return (sum==0)?1:0;
        }
        return solutionof(a, n-1,sum)+solutionof(a,n-1,sum-a[n-1]);
    }
}
public class subsetsum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array");
        for(int j=0;j<n;j++)
        {
            arr[j]=ob.nextInt();
        }
        Solution obj=new Solution();
        System.out.println("enter sum");
        int sum=ob.nextInt();
       int ans=obj.solutionof(arr,n,sum);
       System.out.println(ans);
       ob.close();
    }
}
