package lala;

public class SingleModeDoubleCheck {

    private volatile static  SingleModeDoubleCheck instance=null;

    private SingleModeDoubleCheck(){};

    public static SingleModeDoubleCheck getInstance(){
        if(instance==null){
            synchronized (SingleModeDoubleCheck.class){
                if(instance==null){
                    instance=new SingleModeDoubleCheck();
                }
            }
        }
        return  instance;
    }

}
