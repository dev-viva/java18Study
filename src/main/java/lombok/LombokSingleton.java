package lombok;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LombokSingleton {

    private static volatile LombokSingleton lombokSingletonInstance;

    private static Object mutex = new Object();

    public static LombokSingleton getInstance() {
        LombokSingleton threadSafeInstance = lombokSingletonInstance;
        if (threadSafeInstance == null) {
            synchronized (mutex) {
                threadSafeInstance = lombokSingletonInstance;
                if (threadSafeInstance == null) {
                    lombokSingletonInstance = threadSafeInstance = new LombokSingleton();
                }

            }
        }
        return lombokSingletonInstance;
    }
}
