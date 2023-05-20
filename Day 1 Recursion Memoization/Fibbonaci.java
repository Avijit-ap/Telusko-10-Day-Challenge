import java.util.Map;
import java.util.HashMap;
import javax.naming.spi.DirStateFactory.Result;

class Fibbonaci {
    public static void main(String[] args) {
        int pos = 10;
        //recursive function
        int result = fib(pos);
        //itterative approach
        //int result = itt_fib(pos);
        System.out.println("the value is : " + result);

    }

    // Memoization ->to remember the values
    private static Map<Integer, Integer> cache = new HashMap<>();
 
    // Recursive function 
    public static int fib(int pos) {
       
        if (pos == 0) {
            return 0;
        }
        if (pos == 1 || pos == 2) {
            return 1;
        }

        // checking if the value exist in hashMap
        if (cache.containsKey(pos)) {
            return cache.get(pos);
        }
        int result = fib(pos - 1) + fib(pos - 2);
        // putting the the result into cache for future retrival
        cache.put(pos, result);
        return result;
    }
    
    // ittrative function
    public static int itt_fib(int pos) {

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= pos; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }
}