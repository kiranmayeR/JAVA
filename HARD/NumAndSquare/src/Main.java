import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class NumSquarearr{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int lower= s.nextInt();
        System.out.println("Enter the upper range:");
        int upper= s.nextInt();
        List<String> nums= new ArrayList<>();
        for(int i=lower;i<upper;i++){
            int m= i*i;
            nums.add("("+i+","+m+")");
        }
        System.out.println(nums);
    }
}
