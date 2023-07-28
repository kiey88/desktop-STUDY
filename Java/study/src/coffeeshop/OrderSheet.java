package coffeeshop;

public class OrderSheet {

	static int serialNum = 100;
	int orderNum;
	int coffeeNum;
	boolean isCompleted;

	public OrderSheet(int coffeeNum) {
		
		this.coffeeNum = coffeeNum;
		serialNum++;
		orderNum = serialNum;
		isCompleted = false;
	}
	
	public void showInfo() {
		System.out.println
		(
         "주문서번호는"+orderNum+"이고, 커피수는"+coffeeNum+ "이며 완료여부는"+isCompleted+"입니다."
		);
	}




}
