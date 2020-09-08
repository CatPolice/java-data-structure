package linked;

/**
 * @ClassName : LinkenList
 * @Description :
 * @Author : RunLin
 * @Date: 2020-09-03 09:17
 */
public class RLLinkenList<E> {
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

    //虚拟头节点
    private Node dummyHead;
    private int size;

    public RLLinkenList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 获取链表大小
     * @date 2020/9/3 9:26 上午
     */
    public int getSize() {
        return size;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 判断链表是否为空
     * @date 2020/9/3 9:27 上午
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 向链表头添加元素
     * @date 2020/9/3 10:48 上午
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 向链表尾添加元素
     * @date 2020/9/3 10:48 上午
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 向链表添加元素
     * @date 2020/9/3 10:49 上午
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引大小不合法");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            //将下一次节点指向内容赋给当前游标
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 查找列表中某一个节点信息
     * @date 2020/9/3 2:07 下午
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引大小不合法");
        }

        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.e;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 获取链表第一个元素
     * @date 2020/9/3 2:08 下午
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 获取链表最后一个元素
     * @date 2020/9/3 2:08 下午
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 更新列表中某个位置的元素
     * @date 2020/9/3 2:14 下午
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引大小不合法");
        }
        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.e = e;
    }

    /**
     * @param
     * @return
     * @author RunLin
     * @description 查找链表中是否存在某个元素
     * @date 2020/9/3 2:14 下午
     */
    public boolean contains(E e) {
        Node current = dummyHead.next;
        while (current != null) {
            if (current.e.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    /**
    * @author RunLin
    * @param
    * @description 删除链表的某个节点
    * @date 2020/9/3 5:03 下午
    * @return
    */
    public E remove(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引大小不合法");
        }

        Node prev = dummyHead;
        for (int i = 0; i<index;i++){
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    /**
    * @author RunLin
    * @param
    * @description 删除链表中第一个元素
    * @date 2020/9/3 5:19 下午
    * @return
    */
    public E removeFirst(){
        return remove(0);
    }
    /**
    * @author RunLin
    * @param
    * @description 删除链表中最后一个元素
    * @date 2020/9/3 5:20 下午
    * @return
    */
    public E removeLast(){
        return remove(size - 1);
    }




    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node current = dummyHead.next;
        while (current != null){
            res.append(current + "->");
            current = current.next;
        }
        res.append("NULL");

        return res.toString();
    }

}
