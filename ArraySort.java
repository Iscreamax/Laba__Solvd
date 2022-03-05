package com.company;

public class ArraySort {
      public static void main(String[] args) {
          int[] array = new int[10];
        //Создаём массив из 10 целочисленных значений
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i]+ " ");
        }
        //Сортировка пузырьком
          int[] array1 = array;
        boolean change = false;
        int temp = 0;
        while (!change) {
            change=true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array[i] > array1[i + 1]) {
                    temp = array1[i];
                    array1[i] = array[i + 1];
                    array1[i + 1] = temp;
                change = false;
                }

            }

        }
          System.out.println(" ");
          System.out.println(" Сортировка пузырьком ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+ " ");
        }
        //Сортировка вставками
    int[] array2 = array;
          for (int i = 1; i < array2.length; i++) {
              int current = array2[i];
              int j = i-1;
              while(j>=0&&current<array2[j]){
                  array2[j+1]=array2[j];
                  j--;
              }
              array2[j+1]=current;
          }
          System.out.println(" ");
          System.out.println(" Сортировка вставками ");
          for (int i = 0; i < array2.length; i++) {
              System.out.print(array2[i]+ " ");
          }
          //Сортировка выбором
          int[]array3 = array;
          for (int i = 0; i < array3.length ; i++) {
              int min = array3[i];
              int minId= i;
              for (int j = i+1; j <array3.length ; j++) {
                  if(array3[j]<min){
                      min = array3[j];
                      minId=j;
                  }
              }
              int temp1 = array3[i];
              array3[i]= min;
              array3[minId]=temp1;
          }
          System.out.println(" ");
          System.out.println(" Сортировка выбором ");
          for (int i = 0; i < array3.length; i++) {
              System.out.print(array3[i]+ " ");
    }
}
}
