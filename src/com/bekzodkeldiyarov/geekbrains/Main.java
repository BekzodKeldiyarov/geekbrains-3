package com.bekzodkeldiyarov.geekbrains;

public class Main {

    public static void main(String[] args) {
//          -----------------------------------------------------------------------
//        int[] firstTask = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        showArray(firstTask);
//        inverseNumbers(firstTask);
//        showArray(firstTask);
//          -----------------------------------------------------------------------
//        int[] secondTask = new int[100];
//        fillArray(secondTask);
//        showArray(secondTask);
//          -----------------------------------------------------------------------
//        int[] thirdTask = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        showArray(thirdTask);
//        multiplyToTwo(thirdTask);
//        showArray(thirdTask);
//          -----------------------------------------------------------------------
//        int[][] fourthTask = new int[9][9];
//        showArray(fillDiagonal(fourthTask));
//          -----------------------------------------------------------------------
//        int[] fifthTask = createArray(5, 7);
//        showArray(fifthTask);
//          -----------------------------------------------------------------------
//        int[] sixthTask = {1, 32, 41, 22, 3432, 91, 0, -2};
//        System.out.println(findMin(sixthTask));
//          -----------------------------------------------------------------------
//        int[] seventhTask = {1, 1, 1, 2, 1};
//        System.out.println("The " + (findEqualizeItem(seventhTask) + 1) + "th element of array");
//          -----------------------------------------------------------------------
//        int[] eighthTask = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        showArray(eighthTask);
//        // to right
//        showArray(displaceArray(eighthTask, 5));
//        // to left
//        showArray(displaceArray(eighthTask, -1));
    }

    public static void inverseNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            } else {
                System.out.println("This number is not equal to 0 or 1");
            }
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void multiplyToTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[][] fillDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }

        }
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    public static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] displaceArray(int[] array, int n) {
        if (n > 0) {
            int counter = 0;
            while (counter != n) {
                counter++;
                int temp = array[array.length - 1];
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                    if (i == 1) {
                        array[0] = temp;
                    }
                }
            }
        } else if (n < 0) {
            int counter = 0;
            while (counter != n) {
                counter--;
                int temp = array[0];
                for (int i = 1; i < array.length; i++) {
                    array[i - 1] = array[i];
                    if (i == array.length - 1) {
                        array[array.length - 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static int findEqualizeItem(int[] array) {
        int temp = -1;
        for (int i = 0; i < array.length; i++) {
            int sumBefore = 0;
            int sumAfter = 0;
            for (int j = i; j >= 0; j--) {
                sumBefore = sumBefore + array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                sumAfter = sumAfter + array[j];
            }
            if (sumAfter == sumBefore) {
                temp = i;
            }
        }

        return temp;
    }

    //testtest

}
