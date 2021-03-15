package lala;

/**
 * 懒汉模式：要考虑线程安全，而且为此多写了几行代码。
 * 饿汉模式：在JVM加载机制下，不用考虑线程安全，但会产生很多无用的实例，浪费内资源。
 *
 * 我们期望的是：既能享受懒汉的延迟加载，又能享受饿汉的线程安全。
 * 此时，静态内部类应运而生。
 *
 * 静态内部类：java静态内部类的特性是，类加载的时候不会被加载，而是使用的时候才会被加载，
 * 在使用的时候正好利用了JVM的加载机制，既实现了线程安全又不会产生过多的无用实例。
 */
public class Singleton4 {
    private Singleton4(){}

    private static class SingletonHolder{
        private static Singleton4 instance =new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.instance;
    }
}
