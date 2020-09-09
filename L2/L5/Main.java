package L5;

public class Main {

    public static void main(String[] args) {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Without Multithreading: " + (System.currentTimeMillis() - a));

        a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread T1 = new Thread(() -> {
            calculation(arr1);
        });

        Thread T2 = new Thread(() -> {
            calculation(arr2);
        });

        T1.start();
        T2.start();

        while (T1.isAlive() || T2.isAlive()) {
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println("With Multithreading: " + (System.currentTimeMillis() - a));
    }

    private static void calculation(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
