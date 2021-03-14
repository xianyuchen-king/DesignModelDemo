package chenyqx.design.create.example.builder;

public class ChenBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("chen part A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("chen part B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("chen part C");
    }
}
