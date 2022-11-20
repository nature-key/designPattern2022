package 工厂模式;

public class ShapeFactory {


    public static Shape getShape(String type) {
        if ("C".equals(type)) {
            return new Circle();
        } else if ("S".equals(type)) {
            return new Square();
        } else if ("R".equals(type)) {
            return new Rectangle();
        }
        return null;
    }


}
