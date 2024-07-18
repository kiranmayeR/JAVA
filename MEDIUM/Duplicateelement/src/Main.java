import java.util.*;
import java.util.Scanner;
class Duplicate{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter the"+i+"th element:");
            arr[i]= s.nextInt();
        }
        int[] nondup =new int[1000];
        int p=0;
        for(int y=0;y<4;y++){
            for(int x=0;x<4-y-1;x++){
                if(arr[y]==arr[x]){
                    continue;
                }
                else{
                    nondup[p]=arr[y];
                    p++;
                }
            }
        }

    }
}