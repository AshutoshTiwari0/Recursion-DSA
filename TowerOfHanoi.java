package DataStructures.Recursion;
import java.util.*;
class ans
{
    void TowerHanoiKa(int n,char A,char B,char C)
    {
        //if there is only one disk simply move it from tower A to tower C
        if(n==1)
        {
            System.out.println("Move disk 1 from "+A+" to "+C);
            return;
        }
        TowerHanoiKa(n-1, A, C, B);
        System.out.println("Move disk "+n+"from "+A+" to "+C);
        TowerHanoiKa(n-1, B,A,C);
    }
}
 class TowerofHanoi {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of disks");
        int n=ob.nextInt();
        char firstdisc='A';
        char seconddisc='B';
        char thirddisc='C';
        ans obj=new ans();
        obj.TowerHanoiKa(n, firstdisc, seconddisc, thirddisc);
        ob.close(); 
    }
}
