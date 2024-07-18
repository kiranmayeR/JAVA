import java.util.*;
class Mediumgiven{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[1000];
		int i,j,k=0,flag=0,p=0,np=0;
		for(i=0;i<=n;i++){
			for(k=0;k<n;k++){
				i=sc.nextInt();
				arr[k]=i;
			}
		}
		System.out.println("The array size is : "+k);
		for(i=0;i<k;i++){
			for(j=2;j<=arr[i]/2;j++){
				if(arr[i]%j==0){
					flag=1;
					break;
				}
				else{
					flag=0;
				}
			}
			if(flag==1){
				np=np+1;
			}
			else{
				p=p+1;
			}
		}
		System.out.println("P= "+p+" NP= "+np);
	}
}
		
		