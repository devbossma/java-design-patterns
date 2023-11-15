package ma.devboss.JDP.creational.singleton;

public class SingletonClass1 {
    private static SingletonClass1 singletonClass1;
    private SingletonClass1(){}
    public static SingletonClass1 getInstance() {
        if(singletonClass1==null){
        System.out.println("SingletonClass1.getInstance");
            singletonClass1 = new SingletonClass1();
        }
        return singletonClass1;
    }
}
