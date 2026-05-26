package jump2java;
import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		while(true) {
			System.out.println("월 입력: ");
			sc.nextInt()
			
			if(month>=1 && month<=12) {
				break;
			} else {
				System.out.print("다시 입력하세요.");
			}
		}
		
		
		
		if (month==3 || month==4 || month==5) {
			System.out.println("봄");
		} else {
			System.out.println("봄이 아니다.");
		}
		if (month>=3 && month<=5) {
			System.out.println("봄");
		} else {
			System.out.println("봄이 아니다.");
		}
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄이다");
			break;
		default;
			System.out.println("봄이 아니다.");
		}
}
