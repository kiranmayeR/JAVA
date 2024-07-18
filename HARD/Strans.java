import java.util.*;
import java.util.ArrayList;
class Strans{
	public static void main(String args[]){
		ArrayList <String> Ans= new ArrayList<>();
		int n;
		Scanner sc = new Scanner (System.in);
		n=sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				Ans.add("FizzBuzz");
			}
			else if(i%3==0){
				Ans.add("Fizz");
			}
			else if(i%5==0){
				Ans.add("Buzz ");
			}
			else{
				Ans.add(String.valueOf(i));
			}
		}
		System.out.print(Ans);
	}
}
		