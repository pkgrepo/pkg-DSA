package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _12_subsq_print_first_match {
    public static void main(String[] args){
        //Input
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1));
        int target = 3;

        //Print the first subsequence which sum = target
        System.out.println("Print only first matching target subsequence.");
        List<Integer> new_list = new ArrayList<>();
        int index = 0;
        int sum = 0;
        subsFirstSumRecursion(index, list, new_list, sum, target);
    }

    private static boolean subsFirstSumRecursion(int index, List<Integer> list, List<Integer> newList, int sum, int target) {
        if(index == list.size()){
            // sum = newList.stream().mapToInt(Integer::intValue).sum();
            if(sum == target){
                System.out.println(newList);
                return true;
            }
            return false;
        }
        newList.add(list.get(index));
        sum += list.get(index);
        if( subsFirstSumRecursion(index + 1, list, newList, sum, target)){
            return true;
        }

        newList.remove(newList.get(newList.size() - 1));
        sum -= list.get(index);
        if( subsFirstSumRecursion(index+1, list, newList, sum, target)){
            return true;
        }

        return false;
    }
}
