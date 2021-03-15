package lala;

/**
 * 懒汉模式的第一种模式：其特点是锁住了整个getInstance方法，获得锁释放锁等待时间长，
 * 执行效率低下。
 * 而双重验证模式只是锁住了部分代码，效率明显会提高很多。
 */
public class Singleton3 {
    private static Singleton3 instance =null;

    private Singleton3(){}

    public static synchronized Singleton3  getInstance(){
        if(instance==null){
            instance=new Singleton3();
        }
        return instance;
    }
}
