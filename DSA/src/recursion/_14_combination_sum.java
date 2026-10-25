package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _14_combination_sum {
    public static void main(String[] args){
        int target = 7;
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,6,7));

        System.out.println("Find all the combinations from the list "+list+" whose sum = "+target);

        //Recursive approach
        int index =0;
        List<Integer> newList = new ArrayList<>();
        findCombination(index, list, newList, target);

    }

    private static void findCombination(int index, List<Integer> list, List<Integer> newList, int target) {
        if(index == list.size()){
            if(target == 0){
                System.out.println(newList);
            }
            return;
        }
        int current_element = list.get(index);
        if(current_element <= target){
            newList.add(current_element);
            findCombination(index,list, newList, target - current_element);
            newList.remove(newList.get(newList.size() - 1));
        }
        findCombination(index+1, list, newList, target);
    }
}
