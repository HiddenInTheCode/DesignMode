package SingletonMode;

/**
 * @author Damon
 * @date 2022年04月11日 11:53
 */
public class HungryManMode {
    /**
     * 饿汉模式
     * <p>
     * 优点：线程安全，基于ClassLoader机制（JVM的加载，会保证只加载一次，不会产生并发），避免了多线程的同步问题;
     * 不加锁，执行效率高;
     * 缺点：类加载的时候就创建，浪费内存
     */
    private static HungryManMode instance = new HungryManMode();

    private HungryManMode() {
    }

    public static HungryManMode getInstance() {
        return instance;
    }
}
