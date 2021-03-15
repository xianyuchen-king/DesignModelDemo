package chenyqx.design.behave.example.strategy;

/**
 * 策略模式，将算法封装到一组策略类中，通过策略类对象组织算法
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        strategy.strategyMethod();
        System.out.println("-----------------");
        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.strategyMethod();
    }
}
