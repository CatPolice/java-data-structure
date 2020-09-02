package queue;

import array.RLArray;

/**
 * @ClassName : RLQueue
 * @Description :
 * @Author : RunLin
 * @Date: 2020-09-02 13:18
 */
public class RLQueue<E> implements RLQueueInterface<E> {

    private RLArray<E> array;

    public RLQueue(int capacity) {
        array = new RLArray<>(capacity);
    }

    public RLQueue() {
        array = new RLArray<>();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    /**
     * @param
     * @return 入队列
     * @author RunLin
     * @description
     * @date 2020/9/2 1:22 下午
     */
    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * @param
     * @return 出队列
     * @author RunLin
     * @description
     * @date 2020/9/2 1:22 下午
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**
     * @param
     * @return 获取队列首个元素
     * @author RunLin
     * @description
     * @date 2020/9/2 1:22 下午
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    /**
     * @param
     * @return 获取队列大小
     * @author RunLin
     * @description
     * @date 2020/9/2 1:23 下午
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * @param
     * @return 判断队列是否为空
     * @author RunLin
     * @description
     * @date 2020/9/2 1:23 下午
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(i);
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
