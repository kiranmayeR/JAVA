import java.util.*;
class Last{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int size = str.length();
		int i,j,k;
		String a = str.trim();
		int lastindex;
		lastindex=a.lastIndexOf(' ');
		if(lastindex==-1){
			System.out.println("The len: "+size);
		}
		else{
			System.out.println("The len=: "+ (size-lastindex-1));
		}
	}
}
			
				
				