package chenyqx.design.create.example.prototype;

public class Realizetype implements Cloneable{
    /**
    浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
    深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
     Java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆
     */
    Realizetype(){
        System.out.println("原型创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("原型clone成功");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype re1 = new Realizetype();
        Realizetype re2 = (Realizetype) re1.clone();
        System.out.println("re1 == re2 ?"+ (re1 == re2));
    }
}
