package ru.geekbrains.level2.lesson2Home;

public class Array {

    public void  getArr (String[][] arr){
        boolean checkSize = true;
        if (arr.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (arr[i].length != 4){
                    checkSize = false;
                    break;
                }
            }
        } else checkSize = false;

        if (checkSize) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e){
                        throw new MyArrayDataException("Data exception is in ", i, j);
                    }
                }
            }
            System.out.println(sum);
        } else {
                throw new MyArraySizeException("Size is not correct");
            }


    }
}
