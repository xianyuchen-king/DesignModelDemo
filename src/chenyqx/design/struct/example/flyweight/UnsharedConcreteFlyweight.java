package chenyqx.design.struct.example.flyweight;

//无法共享的对象信息
public class UnsharedConcreteFlyweight {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
}
