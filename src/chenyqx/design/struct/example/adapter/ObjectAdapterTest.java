package chenyqx.design.struct.example.adapter;

public class ObjectAdapterTest {
    public static void main(String[] args)
    {
        System.out.println("对象适配器模式测试：");
        Target target = new ObjectAdapter();
        target.request();
    }
}
