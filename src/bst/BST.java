package bst;

/**
 * @ClassName : BST
 * @Description :
 * @Author : RunLin
 * @Date: 2020-09-09 17:30
 */
public class BST<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left;
        public Node right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;
    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
    * @author RunLin
    * @param
    * @description 向二分搜索树中添加元素 e
    * @date 2020/9/10 2:30 下午
    * @return
    */
    public void add(E e){
//        if (root == null){
//            root = new Node(e);
//            size++;
//        }else {
//            add(root,e);
//        }

        root = add(root,e);

    }



    /**
    * @author RunLin
    * @param
    * @description 向以node为根的二分搜索树中添加元素E，递归算法(返回插入新节点后二分搜索树的根)
    * @date 2020/9/10 2:23 下午
    * @return
    */
    private Node add(Node node, E e){
//        if(e.equals(node.e)){
//            return;
//        }else if(e.compareTo(node.e) < 0 && node.left == null){
//            node.left = new Node(e);
//            size++;
//            return;
//        }else if(e.compareTo(node.e) > 0 && node.right == null){
//            node.right = new Node(e);
//            size++;
//            return;
//        }
//
//        if (e.compareTo(node.e) < 0){
//            add(node.left , e);
//        }else { //e.compareTo(node.e) > 0)
//            add(node.right,e);
//        }
//    }

        if (node == null){
            size ++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0){
           node.left = add(node.left,e);
        }else if (e.compareTo(node.e) > 0){
            node.right = add(node.right,e);
        }
        return node;
    }


    /**
    * @author RunLin
    * @param
    * @description 查看二分搜索树中是否包含某个元素
    * @date 2020/9/10 4:37 下午
    * @return
    */
    public boolean contains(E e){
        return contains(root,e);
    }

    /**
    * @author RunLin
    * @param
    * @description 以node为根节点的二分搜索树中是否包含某个元素e
    * @date 2020/9/10 4:37 下午
    * @return
    */
    private boolean contains(Node node,E e){
        if (node == null){
            return false;
        }
        if (e.compareTo(node.e) == 0){
            return true;
        }else if (e.compareTo(node.e) < 0){
            return contains(node.left,e);
        }else {
            return contains(node.right,e);
        }
    }

    /**
    * @author RunLin
    * @param
    * @description  二分搜索树的前序遍历
    * @date 2020/9/10 4:46 下午
    * @return
    */
    public void preOrder(){
        preOrder(root);
    }

    /**
    * @author RunLin
    * @param
    * @description 前序遍历以node为根的二分搜索树，递归遍历
    * @date 2020/9/10 4:47 下午
    * @return
    */
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }


    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5,3,6,8,4,2};
        for (int num : nums){
            bst.add(num);
        }
        bst.preOrder();
    }

}
