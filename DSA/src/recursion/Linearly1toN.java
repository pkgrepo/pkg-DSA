package recursion;

public class Linearly1toN {


    public static void main(String[] args){
        int number = 10;
        print1toN(number);
    }

    private static void print1toN(int number) {
        // Linear Way
        System.out.println("Linear Way");
        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }

        // Recursive Way
        System.out.println("Recursive Way");
        int index = 1;
        printRecursive(index, number);
    }

    private static void printRecursive(int index, int number) {
        if(index > number){
            return;
        }
        System.out.println(index);
        printRecursive(index +1, number);
    }
}
