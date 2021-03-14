package chenyqx.design.create.example.factory;

public class FactoryDemo {

    interface Product{
        public void show();
    }

    static class ProductA implements Product{

        @Override
        public void show() {
            System.out.println("Product A");
        }
    }

    static class ProductB implements Product{
        @Override
        public void show() {
            System.out.println("Product B");
        }
    }

    interface ProductFactory{
        Product createProduct();
    }

    class ProductAFactory implements ProductFactory{

        @Override
        public Product createProduct() {
            return new ProductA();
        }
    }

    class ProductBFactory implements ProductFactory{

        @Override
        public Product createProduct() {
            return new ProductB();
        }
    }

}
