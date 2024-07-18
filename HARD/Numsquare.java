import java.util.*;

class Numsquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int l = sc.nextInt();
        System.out.println("Enter the upper range:");
        int u = sc.nextInt();
        List<String> numSquarePairs = new ArrayList<>();
        for (int i = l; i <= u; i++) {
            int square = i * i;
            numSquarePairs.add("(" + i + ", " + square + ")");
        }
        System.out.println(numSquarePairs);
    }
}
