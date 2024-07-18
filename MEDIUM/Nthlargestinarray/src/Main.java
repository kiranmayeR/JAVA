import java.util.*;
import java.util.Scanner;
class Nthlargestinarray{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int arr[]= new int[8];
        int i,j,k,tar=6;
        for(i=0;i<4;i++){
            System.out.println("enter the "+i+"th element:");
            arr[i]=s.nextInt();
        }
        for(i=0;i<4;i++){
            for(j=0;j<4-i-1;j++){
                if (arr[i]>arr[j+1]){
                    k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }
        }
        System.out.println("the target element:"+arr[4-1]);
    }
}