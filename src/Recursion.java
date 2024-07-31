class Recursion {
    public static int sum(int k) {
        // Base case
        if (k <= 0) {
            return 0;
        } else {
            
            return k + sum(k - 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        int result = Recursion.sum(10);
        System.out.println(result); 
    }
}
