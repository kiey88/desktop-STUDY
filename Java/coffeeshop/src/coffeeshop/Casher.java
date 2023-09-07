package coffeeshop;

public class Casher {
	String name;
	int salary;
	int orderTotalNum;
	
	public Casher(String name){
		this.name = name;
	}
	//객체 함수 OrderSheet(타입이 객체형) makeOrderSheet(함수) 생성
	public OrderSheet makeOrderSheet(int coffeeNum){
		OrderSheet order = new OrderSheet(coffeeNum); 
		orderTotalNum++;
		return order;
	}
//	public class OrderSheet {
//
//		static int serialNum = 100;
//		int orderNum;
//		int coffeeNum;
//		boolean isCompleted;
//
//		public OrderSheet(int coffeeNum) {
//			
//			this.coffeeNum = coffeeNum;
//			serialNum++;
//			orderNum = serialNum;
//			isCompleted = false;
//		}
//		
//		public void showInfo() {
//			System.out.println
//			(
//	         "주문서번호는"+orderNum+"이고, 커피수는"+coffeeNum+ "이며 완료여부는"+isCompleted+"입니다."
//			);
//		}

	public void showInfo() {
		System.out.println("&&& 캐셔"+name+"이 처리한 총 주문서의 개수는"+orderTotalNum+"입니다.");
	}
}
