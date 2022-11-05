package 策略模式;

public class Content {

    private Strategy strategy;

    public Content(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price, int n) {
        return strategy.price(price, n);
    }

}
