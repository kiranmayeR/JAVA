import java.util.Scanner;
class NPerfectNum {
    public static void perfectnum(int n) {
        System.out.println("Perfect numbers up to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int h = s.nextInt();
        perfectnum(h);
        s.close();
    }
}
