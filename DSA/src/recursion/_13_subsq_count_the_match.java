package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _13_subsq_count_the_match {
    public static void main(String[] args){
        //Input
        int target = 2;
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1));

        System.out.println("Count the matching subsequence.");
        int index = 0;
        int sum = 0;
        int matched_count = countOfMatchedSubsequence(index, list, sum, target);
        System.out.println("Total matched subsequent count: "+matched_count);
    }

    private static int countOfMatchedSubsequence(int index, List<Integer> list, int sum, int target) {
        if(index == list.size()){
            if(sum == target){
                return 1;
            }
            return 0;
        }
        sum += list.get(index);
        int l = countOfMatchedSubsequence(index+1, list, sum, target);

        sum -= list.get(index);
        int r = countOfMatchedSubsequence(index+1, list, sum, target);

        return l+r;
    }
}
