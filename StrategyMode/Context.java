package StrategyMode;

/**
 * @description 策略执行
 *
 * @author Damon
 * @date 2022年04月21日 10:32
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
