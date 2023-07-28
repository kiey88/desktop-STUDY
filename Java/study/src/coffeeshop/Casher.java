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
		OrderSheet order = new OrderSheet(coffeeNum); // Ordersheet클래스의 생성자
		orderTotalNum++;
		return order;
	}
	
	public void showInfo() {
		System.out.println("&&& 캐셔"+name+"이 처리한 총 주문서의 개수는"+orderTotalNum+"입니다.");
	}
}
