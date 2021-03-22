package chenyqx.design.behave.example.state;

/**
 * 环境类，持有状态对象，状态的不同产生不同的行为
 */
public class Context {

    private State state;

    //定义环境类的初始状态
    public Context() {
        this.state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void Handle(){
        state.Handle(this);
    }
}
