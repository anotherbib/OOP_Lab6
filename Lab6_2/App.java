
public class App {
	public static void main(String[] args) {
		//Beverage plainBeverage = new PlainBeverage();
		//System.out.println("You order " + plainBeverage.getDescription());
		//System.out.println("The cost is " + plainBeverage.getCost());

		Beverage beverage = new SugarDecorator(new MilkDecorator(new PlainBeverage(), 1), 2);
		System.out.println("You order " + beverage.getDescription());
		System.out.println("The cost is " + beverage.getCost());
	}
}
