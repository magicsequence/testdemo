package lala;

/**
 * 懒汉模式中的双重验证模式
 */
public class Singleton {
    private static volatile Singleton instance=null;
    private Singleton(){};

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return  instance;
    }
}
