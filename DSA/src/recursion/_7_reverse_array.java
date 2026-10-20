package recursion;


import java.util.Arrays;

public class _7_reverse_array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Reverse this array: " + Arrays.toString(arr));

        // Linear Way: Using another variable
        int[] newArray = new int[arr.length];
        int new_array_index = 0;
        for(int i = arr.length-1; i >= 0; i--){
            newArray[new_array_index] = arr[i];
            new_array_index++;
        }
        System.out.println("Linear Way, Using another variable: "+ Arrays.toString(newArray));



        //Without using another variable
        int index = 0;
        int lastIndex = arr.length-1;
        arrayReverseRecur(index, lastIndex, arr);
        System.out.println("Recursive reverse: "+Arrays.toString(arr));


        //Different Approach in Recursive
        int[] array_new = {1,2,3,4,5,6,7};
        System.out.println("\n\nReverse this array: " + Arrays.toString(array_new));
        int idx = 0;
        int len = array_new.length;
        reverseRecursive(idx, array_new, len);
        System.out.println("Another recursive array: "+ Arrays.toString(array_new));
    }

    private static void reverseRecursive(int idx, int[] array_n, int len) {
        if( idx >= len/2){
            return;
        }
        int temp = array_n[idx];
        array_n[idx] = array_n[len - idx - 1];
        array_n[len - idx - 1] = temp;
        reverseRecursive(idx + 1, array_n, len);
    }

    private static void arrayReverseRecur(int index, int lastIndex, int[] arr) {
        if(index > lastIndex){
            return;
        }
        int temp = arr[index];
        arr[index] =  arr[lastIndex];
        arr[lastIndex] = temp;
        arrayReverseRecur(index + 1, lastIndex -1, arr);
    }
}
