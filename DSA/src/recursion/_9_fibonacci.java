package recursion;

public class _9_fibonacci {
    public static void main(String[] args){
        int nth = 6;

        //Linear way
        int f1 = 0;
        int f2 = 1;
        int fibonacci = 0;
        for(int i=0; i<nth; i++){
            fibonacci = f1+f2;
            f1 = f2;
            f2 = fibonacci;
        }
        System.out.println("Fibonacci series, "+nth+" number is: "+ fibonacci);


        //Recursive way
        int nth_new = 6;
        System.out.println("In fibonacci series, "+nth_new+" number is "+getfibonacci(nth_new));
    }

    private static int getfibonacci(int nthNew) {
        if(nthNew <= 1) {
            return nthNew;
        }
        return getfibonacci(nthNew-1) + getfibonacci(nthNew-2);
    }
}
