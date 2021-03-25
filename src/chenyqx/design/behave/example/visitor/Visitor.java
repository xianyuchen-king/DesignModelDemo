package chenyqx.design.behave.example.visitor;

public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
