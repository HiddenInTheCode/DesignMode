package StrategyMode;

/**
 * @description 验证
 *
 * @author Damon
 * @date 2022年04月21日 10:37
 */
public class StrategyDemo {
    public static void main(String[] args) {
        // 加法策略
        Context context = new Context(new StrategyAdd());
        System.out.println("Strategy Add: " + context.executeOperation(1, 2));
        // 减法策略
        context = new Context(new StrategySubtract());
        System.out.println("Strategy Subtract: " + context.executeOperation(1, 2));
        // 乘法策略
        context = new Context(new StrategyMultiply());
        System.out.println("Strategy Multiply: " + context.executeOperation(1, 2));
        // 除法策略
        context = new Context(new StrategyDivide());
        System.out.println("Strategy Divide: " + context.executeOperation(1, 2));
    }
}
