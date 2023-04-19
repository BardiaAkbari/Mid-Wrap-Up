import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long answer = 0;
        for(int i = 1; i < arr.length; i += 2){
            answer += arr[i];
        }
        return answer;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - i - 1];
        }
        return reverse;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        return null;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        int n = 20;
        List<List<String>> lsd = new ArrayList<List<String>>();
        List<String> x = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            x.addAll(Arrays.asList(names[i]).subList(0, n));
        }
        lsd.add(x);
        return lsd;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> ans = new ArrayList<Integer>();
        double x ,y;
        int counter = 0;
        for ( int i = 1 ; i <= n;i++){
            for (int j = 0; j < i; j++) {

                x = i / j;
                if (Math.floor(x) == x) {
                    counter++;
                }
            }
            if(counter==2){
                y = n / i;
                if(Math.floor(y) ==y){
                    int z = (int)y;
                    ans.add(z);
                }
            }
        }
        return ans;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> answer = new L
    }
}
