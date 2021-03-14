package chenyqx.design.struct.example.bridge;

/**
 * 分离抽象和具象，抽象部分通过持有抽象对象实现
 */
public abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}
