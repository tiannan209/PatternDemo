public class SynchronizedSingleton {
    private static SynchronizedSingleton instance = null;

    private SynchronizedSingleton(){}

    public synchronized static SynchronizedSingleton getInstance(){
        if(instance == null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
