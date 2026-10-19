package recursion;

public class BackTrack_1toN {
    public static void main(String[] args){
        System.out.println("Backtrack: Print 1 to N." +
                "Generally we should start pointer from 1 and then use PLUS operator. " +
                "But it's not allowed. You can not use PLUS operator");

        // Recursive Method
        int number = 10;
        int index = 10; // you can not use 1 here
        printBackTrackRecursive(index, number);
    }

    private static void printBackTrackRecursive(int index, int number) {
        if(index < 0){
            return;
        }
        printBackTrackRecursive(index - 1, number);
        System.out.println(index);
    }
}
