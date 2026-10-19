package recursion;

public class _6_factorial {
    public static void main(String[] args){
        System.out.println("Factorial using Recursion");

        int number = 6;
        System.out.println("Factorial of "+number);

        int fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }
        System.out.println("Linear Way: "+fact);


        //Recurside Way
        int factRecur = factoRecursive(number);
        System.out.println("Recursive way "+factRecur);
    }

    private static int factoRecursive(int number) {
        if(number == 1){
            return 1;
        }
        return number * factoRecursive(number -1);
    }

}
