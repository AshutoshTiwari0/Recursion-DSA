package DataStructures.Recursion;
import java.util.*;

class Permutations {
    void generatePermutations(String str, int i) {
        int l = str.length();
        if (i == l - 1) {
            System.out.println(str);
            return;
        }

        for (int j = i; j < l; j++) {
            str = swap(str, i, j);
            generatePermutations(str, i + 1);
            str = swap(str, i, j); // backtrack
        }
    }

    String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}

public class stringpermuataions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Permutations obj = new Permutations();

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Permutations:");
        obj.generatePermutations(inputString, 0);

        scanner.close();
    }
}
