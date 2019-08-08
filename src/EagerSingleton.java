public class EagerSingleton {
    //when first loaded into memory, create the instance
    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
