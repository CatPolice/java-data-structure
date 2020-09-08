package queue;

/**
 * @ClassName : RLLinkedListQueue
 * @Description :
 * @Author : RunLin
 * @Date: 2020-09-08 09:47
 */
public class RLLinkedListQueue<E> implements RLQueueInterface<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }


        @Override
        public String toString() {
            return e.toString();
        }
    }

    //头节点
    private Node head;
    //尾节点
    private Node tail;
    private int size;

    public RLLinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 入队列操作（链表队列）
     * @date 2020/9/8 11:30 上午
     */
    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 出队列操作
     * @date 2020/9/8 11:30 上午
     */
    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空，不能进行出队列操作");
        }
        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return retNode.e;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 查看列表头节点元素
     * @date 2020/9/8 11:31 上午
     */
    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空，不能进行查看队列操作");
        }
        return head.e;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 获取链表长度
     * @date 2020/9/8 11:31 上午
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 查看列表是否为空
     * @date 2020/9/8 11:31 上午
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");
        Node cur = head;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL tail");
        return res.toString();
    }


    public static void main(String[] args) {
        RLLinkedListQueue<Integer> queue = new RLLinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }

}
