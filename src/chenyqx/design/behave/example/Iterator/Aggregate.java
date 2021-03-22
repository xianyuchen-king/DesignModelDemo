package chenyqx.design.behave.example.Iterator;




/**
 * 抽象聚合对象
 */
interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public Iterator getIterator();

}
