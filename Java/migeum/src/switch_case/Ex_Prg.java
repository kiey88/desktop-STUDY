package switch_case;
import java.util.*;
import java.util.Scanner;



//class Ex_Prg{
//	public static void main(String[] args) {
//		int n=1;
//		switch(n) {
//		case 1:System.out.println("Simple Java");
//		case 2:System.out.println("Funny Java");break;
//		case 3:System.out.println("Fantastic Java");
//		default:System.out.println("The best programming language");break;
//		}
//		System.out.println("do you like coffee?");
//	}
//}
//class Ex_Prg{
//	public static void main(String[] args) {
//		int month = 0;
//		System.out.print("현재 월을 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		month = Integer.parseInt(tmp);
//
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("현재의 계절은 봄입니다");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재의 계절은 여름입니다");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("현재의 계절은 가을입니다");
//			break;
//		default:
//		case 12: case 1: case 2:
//			System.out.println("현재의 계절은 겨울입니다");
//		}
//	}
//}
//class Ex_Prg{
//	public static void main(String[] args) {
//		char gender;
//		String regNo ="";
//		System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");
//		Scanner scanner = new Scanner(System.in);
//		regNo = scanner.nextLine();
//		gender = regNo.charAt(7);
//		
//		switch(gender) {
//		    case '1':
//		    case '3':
//		    		System.out.println("당신은 남자입니다.");
//		    		break;
//		    case '2':
//		    case '4':
//		    		System.out.println("당신은 여자입니다.");
//		    		break;
//		    default:
//		    		System.out.println("유효하지 않은 주민등록번호입니다");
//		}
//	}
//}
//public class Ex_Prg{
//	public static void main(String args[]) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("복권번호를 입력하세요:");
//		int num = scanner.nextInt();
//		switch(num) {
//		case 2:
//			System.out.println("축하합니다 1등에 당첨됬습니다"); break;
//		case 5:
//			System.out.println("축하합니다 2등에 당첨됬습니다"); break;
//		case 7:
//			System.out.println("축하합니다 3등에 당첨됬습니다"); break;
//		default:
//			System.out.println("안됬군요ㅠㅠ 꽝입니다"); break;
//		}
//
//	}
//}
public class Ex_Prg{
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요:");
		int num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("연산자(+ - * /)를 입력하세요:");
		String temp = scanner.nextLine();
		int op = Integer.parseInt(temp);
		System.out.println("두번째 수를 입력하세요:");
		int num2 = scanner.nextInt();
		
		switch(op) {
		case 43:
			System.out.println(num1+"+"+num2+"="+(num1+num2)); break;
		case 45:
			System.out.println(num1+"-"+num2+"="+(num1-num2)); break;
		case 42:
			System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
		case 47:
			System.out.println(num1+"/"+num2+"="+(num1/num2)); break;
		default:
			System.out.println("연산자가 잘못 입력되었습니다."); break;
		}

	}
}
