public class InnerClassSingleton {
    private InnerClassSingleton(){}

    private static class BillPughSingleton{
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return BillPughSingleton.instance;
    }
}
