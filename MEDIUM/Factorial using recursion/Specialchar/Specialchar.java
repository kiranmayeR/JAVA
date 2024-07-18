import java.util.Scanner;
import java.util.ArrayList;

class Specialchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        ArrayList<Character> special = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                special.add(ch);
                count++;
            }
        }
        System.out.println("Special characters: " + special);
        System.out.println("Count of special characters: " + count);
    }
}
