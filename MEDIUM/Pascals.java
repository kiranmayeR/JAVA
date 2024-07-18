import java.util.Scanner;
class Pascals{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int num;
		int i,j,k;
		for(i=0;i<n;i++){
			for(k=1;k<n-i;k++){
				System.out.print(" ");
			}
			num=1;
			for(j=0;j<=i;j++){
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}