import java.util.*;
class Salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double salary=sc.nextDouble();
		double bonus;
		String grade=sc.next();
		if(salary<=10000){
			salary=0.02*salary;
		}
		if(grade.equals("A")){
			bonus=5/100;
			salary=0.05*salary;
		}
		else if(grade.equals("B")){
			bonus=10/100;
			salary=0.1*salary;
		}
		System.out.println("Salary:"+salary);
		
	}
}