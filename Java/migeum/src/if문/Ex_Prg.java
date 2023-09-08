package if문;

import java.util.Scanner;
//
//public class Ex_Prg {
//	public static void main(String[] args) {
//		int a;
//		a= -2;
//		if(a<0) 
//			System.out.println("음수");
//		System.out.println("입니다");
//	}
//}

//
//class Ex_Prg{
//	public static void main(String[] args) {
//		int a=2, b=3;
//		if (a>b) 
//			System.out.println("대한");
//		System.out.println("민국");
//		System.out.println("호호");
//	}
//}
//
//class Ex_Prg{
//	public static void main(String[] args) {
//		int a = 40;
//		if(a>=60) System.out.println("합격");
//		else System.out.println("불합격");
//		System.out.println("안녕");
//	}
//}
//문제1
//class Ex_Prg{
//	public static void main(String[] args) {
//		System.out.print("정수를 입력하세요:");
//		Scanner sc = new Scanner(System.in);
//
//		int num=sc.nextInt();
//		nextInt() 메서드
//		Scanner 클래스는 다양한 유형의 데이터를 읽는 다양한 메소드를 제공하며
//		그 중 하나는 nextInt()입니다. nextInt() 메소드는 입력의 다음 
//		토큰을 정수 값으로 읽습니다.
//		이 방법의 작동 방식은 다음과 같습니다.
//		사용자가 텍스트를 입력하고 Enter를 누르기를 기다립니다.
//		공백이나 줄 종결자가 발견될 때까지 입력을 읽습니다.
//		읽은 문자열을 정수로 변환하려고 시도합니다.
//		성공하면 정수값을 반환합니다.
//		if(num<0) {
//			System.out.println(num+" 은 음수입니다");
//		}
//		if(num>0){
//			System.out.println(num+" 은 양수입니다");
//		}
//	}
//}
//문제2
//class Ex_Prg{
//	public static void main(String[] args) {
//		System.out.print("나이를 입력 하세요:");
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//
//		if(num<18) {
//			System.out.println("관람료는 무료입니다");
//		}
//		if(num>=18){
//			System.out.println("관람료는 1500원입니다");
//		}
//	}
//}
//문제3
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		System.out.print("수를 입력하시오 : ");
//		num1=sc.nextInt();
//		System.out.print("수를 입력하시오 : ");
//		num2=sc.nextInt();
//		if(num1>num2){
//			System.out.println("큰수는"+num1+"입니다");
//		}
//		if(num1<num2) {
//			System.out.println("큰수는"+num2+"입니다");
//		}
//	}
//
//}
//문제4
//class Ex_Prg{
//	public static void main(String[] args) {
//		System.out.print("정수를 입력하세요:");
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//		
//		if( num%2==1) {
//			System.out.println(num+"는 홀수입니다");
//		} 
//		if( num%2==0) {
//			System.out.println(num+"는 짝수입니다");
//		}
//	}
//}
//문제5
//class Ex_Prg{
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2, num3;
//		System.out.print("키를 입력하시오 : ");
//		num1=sc.nextInt();
//		System.out.print("몸무게를 입력하시오 : ");
//		num2=sc.nextInt();
//		num3 = (num1-100)*(9/10);
//		if( num3<num2) {
//			System.out.println("다이어트가 필요하다");
//		} 
//		if( num3>num2) {
//			System.out.println("다이어트가 필요없다");
//		}
//	}
//}

//문제6 
//class Ex_Prg{
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int num1, num2, num3;
//		System.out.print("국어 영어 수학 점수를 입력하세요:");
//		num1=sc.nextInt();
//		num2=sc.nextInt();
//		num3=sc.nextInt();
//		//60 60 60 이렇게 입력가능
//		//60
//		//60
//		//60 세로로 이렇게도 입력 가능
//		int avg= (num1+num2+num3)/3;
//		if(avg<60) {
//			System.out.println("불합격입니다 노력하세요~");
//		}else {
//			System.out.println("합격입니다");
//		}
//	}
//}
// 문제7
class Ex_Prg{
	Scanner sc = new Scanner(System.in);
	int num1,num2,num3
	System.out.print("국어 영어 수학 점수를 입력하세요:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	if(num1<60||num2<60||num3<60||) {
		System.out.println("안됐군요 ㅠㅠ 불합격");
	}	
	if((num1+num2+num3)/3<60) {
		System.out.println("안됐군요 ㅠㅠ 불합격");
	}else {System.out.println("축하합니다!합격입니다");
	}












