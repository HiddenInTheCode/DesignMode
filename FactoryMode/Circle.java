package FactoryMode;

/**
 * @author Damon
 * @date 2022年04月26日 14:21
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw a circle!");
    }
}
