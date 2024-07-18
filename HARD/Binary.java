
import java.util.*;
class Binary{
	public static void main(String args[]){
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		String bin=Integer.toBinaryString(num);
		String oct=Integer.toOctalString(num);
		System.out.println("Binary:"+bin+" Octal: "+oct);
	}
}