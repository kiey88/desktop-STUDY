package coffeeshop;

public class Barista {
	String name;
	int salary;
	int coffeeTotalNum;
	
	public Barista(String name) {
		this.name = name;
	}
	public void makeCoffee(OrderSheet order) {
		if(order.isCompleted == true) {
			return;
		}
		order.isCompleted = true;
		coffeeTotalNum += order.coffeeNum;
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
		System.out.println("***바리스타"+name+"이 만든 총 커피의 잔 수는"+coffeeTotalNum+"입니다");
	}
	
}
