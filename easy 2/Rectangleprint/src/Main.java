import java.util.*;
class Rectangleprint{
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++) {
            for (int j = 0; j <Math.pow(n,2); j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}