package chenyqx.design.behave.example.mediator;

/**
 * 抽象中介者
 * 中介者模式，定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。中介者模式又叫调停模式，它是迪米特法则的典型应用。
 * 实现对象间的解耦，将网状结构转化为星型结构
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转
}
