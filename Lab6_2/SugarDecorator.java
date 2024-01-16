public class SugarDecorator extends Decorator{
    private int sugar;

    public SugarDecorator(Beverage b, int amount) {
        super(b);
        this.sugar = amount;
    }
    
    @Override
    public int getCost() {
        return super.getCost() + (sugar);
    }
    public String getDescription() {
        String str = "";
        for(int i = 0; i < sugar; i++){
            str += "sugar ";
        }
        return super.getDescription() + str;
    }
}
