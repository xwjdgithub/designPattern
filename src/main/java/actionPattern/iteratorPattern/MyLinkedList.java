package actionPattern.iteratorPattern;

public class MyLinkedList<T> implements MyList<T> {
    private int size;//存放元素的个数，默认为0
    private Node<T> frist;//首节点，默认初始化为null

    //用内部类来定义链表节点
    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }

    //用内部类的方式实现具体的迭代器
    private static class Iterator<T> implements MyIterator<T>{
        private Node<T> next;//下一个要遍历的节点

        public Iterator(){
            next = frist;
        }
        public boolean hasNext(){
            return next != null;
        }

        public T next(){
            T data = next.data;
            next = next.next;
            return data;
        }
    }

    //返回迭代器
    public MyIterator<T> iterator(){
        return new Iterator();
    }

    //添加元素到队列末尾
    public boolean add(T t){
       if(size == 0){
           frist = new Node<T>(t, null);
           size++;
           return true;
       }else{
           Node<T> node = frist;
           while (node.next != null){
               node = node.next;
           }
           node.next = new Node<T>(t, null);
           size++;
           return true;
       }
    }

    //获取指定位置的元素
    public T get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node<T> node = frist;
        while(--index>=0){
            node = node.next;
        }
        return node.data;
    }

    //删除最后一个元素
    public T remove(){
        return remove(size-1);
    }

    //删除指定位置的元素
    public T remove(int index){
        if (index < 0 || index >= size){
            return null;
        }
        Node<T> node = frist;
        while (--index > 0){
            node = node.next;
        }
        T element = node.next.data;
        node.next = node.next.next;
        size--;
        return element;
    }

    //删除指定元素
    public boolean remove(T t){
        if((null == t && null == frist.data)
                ||(t != null && t.equals(frist.data))){
            frist = frist.next;
            size--;
            return true;
        }
        Node<T> node = frist;
        while (node.next != null){
            Node<T> next = node.next;
            if((t == null && next.data == null)
                ||(t != null && t.equals(next.data))){
                node = node.next.next;
                size--;
                return true;
            }
        }
        return false;
    }

    //修改指定位置的值
    public boolean set(int index, T t){
        if (index < 0 || index >= size){
            return false;
        }
        Node<T> node = frist;
        while (--index > 0){
            node = node.next;
        }
        node.data = t;
        return true;
    }

    //返回当前列表中元素的个数
    public int size(){
        return size;
    }
}
