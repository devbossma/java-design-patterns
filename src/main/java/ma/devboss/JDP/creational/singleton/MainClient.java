package ma.devboss.JDP.creational.singleton;

import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {
        SingletonClass1 sc1_1 = SingletonClass1.getInstance();
        SingletonClass1 sc1_2 = SingletonClass1.getInstance();
        SingletonClass1 sc1_3 = SingletonClass1.getInstance();
        SingletonClass2 sc2_1 = SingletonClass2.getInstance();
        SingletonClass2 sc2_2 = SingletonClass2.getInstance();
        SingletonClass2 sc2_3 = SingletonClass2.getInstance();
        System.out.println(sc1_1.equals(sc1_2)); // True
        System.out.println(sc2_1.equals(sc2_2) || sc2_2.equals(sc2_3) || sc2_1.equals(sc2_3)); // True

        //Safety multi-Threaded processes
        SingletonClass1 sc1_4 = SingletonClass1.getInstance();
        for (int i = 0; i < 4; i++) {
            new Thread(sc1_4::increment).start();
        }
        System.in.read();

        sc1_4.getcount();
        Singleton.getInstance().doSomething();

    }
}
