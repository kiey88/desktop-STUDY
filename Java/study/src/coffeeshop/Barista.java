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
	
	public void showInfo() {
		System.out.println("***바리스타"+name+"이 만든 총 커피의 잔 수는"+coffeeTotalNum+"입니다");
	}
	
}
