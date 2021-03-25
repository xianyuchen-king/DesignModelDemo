package chenyqx.design.behave.example.Iterator;


//迭代器模式目的是在不暴露聚合对象的内部结构的情况下，让外部代码透明地访问聚合的内部数据。

/**
 * 抽象聚合对象
 */
interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public Iterator getIterator();

}
