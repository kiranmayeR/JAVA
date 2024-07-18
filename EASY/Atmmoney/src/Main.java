import java.util.Scanner;
import java.util.*;
class Atmmoney{
    public static void main(String args[]){
        int numd,i,sums=0;
        Scanner s= new Scanner(System.in);
        numd=s.nextInt();
        for(i=0;i<numd;i++){
            System.out.println("Enter the "+i+"th denomination:");
            int temp1=s.nextInt();
            System.out.println("enter the number of notes:");
            int temp2=s.nextInt();
            sums += temp1 * temp2;
        }
        System.out.println("Total money available in ATM:"+sums);
    }
}