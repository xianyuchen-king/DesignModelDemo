package chenyqx.design.struct.example.facade;

/**
 * 外观（Facade）模式的结构比较简单，主要是定义了一个高层接口。它包含了对各个子系统的引用，客户端可以通过它访问各个子系统的功能。现在来分析其基本结构和实现方法。
 */
public class Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
    //子系统角色
    class SubSystem01 {
        public void method1() {
            System.out.println("子系统01的method1()被调用！");
        }
    }
    //子系统角色
    class SubSystem02 {
        public void method2() {
            System.out.println("子系统02的method2()被调用！");
        }
    }
    //子系统角色
    class SubSystem03 {
        public void method3() {
            System.out.println("子系统03的method3()被调用！");
        }
    }
}
