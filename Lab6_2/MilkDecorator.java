public class MilkDecorator extends Decorator{
    private int milk;
    
    
    public MilkDecorator(Beverage b, int amount){
        super(b);
        this.milk = amount;
    }

    @Override
    public int getCost() {
        return super.getCost() + (milk * 3);
    }

    @Override
    public String getDescription() {
        String str = "";
        for(int i = 0; i < milk; i++){
            str += "milk ";
        }
        return super.getDescription() + str;
    }
}