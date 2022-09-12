package DecoratorPattern;

/**
 * 组件具体的实现类
 */
public class CakeShopImp extends CakeShop {

    @Override
    public String make() {
        System.out.println("制作蛋糕");
        return "制作蛋糕";
    }
}
