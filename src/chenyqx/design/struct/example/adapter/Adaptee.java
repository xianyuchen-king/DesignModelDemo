package chenyqx.design.struct.example.adapter;

/**
 * 被适配对象
 */
public class Adaptee {
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}
