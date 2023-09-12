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
//문제 1
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
//문제2
//public class Ex_Prg{
//	public static void main(String args[]) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 수를 입력하세요:");
//		int num1 = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("연산자(+ - * /)를 입력하세요:");
//		String op = scanner.nextLine();
//		System.out.println("두번째 수를 입력하세요:");
//		int num2 = scanner.nextInt();
//		
//		switch(op) {
//		case "+":
//			System.out.println(num1+"+"+num2+"="+(num1+num2)); break;
//		case "-":
//			System.out.println(num1+"-"+num2+"="+(num1-num2)); break;
//		case "*":
//			System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
//		case "/":
//			System.out.println(num1+"/"+num2+"="+(num1/num2)); break;
//		default:
//			System.out.println("연산자가 잘못 입력되었습니다."); break;
//		}
//
//	}
//}
//문제3
//public class Ex_Prg{
//	public static void main(String arg[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하세요:");
//		int temp = sc.nextInt();
//				
//		switch(temp/10) {
//		case 1:
//			System.out.println("당신은 10대"); break;
//		case 2:
//			System.out.println("당신은 20대");	break;
//		case 3:
//			System.out.println("당신은 30대"); break;
//		default :
//			System.out.println("당신은 기타"); break;
//		}
//	}
//}
//문제4
//public class Ex_Prg{
//	public static void main(String arg[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("국어 영어 수학점수를 입력하세요:");
//		int ko = sc.nextInt();
//		int en = sc.nextInt();
//		int ma = sc.nextInt();
//
//
//		switch((ko+en+ma)/3/10) {
//		case 10:
//			System.out.println("A학점"); break;
//		case 9:
//			System.out.println("A학점");	break;
//		case 8:
//			System.out.println("B학점"); break;
//		case 7:
//			System.out.println("C학점"); break;
//		case 6:
//			System.out.println("D학점"); break;
//		default:
//			System.out.println("F학점"); break;
//		}
//	}
//
//}

//문제 5
//public class Ex_Prg{
//public static void main(String arg[]) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("가위(1)바위(2)보(3)중 하나를 입력하세요:");
//	int you = sc.nextInt();
//	int com = (int)(Math.random()*3)+1;
//	int result = you - com;
//	System.out.println("당신은"+ you +"입니다");
//	System.out.println("컴퓨터는"+ com +"입니다");
//		switch(result) {
//		case 0:
//			System.out.println("비겼습니다"); break;
//		case -1:
//			System.out.println("졌습니다"); break;
//		case 2:
//			System.out.println("졌습니다"); break;
//		case 1:
//			System.out.println("이겼습니다"); break;
//		case -2:
//			System.out.println("이겼습니다"); break;
//		}
//	}
//
//}
//문제 6
//public class Ex_Prg{
//public static void main(String arg[]) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("당신의 주민등록번호를 입력하세요:");
//	String you = sc.nextLine();
//	char num = you.charAt(7);
//		switch(num) {
//		case '1':
//			System.out.println("당신은 2000년이전에 출생한 남자입니다"); break;
//		case '2':
//			System.out.println("당신은 2000년이전에 출생한 여자입니다"); break;
//		case '3':
//			System.out.println("당신은 2000년이후에 출생한 남자입니다"); break;
//		case '4':
//			System.out.println("당신은 2000년이후에 출생한 여자입니다"); break;
//
//		}
//	}
//
//}
