import java.util.Scanner;

public class ElseIf{

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int input = ob.nextInt();
		
		if(input<=100 && input>90){
			System.out.println("Grade = A");
		}
		else if(input<=90 && input>75){
			System.out.println("Grade = B");
		}
		else if(input<=75 && input>60) {
			System.out.println("Grade = C");
		}
		else if(input<=60 && input>50) {
			System.out.print("Grade = D");
		}
		else {
			System.out.print("Fail");
		}
	}

}