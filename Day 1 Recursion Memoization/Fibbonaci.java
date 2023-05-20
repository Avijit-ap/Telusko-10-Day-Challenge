import javax.naming.spi.DirStateFactory.Result;

class Fibbonaci {
    public static void main(String[] args) {
        int pos = 8;
        int result = itt_fib(pos);
        System.out.println(result);
    }

    public static int fib(int pos) {
        //Recursive Method
        if (pos == 0) {
            return 0;
        }
        if (pos == 1 || pos == 2) {
            return 1;
        }
        return fib(pos - 1) + fib(pos - 2);
        }

    public static int itt_fib(int pos) {
        // ittrative method
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