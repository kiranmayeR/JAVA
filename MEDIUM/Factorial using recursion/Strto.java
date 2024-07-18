import java.util.*;
class Strto{
	public static void main(String args[]){
		String num="123344";
		int n=0,i;
		for(i=0;i<num.length();i++){
			n=n*10+num.charAt(i)-'0';
		}
		System.out.println("The integer is : "+n);
	}
}