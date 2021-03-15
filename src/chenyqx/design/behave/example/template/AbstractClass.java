package chenyqx.design.behave.example.template;

public abstract class AbstractClass {
    //模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void SpecificMethod(){
        System.out.println("抽象类中的具体方法被调用...");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
