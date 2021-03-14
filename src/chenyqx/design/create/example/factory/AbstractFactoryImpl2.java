package chenyqx.design.create.example.factory;

public class AbstractFactoryImpl2 implements AbstractFactory{
    @Override
    public FactoryDemo.ProductA getProductA() {
        System.out.println("apple product");
        return new FactoryDemo.ProductA();
    }

    @Override
    public FactoryDemo.ProductB getproductB() {
        System.out.println("apple product");
        return new FactoryDemo.ProductB();
    }
}
