package array;

import java.util.Objects;

public class Array<E> {
    private E[] data;
    //当前数组中有多少元素
    private int size;

    //无参构造函数
    public Array() {
        this(10);
    }

    //构造函数，设置初始值，capacity容量
    public Array(int capacity) {
        data = (E[]) new Objects[capacity];
        size = 0;
    }

    /**
     * @param
     * @return 获取数组中的元素个数
     * @author RunLin
     * @description
     * @date 2020/8/31 10:35 上午
     */
    public int getSize() {
        return size;
    }

    /**
     * @param
     * @return 获取数组中的容量大小
     * @author RunLin
     * @description
     * @date 2020/8/31 10:36 上午
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * @param
     * @return 返回数组是否为空
     * @author RunLin
     * @description
     * @date 2020/8/31 10:36 上午
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * @param
     * @return 向数组中添加元素
     * @author RunLin
     * @description
     * @date 2020/8/31 10:45 上午
     */
    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * @param
     * @return 向数组中的任意一个位置添加元素
     * @author RunLin
     * @description
     * @date 2020/8/31 10:53 上午
     */
    public void add(int index, E e) {
        if (size == data.length) {
            throw new IllegalArgumentException("向数组中添加元素失败，数组已经满了");
        }
        if (index > size || index < 0) {
            throw new IllegalArgumentException("向数组中添加元素失败，index > size or index < 0");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }


    /**
     * @param
     * @return 获取index位置的元素
     * @author RunLin
     * @description
     * @date 2020/8/31 11:14 上午
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("查询数组中元素失败，index > size or index < 0");
        }
        return data[index];
    }

    /**
     * @param
     * @return 设置数组中的某一个元素
     * @author RunLin
     * @description
     * @date 2020/8/31 3:58 下午
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("设置数组中元素失败，index > size or index < 0");
        }
        data[index] = e;
    }

    /**
     * @param
     * @return 查找数组中是否包含某个元素
     * @author RunLin
     * @description
     * @date 2020/8/31 4:01 下午
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param
     * @return 查询数组中某个元素的位置，并且返回索引，没有的话返回 -1
     * @author RunLin
     * @description
     * @date 2020/8/31 4:03 下午
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param
     * @return 删除数组中某个元素
     * @author RunLin
     * @description
     * @date 2020/8/31 4:13 下午
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("删除数组中元素失败，index > size or index < 0");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        return ret;
    }

    /**
     * @param
     * @return 删除第一个元素
     * @author RunLin
     * @description
     * @date 2020/8/31 4:13 下午
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * @param
     * @return 删除最后一个元素
     * @author RunLin
     * @description
     * @date 2020/8/31 4:13 下午
     */
    public E removeLast() {
        return remove(size - 1);
    }


    /**
     * @param
     * @return 如果在数组中存在某个元素那么就删除这个元素
     * @author RunLin
     * @description
     * @date 2020/8/31 4:17 下午
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array : size = %d , capacity =  %d \n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }


}
