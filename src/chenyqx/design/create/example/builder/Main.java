package chenyqx.design.create.example.builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ChenBuilder();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        Product product = builder.getProduct();
        product.show();
    }
}
