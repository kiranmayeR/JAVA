import java.util.Scanner;
class Untilpall{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(true){
            int rev=reverse(n);
            sum=sum+rev;
            if(ispall(sum)==true){
                System.out.println(sum);
                break;
            }
            else{
                n=sum;
            }
        }
    }
    public static int reverse(int num){
        int rem=0,rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public static boolean ispall(int num){
        if(num==reverse(num)){
            return true;
        }
        else{
            return false;
        }
    }
}