package ma.devboss.JDP.creational.singleton;

public class SingletonClass1 {
    private Integer count = 0;
    private static SingletonClass1 singletonClass1;
    private SingletonClass1(){}

    public void increment() {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                ++count; // critical zone for multi_threaded processes
                System.out.println(Thread.currentThread().getName());
                System.out.println("current count is: " + count);
            }
        }
    }
    /**
     *  public synchronized void increment() {
     *       for (int i = 0; i < 10; i++) {
     *       ++count; // critical zone for multi_threaded processes
     *       System.out.println(Thread.currentThread().getName());
     *       System.out.println("current count is: " + count)
     *      }
     *  }
     *  /// But this way don't let your code have THE BENEFITS OF the multi_threaded features////
     */
    public void getcount(){
        System.out.println("final count is: "+this.count);
    }
    public static SingletonClass1 getInstance() {
        if(singletonClass1==null){
        System.out.println("SingletonClass1.getInstance");
            singletonClass1 = new SingletonClass1();
        }
        return singletonClass1;
    }
}
