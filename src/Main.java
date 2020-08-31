import array.Array;

/**
 * @ClassName : Main
 * @Description :
 * @Author : RunLin
 * @Date: 2020-08-31 11:03
 */
public class Main {

    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0 ; i < 10; i++){
//            arr.addLast(i);
            arr.addFirst(i);
        }
        System.out.println(arr);
    }
}
