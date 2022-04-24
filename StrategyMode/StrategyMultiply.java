package StrategyMode;

/**
 * @description 乘法
 *
 * @author Damom
 * @date 2022年04月20日 14:26
 */
public class StrategyMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
