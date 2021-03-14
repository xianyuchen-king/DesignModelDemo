package chenyqx.design.struct.example.proxy;

public class ProxySubject implements Subject{
    private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preHandle();
        realSubject.Request();
        afterHandle();
    }

    private void preHandle(){
        System.out.println("访问方法前的预处理.......");
    }

    private void afterHandle(){
        System.out.println("访问方法后的后续处理........");
    }
}
