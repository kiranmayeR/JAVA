import java.util.*;
class User{
	public static boolean Validate(String str){
		int i;
		if(str.length()<6){
			return false;
		}
		for(i=0;i<str.length();i++){
			if(!Character.isLetterOrDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String username= sc.nextLine();
		if(Validate(username)){
			System.out.println("The user name is valid");
		}
		else{
			System.out.println("The user name is not valid");
		}
	}
}