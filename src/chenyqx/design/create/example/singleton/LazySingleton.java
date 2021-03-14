package chenyqx.design.create.example.singleton;

public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton(){}

    public static synchronized LazySingleton getIntance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getIntance();
        LazySingleton singleton2 = LazySingleton.getIntance();

        if(singleton1 == singleton2){
            System.out.println("同一个实例");
        }
    }
}
