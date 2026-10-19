package recursion;

public class _0_NtimesNames {

    private static void printRecurNames(int index, int totalNumber){
        if(index > totalNumber){
            return;
        }
        System.out.println("Printing "+index+" Prashant");
        printRecurNames(index + 1, totalNumber);
    }


    public static void main(String[] args) {
        int n = 5;

        // Linear Way
        System.out.println("Using for loop, The Linear way");
        for(int i = 0; i < n ; i++){
            System.out.println("Prashant");
        }


        // Using recursive way
        int index = 1;
        printRecurNames(index, n);
    }
}