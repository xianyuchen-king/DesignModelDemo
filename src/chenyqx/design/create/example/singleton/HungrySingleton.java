package chenyqx.design.create.example.singleton;

public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public HungrySingleton getInstance(){
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
