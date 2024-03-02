package DataStructures.Recursion;

import java.util.Scanner;

class Solution {

    void solve(String x, String curr, int i) {
        if (i == x.length()) {
            System.out.print(curr + " ");
            return;
        }

        // Include the current character in the subset
        solve(x, curr + x.charAt(i), i + 1);

        // Exclude the current character from the subset
        solve(x, curr, i + 1);
    }
}

public class generatesubsets {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = ob.next();
        Solution obj = new Solution();
        obj.solve(a, "", 0);
        ob.close();
    }
}
