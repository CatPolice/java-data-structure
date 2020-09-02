import array.RLArray;
import queue.RLLoopQueue;
import queue.RLQueue;
import stack.ArrayStack;

/**
 * @ClassName : Main
 * @Description :
 * @Author : RunLin
 * @Date: 2020-08-31 11:03
 */
public class Main {

    public static void main(String[] args) {
        //数组测试
//        RLArray<Integer> arr = new RLArray<>();
//        for(int i = 0 ; i < 10 ; i ++) {
//            arr.addLast(i);
//        }
//        System.out.println(arr);
//
//        arr.add(1, 100);
//        System.out.println(arr);
//
//        arr.addFirst(-1);
//        System.out.println(arr);
//
//        arr.remove(2);
//        System.out.println(arr);
//
//        arr.removeElement(4);
//        System.out.println(arr);
//
//        arr.removeFirst();
//        System.out.println(arr);
//
//        for(int i = 0 ; i < 4 ; i ++){
//            arr.removeFirst();
//            System.out.println(arr);
//        }


        //栈测试
//        ArrayStack<Integer> stack = new ArrayStack<>();
//        for (int i = 0; i < 5; i++){
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//        System.out.println(stack);


        //队列测试
//        RLQueue<Integer> queue = new RLQueue<>();
//        for (int i = 0; i < 10 ; i++){
//            queue.enqueue(i);
//            System.out.println(queue);
//
//            if (i % 3 == 0){
//                queue.dequeue();
//                System.out.println(queue);
//            }
//        }



        RLLoopQueue<Integer> queue = new RLLoopQueue<>();
        for (int i = 0; i < 5 ; i++){
            queue.enqueue(i);
        }
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);






    }
}
