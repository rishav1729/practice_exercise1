
import java.util.Scanner;

public class calculator {
public static void main(String[] args) {
		calculator f = new calculator();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("enter two numbers for arithmetic operation");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result;
		
		System.out.println("enter 1 for addition,2nd for straction, 3 for multiplication, 4 for division");
		int res=sc.nextInt();
		switch(res)
		{
		case 1:
			 result=a+b;
			System.out.println(result);
			break;
		case 2:
			 result=a-b;
			System.out.println(result);
			break;
		case 3:
			 result=a*b;
			System.out.println(result);
			break;
		case 4:
			 result=a/b;
			System.out.println(result);
			break;
			
		case 0:
			System.exit(0);
			
			
			
		}
		
		}
		
		}
		}

