package 策略模式;

public class PrimaryMemberStrategy implements Strategy {

    @Override
    public double price(double price, int n) {
        return price*n;
    }
}
