package 工厂模式;

public class FactoryDemo {


    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("C");

        System.out.println(shape.makeShape());


    }
}
