package jump2java;
import java.util.Scanner;

public class discover {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		
		
		System.out.println(num+"의 약수");
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+num+"약수의 갯수: ");
	}
}
