package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_subsequences {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2));
//        int[] arr = {3,1,2};
        System.out.println("Finding Subsequences of the array: "+ list+" are: ");

        int len = list.size();
        List<Integer> new_list = new ArrayList<>(len);
        findSubsequences(0, list, new_list, len);
    }

    private static void findSubsequences(int index, List<Integer> list, List<Integer> new_list, int len) {
        if(index >= len){
            System.out.println(new_list);
            return;
        }
        new_list.add(list.get(index));
        findSubsequences(index+1, list, new_list, len);
        new_list.remove(new_list.size() -1);
        findSubsequences(index+1, list, new_list, len);
    }
}
