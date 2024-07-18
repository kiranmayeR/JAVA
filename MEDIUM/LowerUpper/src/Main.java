import java.util.Scanner;
class LowerUpper{
    public static void main(String arg[]){
        System.out.println("enter * to exit.....");
        Scanner s = new Scanner(System.in);
        int ucount=0,lcount=0,dcount=0;
        while(true){
            char ch = s.next().charAt(0);
            if (ch == '*'){
                break;
            }
            if(Character.isUpperCase(ch)){
                ucount++;
            }else if(Character.isLowerCase(ch)){
                lcount++;
            }else if(Character.isDigit(ch)){
                dcount++;
            }else{
                System.out.println("invalid");
            }
        }
        System.out.println("lowers:"+lcount);
        System.out.println("upper:"+ucount);
        System.out.println("digits:"+dcount);
    }
}