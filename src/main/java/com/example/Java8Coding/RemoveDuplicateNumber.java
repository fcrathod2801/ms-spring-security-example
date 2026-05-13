package com.example.Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumber {
    public static void main(String [] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
    //remove duplicate number from array
       /* List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3);
        list.stream().distinct().forEach(System.out::println);
        //in another way
        Arrays.stream(arr).distinct().forEach(System.out::println);
        //in another way
        Arrays.stream(arr).boxed().distinct().forEach(System.out::println);
        //in another way
        Arrays.stream(arr).boxed().collect(Collectors.toSet()).forEach(System.out::println);

        */
        //without using stream
        int[] arr1 = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr1[index++] = arr[i];
            }
        }
       //printing the array without duplicate number
        for (int i = 0; i < index; i++) {
            System.out.println(arr1[i]);
        }

    }


}
