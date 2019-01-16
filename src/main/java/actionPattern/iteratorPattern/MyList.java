package actionPattern.iteratorPattern;

public interface MyList<T> {
    MyIterator<T> iterator();//返回一个迭代器
    boolean add(T t);//添加元素到列表
    T get(int index);//获取指定位置的元素
    T remove();//删除最后一个元素
    T remove(int index);//删除指定位置的元素
    boolean remove(T t);//删除指定元素
    boolean set(int index, T t);//修改指定位置的值
    int size();//返回当前列表中元素的个数

}
