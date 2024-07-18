import java.util.*;
class Deno{
	public static void main(String args[]){
		int[] d={2000,500,200,100};
		int n[]=new int[50];
		int i,j,k;
		int bal=0;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<d.length;i++){
			System.out.println("Enter the num of notes for " +d[i]+": " );
			n[i]=sc.nextInt();
			
		}
		for(i=0;i<d.length;i++){
			for(j=0;j<d.length;j++){
				bal=bal+d[i]*n[j];
			}
		}
		System.out.println("The balance is : "+bal);
	}
}
		