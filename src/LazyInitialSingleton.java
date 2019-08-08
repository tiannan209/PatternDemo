public class LazyInitialSingleton {
    private static LazyInitialSingleton instance = null;

    private LazyInitialSingleton(){}

    public static LazyInitialSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitialSingleton();
        }
        return instance;
    }
}
