package StrategyMode;

/**
 * @description 加法
 *
 * @author Damon
 * @date 2022年04月20日 14:23
 */
public class StrategyAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
