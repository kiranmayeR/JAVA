import java.util.*;
import java.util.ArrayList;
class Cases{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int up=0;
		int lw=0;
		int num=0;
		char n;
		while(true){
			n=sc.next().charAt(0);	
			if(n=='*'){
				break;
			}
			if(Character.isUpperCase(n)){
				up++;
			}
			else if(Character.isLowerCase(n)){
				lw++;
			}
			else if(Character.isDigit(n)){
				num++;
			}
		}
		System.out.println(up);
		System.out.println(lw);
		System.out.println(num);
	}
}
