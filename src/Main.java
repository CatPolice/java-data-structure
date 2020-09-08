import linked.RLLinkenList;
import queue.RLQueueInterface;
import stack.RLLinkedListStack;

import java.util.Random;

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


//        //测试循环队列
//        RLLoopQueue<Integer> queue = new RLLoopQueue<>();
//        for (int i = 0; i < 5 ; i++){
//            queue.enqueue(i);
//        }
//        System.out.println(queue);
//
//        queue.dequeue();
//        System.out.println(queue);
//        queue.dequeue();
//        System.out.println(queue);
//        queue.dequeue();
//        System.out.println(queue);


//        int count = 100000;
//        RLQueue<Integer> rlQueue = new RLQueue<>();
//        double time1 = testQueue(rlQueue, count);
//        System.out.println("RLQueue , time : " + time1 + " s");
//
//        RLLoopQueue<Integer> rlLoopQueue = new RLLoopQueue<>();
//        double time2 = testQueue(rlLoopQueue, count);
//        System.out.println("RLLoopQueue , time : " + time2 + " s");


//        RLLinkenList<Integer> linkenList = new RLLinkenList<>();
//        for (int i = 0; i<5;i++){
//            linkenList.addFirst(i);
//            System.out.println(linkenList);
//        }
//        linkenList.add(2,666);
//        System.out.println(linkenList);


        RLLinkedListStack<Integer> stack = new RLLinkedListStack<>();
        for (int i = 0; i<5 ; i++){
            stack.push(i);
            System.out.println(stack);
        }

    }


    public static double testQueue(RLQueueInterface<Integer> q, int count) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < count; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
