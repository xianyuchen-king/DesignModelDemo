package chenyqx.design.struct.example.proxy;

/**
 * 由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 */
public class RealSubject implements Subject{
    @Override
    public void Request() {
        System.out.println("访问真实方法.......");
    }
}
