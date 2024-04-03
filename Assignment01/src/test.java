import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number");
		num=sc.nextInt();
		System.out.println("Binary is -"+Integer.toBinaryString(num));
		System.out.println("Binary is -"+Integer.toOctalString(num));
		System.out.println("Binary is -"+Integer.toHexString(num));
		
		

	}

}
