package for_ex;
import java.util.*;
//1.for문을 사용해봅시다
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int i;
//		for(i=0; i<10; i++) {
//			System.out.println("변수 i의 값:"+i);
//		}
//		System.out.println("\n"+i);
//	}
//}
//2.a변수값을 2씩 증가시켜 봅시다
//public class EX_Prg {
//	public static void main(String[] arg) {
//		for(int i=0; i<10; i+=2) {
//			System.out.println("변수 i의 값:"+i);
//		}
//	}
//}
//3.a변수 값을 1씩 감소시켜 봅시다
//public class EX_Prg {
//	public static void main(String[] arg) {
//		for(int i=10; i<1; i--) {
//			System.out.println("변수 i의 값:"+i);
//		}
//	}
//}
//4.a변수 값을 100부터 200까지 10씩 증가시켜 봅시다
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int i;
//		for( i=100; i<=200; i+=10) {
//			System.out.println("변수 i의 값:"+i);
//		}
//	}
//}
//5.알파벳을 출력시켜 봅시다
//1)
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int M;
//		for( M=97; M<=122; M++) {
//			System.out.printf("%c",M);
//		}
//	}
//}

//2)
//public class EX_Prg {
//	public static void main(String[] arg) {
//		char M;
//		for( M='A'; M<='Z'; M++) {
//			System.out.printf("%c",M);
//		}
//	}
//}
//6.block 개념을 이해하여 봅시다
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int a;
//		for( a=1; a<=3; a++) {
//			System.out.printf("%d",a);
//			System.out.println("이다");
//		}
//		System.out.println("종료");
//	}
//}
//7.초기값과 증감식 기재부분에 2개 이상의 수식을 기재하여 봅시다.
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int a,b;
//		for( a=1,b=3; a<=2; a++,b--) {
//			System.out.printf("%5d%5d\n",a,b);
//		}
//	}
//}
//8.for문을 강제 탈출시켜 봅시다
//
//1
//종료
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int a=2;
//		for(;;) {
//			if(a==0)break;
//			System.out.printf("%d\n",a--);
//		}
//		System.out.println("종료");
//	}
//}
//9.for문 속에서의 continue문을 알아 봅시다.
//continue는 조건이 맞으면 무조건 증감식으로 이동
//1
//***
//3
//***
//종료
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int a;
//		for(a=1;a<=4;a++) {
//			if(a%2==0) {System.out.println("***"); continue;}
//			System.out.printf("%d\n",a);
//		}
//		System.out.println("종료");
//	}
//}
//1.다음 프로그램의 실행결과를 예측하여 봅시다.
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int a;
//		int b=0,c=0;
//		for(a=1;a<=20;a++) {
//			if(a%3==0) b+=a;			
//			if(a%5==0) c+=a;			
//		}
//		System.out.printf("%d-%d=%d\n",b,c,b-c);
//	}
//}
//63-50=13
//2번문제
public class EX_Prg {
	public static void main(String[] arg) {
		System.out.printf("1)");
		for( int i=2;i<=10;i++){
			System.out.printf("%2d",i);
		};
		System.out.println();
		int c;
		for( c=9;c<=1;c--){
			System.out.printf("2)%2d",c);
		}
		
		int b;
		for( b=3;b<=15;b+=3){
			System.out.printf("3)%2d",b);
		}
		
		
		System.out.printf("3)%2d",b);
	}
}









