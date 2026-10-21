package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11_subsq_sum {
    public static void main(String[] args){
        int target = 2;
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1));
        System.out.println("Subsequence: find out a subsequence where sum is: " + target);

        int index = 0;
        int sum =0;
        List<Integer> new_list = new ArrayList<>();
        susbsequenceSum(index, list, new_list, sum, target);
    }

    private static void susbsequenceSum(int index, List<Integer> list, List<Integer> newList, int sum, int target) {
        if( index == list.size()){
            // sum = newList.stream().mapToInt(Integer::intValue).sum();
            if(sum == target){
                System.out.println(newList);
            }
            return;
        }
        newList.add(list.get(index));
        sum += list.get(index);
        susbsequenceSum(index+1, list, newList, sum, target);

        newList.remove(newList.size() -1);
        sum -= list.get(index);
        susbsequenceSum(index+1, list, newList, sum, target);
    }
}
