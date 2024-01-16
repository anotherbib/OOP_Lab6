public class Decorator implements Beverage{
    private Beverage beverage;

    public Decorator(Beverage b){
        this.beverage = b;
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }
    public String getDescription() {
        return beverage.getDescription();
    }
    
}
