public class JavaQuiz {
    public static void main(String[] args) {
        System.out.println("1. " + (10 / 3));
        final int MAX_VALUE = 100;
        System.out.println("2. MAX_VALUE: " + MAX_VALUE);
        System.out.println("3. " + "5 + 5 = " + 5 + 5); // C) 5 + 5 = 55
        MyClass obj = new MyClass(); // B) MyClass obj = new MyClass();
        System.out.println("4. Object of MyClass created.");
        System.out.println("5. " + "Hello".charAt(2));
        System.out.println("6. " + (10 == 10.0));
        String[] arr1 = {"apple", "banana", "cherry"};
        String arr2[] = {"apple", "banana", "cherry"};
        System.out.println("7. arr1: " + java.util.Arrays.toString(arr1));
        System.out.println("7. arr2: " + java.util.Arrays.toString(arr2));
        System.out.println("8. Static method test: " + MyClass.staticMethod());
        System.out.printf("9. %s\n", "Hello, World!");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("10. ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("11. ");
        for (int i = 0; i < 5; i++) {
            if (i == 2) break;
            System.out.print(i + " ");
        }
        System.out.println(); // A) It terminates the loop and transfers control to the next statement after the loop.

        // Question 12: Difference between == and .equals()
        String str1 = new String("test");
        String str2 = new String("test");
        System.out.println("12. ==: " + (str1 == str2)); // B) == compares object references, .equals() compares values for equality.
        System.out.println("12. .equals(): " + str1.equals(str2));

        // Question 13: Compiling and running an empty Java file
        System.out.println("13. It will compile and run successfully, but produce no output."); // A)

        // Question 14: True about inheritance
        System.out.println("14. Constructors are not inherited."); // D) Constructors are not inherited.

        // Question 15: Convert a String to an int
        int num = Integer.parseInt("123");
        System.out.println("15. " + num); // A) int num = Integer.parseInt("123");

        // Question 16: Output of System.out.println(010 + 10);
        System.out.println("16. " + (010 + 10)); // A) 18

        // Question 17: Output of the given code snippet
        int x = 0;
        do {
            x++;
        } while (false);
        System.out.println("17. " + x); // B) 1

        // Question 18: Declare a method sum that returns the sum of two integers a and b
        System.out.println("18. " + sum(3, 4)); // B) int sum(int a, int b) { return a + b; }

        // Question 19: Difference between ArrayList and LinkedList
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        System.out.println("19. ArrayList allows random access: " + (arrayList instanceof java.util.RandomAccess)); // C) ArrayList allows random access, LinkedList does not.
        System.out.println("19. LinkedList allows faster insertion and deletion: " + (linkedList instanceof java.util.Deque)); // D)

        // Question 20: Iterate through elements of an array using an enhanced for loop
        System.out.print("20. ");
        for (int i : arr) {
            System.out.print(i + " "); // A) for (int i : arr) { System.out.print(i + " "); }
        }
        System.out.println();
    }

    // Method to return the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }
}

class MyClass {
    // Static method to demonstrate static keyword
    public static String staticMethod() {
        return "Static method called.";
    }
}
