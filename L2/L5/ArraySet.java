package L5;

class ArraySet extends Thread    {// Наша очередь из сотрудников, наследник класса Thread
    final int size = 10000000;
    final int h = size / 2;
    public float[] arr = new float[size];

    ArraySet() {// Конструктор, аргумент- массив имен сотрудников
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = 1;
        }
    }



    @Override
    public void run() { // Этот метод будет вызван при старте потока
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }
}
