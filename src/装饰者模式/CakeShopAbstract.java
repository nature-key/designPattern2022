package 装饰者模式;

/**
 * 装饰者抽象类
 */
public class CakeShopAbstract extends CakeShop {

    private CakeShop cakeShop;

    public CakeShopAbstract() {
    }

    public void setCakeShopAbstract(CakeShop cakeShop) {
        this.cakeShop = cakeShop;
    }

    @Override
    public String make() {
        return cakeShop.make();
    }
}
