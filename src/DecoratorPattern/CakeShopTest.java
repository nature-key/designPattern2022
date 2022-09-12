package DecoratorPattern;

public class CakeShopTest {

    public static void main(String[] args) {


        CakeShopImp cakeShopImp = new CakeShopImp();
        ChocolateCakeShop chocolateCakeShop = new ChocolateCakeShop();

        chocolateCakeShop.setCakeShopAbstract(cakeShopImp);

        System.out.println(chocolateCakeShop.make());


    }
}
