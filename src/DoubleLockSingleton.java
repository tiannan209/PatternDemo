public class DoubleLockSingleton {
    private static DoubleLockSingleton instance = null;

    private DoubleLockSingleton(){}

    public static DoubleLockSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleLockSingleton.class){
                if(instance == null){
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
