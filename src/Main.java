import array.RLArray;

/**
 * @ClassName : Main
 * @Description :
 * @Author : RunLin
 * @Date: 2020-08-31 11:03
 */
public class Main {

    public static void main(String[] args) {
        RLArray<Integer> arr = new RLArray<>();
        for(int i = 0 ; i < 10 ; i ++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        for(int i = 0 ; i < 4 ; i ++){
            arr.removeFirst();
            System.out.println(arr);
        }
    }
}
