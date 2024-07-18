import java.util.*;
import java.util.Scanner;
class Choicecheckpal{
    public static boolean ispal(String s){
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!= s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        int casenum;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the choice num: 1. string // 2. number");
        casenum= s.nextInt();
        s.nextLine();
        switch (casenum){
            case 1:
                System.out.println("enter the string:");
                String i = s.nextLine();
                if(ispal(i)){
                    System.out.println("the string is palindrome");
                }else{
                    System.out.println("the given string is not a palindrome");
                }
                break;
            case 2:
                System.out.println("Enter the number:");
                String m= s.nextLine();
                if(ispal(m)){
                    System.out.println("the number is palindrome");
                }else{
                    System.out.println("the given string is not a palindrome");
                }
                break;
        }
    }
}