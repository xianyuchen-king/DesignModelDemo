package chenyqx.design.struct.example.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("-----------------------");
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();

    }
}
