package chenyqx.design.struct.example.adapter;

/**
 * 对象适配器，通过持有被适配对象实现
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    @Override
    public void request() {
        if(adaptee == null){
            adaptee = new Adaptee();
        }
        adaptee.specificRequest();
    }
}
