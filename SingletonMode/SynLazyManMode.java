package SingletonMode;

/**
 * @author Damon
 * @date 2022年04月11日 15:11
 */
public class SynLazyManMode {
    /**
     * 懒汉模式加锁，实现线程安全
     */
    private static SynLazyManMode instance;

    private SynLazyManMode() {
    }

    public static SynLazyManMode getInstance() {
        if (instance == null) {
            synchronized (SynLazyManMode.class) {
                if (instance == null) {
                    instance = new SynLazyManMode();
                }
            }
        }
        return instance;
    }
}
