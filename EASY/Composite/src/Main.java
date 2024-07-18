import java.util.*;
class composite{
    public static void main(String args[]){
        int n=9,flag;
        for(int i=2;i<n;i++){
            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i+"-prime");
            }
            else{
                System.out.println(i+"-composite");
            }
        }
    }
}