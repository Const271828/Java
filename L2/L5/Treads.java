package L5;

public class Treads {

    public static void main(String[] args) {
        ArraySet arr0 = new ArraySet();
        ArraySet arr1 = new ArraySet();
        ArraySet arr2 = new ArraySet();

        /*============== One Tread =============*/
        long a = System.currentTimeMillis();
        arr0.start();
        System.out.println(System.currentTimeMillis() - a);

        /*============== Two Treads =============*/

        a = System.currentTimeMillis();
        
        System.arraycopy(arr0.arr, 0, arr1.arr, 0, arr0.h);
        System.arraycopy(arr0.arr, arr0.h, arr2.arr, 0, arr0.h);

        arr1.start();
        arr2.start();

        System.arraycopy(arr1.arr, 0, arr0.arr, 0, arr0.h);
        System.arraycopy(arr2.arr, 0, arr0.arr, arr0.h, arr0.h);

        System.out.println(System.currentTimeMillis() - a);
    }
}
