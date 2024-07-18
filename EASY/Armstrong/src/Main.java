import java.util.*;
class Armstrong{
    public static void main(String args[]){
        int n=153;
        int len=3;
        double sum=0;
        int rem;
        int temp=n;
        while(temp!=0){
            rem=temp%10;
            sum = sum+Math.pow(rem,len);
            temp/=10;
        }
        if(sum==n){
            System.out.println("number is an armstrong number");
        }
        else{
            System.out.println("number is not an armstrong number");







        }
    }
}