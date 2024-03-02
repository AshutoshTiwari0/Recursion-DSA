package DataStructures.Recursion;


//there are n people in a circle. in each iteration we kill the kth person. Find last persn alive

class ans{
    int jos(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (jos(n-1,k)+k)%n;
    }
}
public class josephus {
    public static void main(String[] args) {
        ans obj=new ans();
        int answer=obj.jos(5,3);
        System.out.println(answer);
    }
}
