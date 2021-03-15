package testmodel;

import lala.Singleton;

public class TestModel {
    public static void main(String[] args) {


        Singleton instace=Singleton.getInstance();
        System.out.println(instace.toString());
    }
}
