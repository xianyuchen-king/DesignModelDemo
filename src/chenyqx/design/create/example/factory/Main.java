package chenyqx.design.create.example.factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new AbstractFactoryImpl();
        FactoryDemo.ProductA productA = factory.getProductA();
        FactoryDemo.ProductB productB= factory.getproductB();
        AbstractFactory factory2 = new AbstractFactoryImpl2();
        FactoryDemo.ProductA productA2 = factory2.getProductA();
        FactoryDemo.ProductB productB2= factory2.getproductB();
    }
}
