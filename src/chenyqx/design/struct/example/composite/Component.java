package chenyqx.design.struct.example.composite;

/**
 * 抽象构件，为树枝构件和树叶构件提供公共接口
 * *
 */
public interface Component {
    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int i);

    public void operation();
}
