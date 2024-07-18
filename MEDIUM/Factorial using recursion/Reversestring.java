import java.util.*;
class Reversestring{
	public static void main(String args[]){
		Scanner  sc = new Scanner(System.in);
		String str= sc.nextLine();
		String reverse=" ";
		int n=str.length()-1;
		int i,j;
		for(i=n;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("The reversed string : "+reverse);
	}
}