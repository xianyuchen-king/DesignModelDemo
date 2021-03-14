package chenyqx.design.struct.example.adapter;

/**
 * 类适配器，通过继承被适配对象实现
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
