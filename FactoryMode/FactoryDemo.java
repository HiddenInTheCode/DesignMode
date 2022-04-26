package FactoryMode;

/**
 * 验证 通过工厂类 获取对应的对象
 *
 * @author Damon
 * @date 2022年04月26日 16:24
 */
public class FactoryDemo {
    public static void main(String[] args) {
        // 获取创建工厂类
        ShapeFactory factory = new ShapeFactory();
        // 通过工厂类创建对应的对象
        Shape shapeCircle = factory.getShape("Circle");
        shapeCircle.draw();
        Shape shapeRectangle = factory.getShape("Rectangle");
        shapeRectangle.draw();
        Shape shapeSquare = factory.getShape("Square");
        shapeSquare.draw();
    }
}
