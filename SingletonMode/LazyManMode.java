package SingletonMode;

/**
 * @author Damon
 * @date 2022年04月11日 15:00
 */
public class LazyManMode {
    /**
     * 懒汉式
     * <p>
     * 优点：判断是否有实例已经被创建，如果没有才会创建，不会想饿汉模式一样直接创建，不浪费内存
     * 缺点：非线程安全，多线程环境时如果不加锁的话，会出现创建多个实例的情况，不符合单例模式
     * 改进：加锁
     */
    private static LazyManMode instance;

    private LazyManMode() {
    }

    public static LazyManMode getInstance() {
        if (instance == null) {
            instance = new LazyManMode();
        }
        return instance;
    }

}
