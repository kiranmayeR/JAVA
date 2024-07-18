class Fibonacci{
    public static void main(String arg[]){
        int a=0;
        int b=1;
        int c;
        int n=5;
        for(int i=0;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}