import java.util.Scanner;
class Positive{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        int psum=0,nsum=0,pcount=0,ncount=0;
        System.out.println("press -1 to exit");
        while(true){
            n=s.nextInt();
            if(n==-1){
                break;
            }
            if(n>=0){
                psum+=n;
                pcount++;
            }else if(n<0){
                nsum+=n;
                ncount++;
            }
        }
        System.out.println("positive avg:"+(psum/pcount));
        System.out.println("negative avg:"+(nsum/ncount));
    }
}