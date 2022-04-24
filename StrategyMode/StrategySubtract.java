package StrategyMode;

/**
 * @description 减法
 *
 * @author Damon
 * @date 2022年04月20日 14:24
 */
public class StrategySubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
