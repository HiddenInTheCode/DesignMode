package StrategyMode;

/**
 * @description 除法
 *
 * @author Damon
 * @date 2022年04月20日 14:26
 */
public class StrategyDivide implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
}
