import java.util.Scanner;

public class OOPDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		if(x==y) {
			System.out.println("value of both variables is equal");
		}
		else {
			System.out.println("value is different");
		}
		System.out.println("===========worling with string");
		System.out.println("enter two strings");
		String strl=sc.next();
		String str2=sc.next();
		if(strl.equals(str2)) {
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}			
			
	
			
		}
		

	}
