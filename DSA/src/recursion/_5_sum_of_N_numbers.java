package recursion;

public class _5_sum_of_N_numbers {

    public static void main(String[] args){
        System.out.println("Print sum of N numbers.");

        System.out.println("Linear Way");
        int number = 5;

        int sum = 0;
        for(int i = number; i >= 0; i--){
            sum = sum + i;
        }
        System.out.println("Sum: "+ sum);


        System.out.println("Recursive way: Functional Way");
        int recurSum = sumNumbersRecursive(number);
        System.out.println("Recursive Sum: "+ recurSum);
    }

    private static int sumNumbersRecursive(int number) {
        if(number == 0){
            return 0;
        }
        return number + sumNumbersRecursive(number - 1);
    }
}
