import java.util.*;
class PrintVow{
	public static void vowel(String str){
	 	int i,j,k,count=0;
		ArrayList <Character> con= new ArrayList<>();
		ArrayList <Character> vow= new ArrayList<>();
		for(i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				vow.add(ch);
			}
			else{
				con.add(ch);
			}
		}
		System.out.println("Vowels: "+vow);
		System.out.println("Conso: "+con);
	}
	public static void main(String args[]){
		String s="sriraagavi";
		vowel(s);
	}
}