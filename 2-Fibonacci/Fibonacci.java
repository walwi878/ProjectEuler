import java.util.*;
public class Fibonacci {

    public static void main(String[] args){
        
        ArrayList<Integer> fib = new ArrayList<Integer>();
        int count = 0;
        int max = 4000000;

        fib.add(1);
        fib.add(2);

        // Create ArrayList with Fibonacci numbers up to 1 term beyond max
        for (int i = 2; fib.get(i-1)< max; i++){  
                fib.add(fib.get(i-1) + fib.get(i-2));  
            }
        System.out.println(Arrays.toString(fib.toArray()));

        // Count even numbers up to max
        for (int val : fib){
            if (val%2==0 && val <= max){
                count += val;
            }
        }
        System.out.println(count);
    }
}