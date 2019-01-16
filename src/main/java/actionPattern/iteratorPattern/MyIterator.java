package actionPattern.iteratorPattern;

public interface MyIterator<T> {
    boolean hasNext();//是否还有下一个元素
    T next();//获取下一个元素
}
