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
//public class EX_Prg {
//	public static void main(String[] arg) {
//		System.out.printf("1)");
//		for( int i=2;i<=10;i+=2){
//			System.out.printf("%3d",i);			
//		
//		};
//		System.out.println();
//		System.out.printf("2)");
//		for( int c=9;c>=1;c--){
//			System.out.printf("%2d",c);
//		}
//		System.out.println();
//		System.out.printf("3)");
//		for( int b=3;b<=15;b+=3){
//			System.out.printf("%3d",b);
//		}
//	}
//}
//문제3 1에서 10까지 출력이 안되는 원인
//public class EX_Prg {
//	public static void main(String[] arg) {
//		int i;
//		for(i=1; i<10; i++);
//			System.out.printf("%d ",i);			
//}
//}	
//for문뒤에 세미콜론이 오기때문에 루프가 실행되는 동안 루프내무에서는 아무런 동작이 되지 않는다
//세미콜론을 제거하고 중괄호를 추가해야 한다
//문제4 구구단을 작성해 봅시다
//public class EX_Prg {
//	public static void main(String[] arg) {
//		for(int i=1;i<=9;i++) {
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//	}
//}
//문제 5 키보드에서 단을 입력받아 해당되는 구구단 출력
//public class EX_Prg {
//	public static void main(String[] arg) {
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("몇단을 출력할까요:");
//		int d = sc.nextInt();
//		if(d>=2) {
//			for(int i=1;i<=9;i++) {
//				System.out.println(d+"*"+i+"="+d*i);
//			}
//		}
//	}
//}
//6번 문제
//public class EX_Prg {
//    public static void main(String[] arg) {
//        int d = 0; 
//        for(int i = 1; i <= 10; i++) {
//            System.out.printf("%d", i); 
//            d += i; 
//            if (i < 10) {
//                System.out.print("+"); 
//            } else {
//                System.out.print("=" + d); 
//            }
//        }
//    }
//}
//문제7
//public class EX_Prg {
//    public static void main(String[] arg) {
//        int d = 1; 
//        System.out.printf("4!=");
//        for(int i = 4; i >= 1; i--) {
//            System.out.printf("%d", i); 
//            d *= i; 
//            if (i >1) {
//                System.out.print("*"); 
//            } else {
//                System.out.print("=" + d); 
//            }
//        }
//    }
//}
//문제 8
//public class EX_Prg {
//	public static void main(String[] arg) {
//		char M;
//		for( M='z'; M >='a'; M--) {
//			System.out.printf("%c",M);
//
//		}
//		System.out.println();
//		for( M='A'; M<='Z'; M++) {
//			System.out.printf("%c",M);
//		}
//		System.out.println();
//		int S = 122;
//		for( int N=97; N<=122; N++) {
//			System.out.printf("%c",N);			
//			if (N<=122) {
//				System.out.printf("%C",S);
//				S--;
//			}
//		} 
//	}
//}
//문제 9
//public class EX_Prg {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        int sum = 0;          
//	        System.out.print("입력할 숫자의 개수는?: ");
//	        int count = scanner.nextInt();      
//	        for (int i = 0; i < count; i++) {
//	            int num = scanner.nextInt();
//	            sum += num;
//	        } 
//	        System.out.println("합=" + sum);
//    
//	    }
//}
//문제10.
//public class EX_Prg {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);                  
//        System.out.print("막대#의 높이: ");
//        int count = scanner.nextInt();      
//        for (int i = 0; i < count; i++) {
//            System.out.printf("#");
//        } 
//    }
//}
//문제11
//public class EX_Prg {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);         
//		System.out.print("숫자를 입력하세요:");
//		int num = scanner.nextInt();       
//		System.out.println("1부터"+num+"사이에 존재하는 3의 배수는"+num/3+"개입니다");
//
//	}
//}
//문제12
//public class EX_Prg {
//public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);         
//	System.out.print("숫자를 입력하세요:");
//	int num = scanner.nextInt();       
//	System.out.printf(num+"의 약수는 ");
//	for (int i = 1; i <= num; i++) {
//        if (num % i == 0) {
//            System.out.print( i + " ");
//        }
//    }
//	System.out.printf("입니다");
//}
//}
//문제13
//public class EX_Prg {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);        
//		System.out.print("수1: ");
//		int num1 = scanner.nextInt();        
//		System.out.print("수2: ");
//		int num2 = scanner.nextInt();        
//		int max = 0;  
//		int smaller;        
//		if (num1 < num2) {
//			smaller = num1;
//		} else {
//			smaller = num2;
//		}        
//		for (int i = 1; i <= smaller; i++) {
//			if (num1 % i == 0 && num2 % i == 0) {
//				max = i;  
//			}
//		}                
//		System.out.println(num1 + "과 " + num2 + "의 최대공약수는 " + max + "입니다.");
//
//	}
//}
//문제14
//public class EX_Prg {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);        
//		System.out.print("수1: ");
//		int num1 = scanner.nextInt();        
//		System.out.print("수2: ");
//		int num2 = scanner.nextInt();        
//		int bigger, smaller, min;
//
//		if (num1 > num2) {
//			bigger = num1;
//			smaller = num2;
//		} else {
//			bigger = num2;
//			smaller = num1;
//		}
//
//		for (int i = 1;; i++) {
//			min = bigger * i;
//			if (min % smaller == 0) {
//				break;
//			}
//		}
//
//		System.out.println(num1 + "과 " + num2 + "의 최소공배수는 " + min + "입니다.");
//	}
//}
//문제15
//public class EX_Prg {
//	public static void main(String[] args) {
//		int result = 100;
//		for(int i=0;i<=100;i++) {
//				result -= i;
//			if(result<0) {
//				System.out.println(result);
//				System.out.println(i);
//				break;
//			}
//		}
//	}
//}
//문제16
//public class EX_Prg{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("수를 입력하세요:");
//		int num = sc.nextInt();
//		if(num==1) {
//			System.out.println(num+"은 소수가 아님");
//		}
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				if(i==1) {
//					continue;										
//				}
//				if(i==num) {
//					System.out.println(num+"은 소수");
//				break;
//				}
//				if(i>1) {
//					System.out.println(num+"은 소수가 아님");
//					break;
//				}
//			}
//		}
//	}
//}
//문제17
//public class EX_Prg{
//	public static void main(String[] args) {
//		int j=0;
//		int i;
//		int h=0;
//		for(i=2; j<10; i+=6) {
//			h+=i;
//			System.out.printf(i+"+");
//			j++;
//		}
//		System.out.println();
//		System.out.println("합="+h);
//	}
//}
//문제 18
//public class EX_Prg{
//	public static void main(String[] args) {
//		int j=0;
//		int i=2;
//		int h=3;
//		int k=2;
//		System.out.printf(i+" ");
//		for(; j<9;) {
//			i=i*h;
//			k+=i;
//		System.out.print(i+" ");
//			j++;			
//		}
//		System.out.println("합="+k);
//	}
//}
//문제 19
