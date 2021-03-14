package chenyqx.design.struct.example.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.Request();
    }
}
