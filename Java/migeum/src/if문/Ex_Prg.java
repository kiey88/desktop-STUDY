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
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1,num2,num3;
//		System.out.print("국어 영어 수학 점수를 입력하세요:");
//		num1=sc.nextInt();
//		num2=sc.nextInt();
//		num3=sc.nextInt();
//		if(num1<=40||num2<=40||num3<=40||(num1+num2+num3)/3<60) {
//			System.out.println("안됐군요 ㅠㅠ 불합격");
//		}	
//		else {System.out.println("축하합니다!합격입니다");
//		}
//	}
//	}
//문제8
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요:");
//		int num = sc.nextInt();
//		if(num%2==0&&num%3==0) {
//			System.out.println(num+"은 2와 3의 공배수입니다");
//		}else {
//			System.out.println(num+"은 2와 3의 공배수가 아닙니다");
//		}
//	}}
//문제9
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째수 :");
//		int num = sc.nextInt();
//		int result=0;
//		sc.nextLine();
//		System.out.print("연산자(+-*/):");
//		String op = sc.nextLine();
//		System.out.print("두번째수:");
//		int num2 = sc.nextInt();
//		if(op.equals("+")) {
//			result=num+num2;
//		}
//		if(op.equals("-")) {
//			result=num-num2;
//		}
//		if(op.equals("*")) {
//			result=num*num2;
//		}
//		if(op.equals("/")) {
//			result=num/num2;
//		}
//		System.out.println(num+ op +num2+"="+ result);
//	}
//}
////
//문제10
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몸무게를 입력하세요 :");
//		double weight = sc.nextDouble();
//		if(weight < 63.5) {
//			System.out.println("당신은 Light급 입니다");
//		} else if(weight>=63.5&&weight < 67) {
//			System.out.println("당신은 Welter급 입니다");
//		} else if(weight>=67&&weight < 71) {
//			System.out.println("당신은 Light Welter급 입니다");
//		} else if(weight>=71&&weight < 75) {
//			System.out.println("당신은 Middle급 입니다");
//		} else if(weight>=75&&weight < 81) {
//			System.out.println("당신은 Light Heavy급 입니다");
//		} else if(weight>=81) {
//			System.out.println("당신은 Heavy급 입니다");
//		}
//	}
//}
//문제 11
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도를 입력하세요 :");
//		int year = sc.nextInt();
//		if(year%4==0&& year%400==0) {
//			System.out.println(year+"은 윤년입니다");
//		} else if(year%4==0&& year%100==0) {
//			System.out.println(year+"은 평년입니다");
//		} else if(year%4==0) {
//			System.out.println(year+"은 윤년입니다");
//		} else {
//			System.out.println(year+"은 평년입니다");
//		}
//	}}
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도를 입력하세요 :");
//		int year = sc.nextInt();
//		if(year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println(year+"은 윤년입니다");
//
//		} else {
//			System.out.println(year+"은 평년입니다");
//		}
//	}
//}
//문제12
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 :");
//		int old = sc.nextInt();
//		if(old>=10 && old<=19) {
//			System.out.println("당신은 10대이군요");
//		} else if(old>=20 && old<=29) {
//			System.out.println("당신은 20대이군요");
//		} else if(old>=30 && old<=39) {
//			System.out.println("당신은 30대이군요");
//		} else {
//			System.out.println("기타");
//		}
//	}}
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 :");
//		int old = sc.nextInt();
//		if(old<20)
//			System.out.println("당신은 10대이군요");
//		else if(old<29)
//			System.out.println("당신은 20대이군요");
//		else if(old<39)
//			System.out.println("당신은 30대이군요");
//		else 
//			System.out.println("기타");
//	}
//}
//문제13
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용량을 입력하세요 :");
//		int amt = sc.nextInt();
//		int result=0;
//		if(amt <= 50) {
//			result= amt*34;
//		} else if(amt<=100) {
//			result= 50*34 + (amt-50)*81;
//		} else {
//			result= 50*34 + 50*81+(amt-100)*122;
//		}
//		System.out.println("전기요금:"+result);
//	}
//}
//문제14
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("영문자를 입력하세요 :");
//		String alpha = sc.next();
//		char a = alpha.charAt(0);
//		if(a>=65 && a<=90) {
//			System.out.println("대문자입니다");
//		} else {
//			System.out.println("소문자입니다");
//		}
//	}
//}

// 'A'-'Z' : 65~90  'a'-'z': 97~122  '0'-'9': 48 ~57
//'A'+32 --->'a'
//문제 15
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자를 입력하세요 :");
//		String alpha = sc.next();
//		char a = alpha.charAt(0);
//		if(a>=65 && a<=90) {
//			System.out.println((char)(a+32));
//		} 
//		if(a>=97 && a<=122){
//			System.out.println((char)(a-32));
//		}
//	}
//}
//문제 16
//class Ex_Prg{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.print("문자를 입력하세요 :");
//	String alpha = sc.next();
//	char a = alpha.charAt(0);
//
//	if(a>=48 && a<=57) {
//		System.out.println("숫자입니다");
//	} else if(a>=65 && a<=90 || a>=97 && a<=122){
//		System.out.println("영문자입니다");
//
//	} else {
//		System.out.println("특수문자입니다");
//	}
//}
//}
//문제17
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("3개의 수 :");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		//	a>b>c
//		//	a>c>b
//		//	b>a>c
//		//	b>c>a
//		//	c>a>b
//		//	c>b>a
//		if(a > b && b>c) {
//			System.out.printf("큰 순서대로 출력: %d  %d  %d\n"+a, b, c);
//		} else if(a >c && c>b){
//			System.out.printf("큰 순서대로 출력:%d  %d  %d\n" +a, c, b);
//		} else if(b >a && a>c){
//			System.out.printf("큰 순서대로 출력: %d  %d  %d\n",b, a, c);
//		} else if(b >c && c>a){
//			System.out.printf("큰 순서대로 출력: %d  %d  %d\n",b, c, a);
//		} else if(c >a && a>b){
//			System.out.printf("큰 순서대로 출력: %d  %d  %d\n",c, a, b);
//		} else if(c >b && b>a){
//			System.out.printf("큰 순서대로 출력: %d  %d  %d\n",c, b, a);
//		}
//	}
//}
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("3개의 수 :");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int k;
//		if(a<b){
//			k=a;
//			a=b;
//			b=k;
//		} 
//		if(a<c){
//			k=a;
//			a=c;
//			c=k;
//		}
//		if(b<c) {
//			k=b;
//			b=c;
//			c=k;
//
//		}
//		System.out.printf("큰 순서대로 출력: %d  %d  %d\n",a,b,c);
//	}
//}

//문제18
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner anum = new Scanner(System.in);
//		System.out.println("올해의 연도를 입력하시요:");
//		System.out.println("태어난 연도를 입력하시요:");
//		int year = anum.nextInt();
//		int born = anum.nextInt();
//		if(born%12==1) {
//			System.out.println((year-born)+"살이고 닭띠입니다");
//		} else if(born%12==2) {
//			System.out.println((year-born)+"살이고 개띠입니다");
//		} else if(born%12==3) {
//			System.out.println((year-born)+"살이고	 돼지입니다");
//		} else if(born%12==4) {
//			System.out.println((year-born)+"살이고 쥐띠입니다");
//		} else if(born%12==5) {
//			System.out.println((year-born)+"살이고 소띠입니다");
//		} else if(born%12==6) {
//			System.out.println((year-born)+"살이고 호랑이띠입니다");
//		} else if(born%12==7) {
//			System.out.println((year-born)+"살이고 토끼띠입니다");
//		} else if(born%12==8) {
//			System.out.println((year-born)+"살이고 용입니다");
//		} else if(born%12==9) {
//			System.out.println((year-born)+"살이고 뱀띠입니다");
//		} else if(born%12==10) {
//			System.out.println((year-born)+"살이고 말띠입니다");
//		} else if(born%12==11) {
//			System.out.println((year-born)+"살이고 양띠입니다");
//		} else if(born%12==12) {
//			System.out.println((year-born)+"살이고 원숭이띠입니다");
//		}
//	}
//}
//문제 19
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("어떤 도형의 면적을 구할까요?(R-사각형,T-삼각형,C-원:");
//		String figure = sc.nextLine();
//		if(figure.equals("R")) {
//			System.out.println("가로:");
//			System.out.println("세로:");
//			int width = sc.nextInt();
//			int height = sc.nextInt();
//			System.out.println("사각형의 면적은"+(width*height)+"입니다");	
//		} else if(figure.equals("T")) {
//			System.out.println("밑변:");
//			System.out.println("높이:");
//			int bottom = sc.nextInt();
//			int height = sc.nextInt();
//			System.out.println("사각형의 면적은"+(bottom*height)/2+"입니다");
//		} else if(figure.equals("C")) {
//			System.out.println("반지름:");
//			double h = sc.nextDouble();
//			System.out.println("원의 면적은"+3.14159*h*h+"입니다");
//		}
//	}
//}
//문제20
//class Ex_Prg{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하세요:");
//		int old = sc.nextInt();
//		System.out.println("키를 입력하세요:");
//		double height = sc.nextDouble();
//		System.out.println("체중을 입력하세요:");
//		int weight = sc.nextInt();
//				
//		double h1 = height/100;
//		double h2 = Math.round(h1*h1 * 10) / 10.0;
//		double kauf = Math.round((weight/h2) * 10) / 10.0;
//		System.out.println(kauf);
//		if(old>=20 && old<30) {
//			if(kauf <=17.9 ) {
//				System.out.println("당신은 저체중입니다");	
//			}else if (kauf >=18 && kauf <= 23){
//				System.out.println("당신은 표준체중입니다");
//			}else if(kauf >=24 && kauf <= 30 ) {
//				System.out.println("당신은 과체중입니다");
//			}else if(kauf > 30 ) {
//				System.out.println("당신은 비만체중입니다");
//			} 
//			else if(old>=30 && old<40) {
//				if(kauf <=18.4 ) {
//					System.out.println("당신은 저체중입니다");	
//				}else if (kauf >=18.5 && kauf <= 23){
//					System.out.println("당신은 표준체중입니다");
//				}else if(kauf >=24 && kauf <= 30 ) {
//					System.out.println("당신은 과체중입니다");
//				}else if(kauf > 30 ) {
//					System.out.println("당신은 비만체중입니다");
//				}
//			}
//		}
//	}
//}
//
// switch
//class Ex_Prg{
//	public static void main(String[] args) {
//		int n=3;
//		switch(n) {
//		case 1:System.out.println("Simple Java");break;
//		case 2:System.out.println("Funny Java");break;
//		case 3:System.out.println("Fantastic Java");break;
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












