package Main;

public class Context {
    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public double executePriceStrategy(int amount){
        return strategy.calculatePrice(amount);
    }
    public double executeTaxStrategy(int amount, boolean isImported){
        return strategy.calculateTax(amount, isImported);
    }
}
