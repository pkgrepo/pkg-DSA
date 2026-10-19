package recursion;

public class NtimesName {
    NtimesName(){
    }
//    Using for loop. Linear way
//    public void nTimesName(int n){
//        for(int i = 0; i < n ; i++){
//            System.out.println("Prashant");
//        }
//    }


    // Using recursion
    public void nTimesName(int n){
        int index = 1;
        printRecurNames(index, n);
    }

    public void printRecurNames(int index, int totalNumber){
        if(index <= totalNumber){
            System.out.println("Prashant");
        }
        printRecurNames(index + 1, totalNumber);
    }
}
