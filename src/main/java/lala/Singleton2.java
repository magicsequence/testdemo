package lala;

/**
 * 饿汉模式：类在JVM加载的时候就实例化。而JVM的类加载机制有一个显著的特点就是单线程加载，
 * 所以只会new一次也就是说heap里面只会有一个对象实例（被static修饰的instance是不允许new对象的）；
 *
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return instance;
    }
}
