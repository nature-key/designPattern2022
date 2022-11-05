package 策略模式;

public class IntermediateMemberStrategy implements Strategy {

    @Override
    public double price(double price, int n) {
        return price*n*(1-0.2);
    }
}
