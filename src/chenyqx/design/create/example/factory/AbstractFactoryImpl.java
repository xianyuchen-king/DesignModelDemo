package chenyqx.design.create.example.factory;

public class AbstractFactoryImpl implements AbstractFactory{
    /**
     *抽象工厂应用一系列相关的产品族
     */
    @Override
    public FactoryDemo.ProductA getProductA() {
        System.out.println("lenveo product");
        return new FactoryDemo.ProductA();
    }

    @Override
    public FactoryDemo.ProductB getproductB() {
        System.out.println("lenveo product");
        return new FactoryDemo.ProductB();
    }
}
