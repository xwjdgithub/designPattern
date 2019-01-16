package actionPattern.iteratorPattern;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private int size;//存放元素的个数，默认为0
    private Object[] defaultList;//使用数组存放元素
    private static final int defaultLength = 10;//默认长度

    //构造函数
    public MyArrayList(){
        defaultList = new Object[defaultLength];
    }

    //用内部类的方式实现具体的迭代器
    private class Iterator<T> implements MyIterator<T>{
        private int next;//下一个要遍历的位置

        public boolean hasNext(){
            return next < size;
        }

        public T next(){
            return (T)defaultList[next++];
        }
    }

    //返回迭代器
    public MyIterator<T> iterator(){
        return new Iterator();
    }

    //判断数组的长度是否足够，不够大小自动增长
    private void ensureCapacity(int capacity){
        int nowLength = defaultList.length;//数组的长度，最开始为10
        if(capacity >= nowLength){
            nowLength = nowLength + (nowLength>>1);//新的数组长度=原来长度*1.5
            if(nowLength < 0){//溢出
                nowLength = Integer.MAX_VALUE;
                defaultList = Arrays.copyOf(defaultList, nowLength);//通过copyOf函数对数组进行扩容
            }
        }
    }

    //添加元素到队列末尾
    public boolean add(T t){
        ensureCapacity(size + 1);
        defaultList[size++] = t;
        return true;
    }

    //获取指定位置的元素
   public T get(int index){
        if (index < 0 || index >= size){
            return null;
        }
        return (T)defaultList[index];
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
        T element = (T)defaultList[index];
        if(index != size-1){//删除的不是末尾的元素，则需要挪动数组元素，保证数组元素的连续性（数组中间不能出现空位）
            System.arraycopy(defaultList, index+1, defaultList, index, size-index-1);
        }
        size--;
        return element;
    }

    //删除指定元素
    public boolean remove(T t){
        if(null != t){
            for(int i=0; i<size; i++){
                if(defaultList[i].equals(t)){
                    System.arraycopy(defaultList, i+1, defaultList, i, size-i-1);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    //修改指定位置的值
    public boolean set(int index, T t){
        if(index < 0 || index >=size){
            return false;
        }
        defaultList[index] = t;
        return true;
    }

    //返回当前列表中元素的个数
    public int size(){
        return size;
    }

}
