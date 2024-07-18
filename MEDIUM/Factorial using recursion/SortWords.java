import java.util.*;

class SortWords {
    public static void main(String args[]) {
        String names[] = {"Raags", "Prana", "Dinae", "Kira"};
        String temp;
        int n = 4;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        System.out.println("The names in alphabetical order:");
        for (i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
