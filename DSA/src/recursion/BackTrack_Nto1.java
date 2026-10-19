package recursion;

public class BackTrack_Nto1 {
    public static void main(String[] args){
        System.out.println("Backtrack: Print N to 1." +
                "Generally we should start pointer from N and then use MINUS(-) operator. " +
                "But it's not allowed. You can not use MINUS operator");

        // Recursive Method
        int number = 10;
        int index = 1;
        printBackTrackRecursive(index, number);
    }

    private static void printBackTrackRecursive(int index, int number) {
        if(index > number){
            return;
        }
        printBackTrackRecursive(index + 1, number);
        System.out.println(index);
    }
}
