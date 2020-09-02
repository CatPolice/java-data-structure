package stack;

import array.RLArray;

/**
 * @ClassName : ArrayStack
 * @Description :
 * @Author : RunLin
 * @Date: 2020-09-02 09:50
 */
public class ArrayStack<E> implements RLStackInterface<E> {

    private RLArray<E> array;

    public ArrayStack(int capacity) {
        array = new RLArray<>(capacity);
    }

    public ArrayStack() {
        array = new RLArray<>();
    }


    public int getCapacity() {
        return array.getCapacity();
    }

    /**
     * @param
     * @return 获取栈大小
     * @author RunLin
     * @description
     * @date 2020/9/2 9:59 上午
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * @param
     * @return 查看栈是否为空
     * @author RunLin
     * @description
     * @date 2020/9/2 9:59 上午
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * @param
     * @return 向栈中添加元素
     * @author RunLin
     * @description
     * @date 2020/9/2 9:59 上午
     */
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    /**
     * @param
     * @return 删除栈顶元素
     * @author RunLin
     * @description
     * @date 2020/9/2 10:00 上午
     */
    @Override
    public E pop() {
        return array.removeLast();
    }

    /**
     * @param
     * @return 查看栈顶元素
     * @author RunLin
     * @description
     * @date 2020/9/2 10:00 上午
     */
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(i);
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
