package queue;

public interface RLQueueInterface<E> {

    //入队列
    void enqueue(E e);
    //出队列
    E dequeue();
    //获取队列首个元素
    E getFront();
    //获取队列大小
    int getSize();
    //判断队列是否为空
    boolean isEmpty();

}
