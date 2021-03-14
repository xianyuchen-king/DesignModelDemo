package chenyqx.design.create.example.factory;

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(Const.PRODUCT_A);
        product.show();
    }

    public interface Product{
        public void show();
    }

    public static class Product1 implements Product{

        @Override
        public void show() {
            System.out.println("1-product");
        }
    }

    public static class Product2 implements Product{

        @Override
        public void show() {
            System.out.println("2-product");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory{
        public static Product makeProduct(int kind){
            switch (kind){
                case Const.PRODUCT_A : return new Product1();

                case Const.PRODUCT_B: return new Product2();

                default: return null;
            }
        }
    }
}
