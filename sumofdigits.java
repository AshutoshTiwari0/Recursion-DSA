package DataStructures.Recursion;
import java.util.*;
class answerrr
{
    int solution(int n) {
        if (n <= 9) {
            // If n is a single digit, return n
            return n;
        } else {
            int num = n % 10;
            
            // Add the last digit to the sum and make a recursive call with updated n
            return num + solution(n / 10);
        }
    }
    
}
public class sumofdigits {
    public static void main(String[] args) {
        answerrr obj=new answerrr();
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int a=ob.nextInt();
        int answer=obj.solution(a);
        System.out.println(answer);
        ob.close();



    }
}
