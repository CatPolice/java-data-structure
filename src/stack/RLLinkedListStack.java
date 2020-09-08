package stack;

import linked.RLLinkenList;

/**
 * @ClassName : RLLinkedListStack
 * @Description :
 * @Author : RunLin
 * @Date: 2020-09-08 09:22
 */
public class RLLinkedListStack<E>  implements RLStackInterface<E>{
    private RLLinkenList<E> list;
    public RLLinkedListStack(){
        list = new RLLinkenList<>();
    }


    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        //链表头相当于栈顶元素
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(" Linked List Stack: top ");
        res.append(list);
        return res.toString();
    }

}
