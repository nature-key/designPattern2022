package 装饰者模式;

public class ChocolateCakeShop extends CakeShopAbstract {


    @Override
    public String make() {
        return "巧克力" + super.make();
    }
}
