public class Week1Day2StakOverFlowError {

    public static void infiniteRecursion() {
        System.out.println("infiniteRecursion");
        infiniteRecursion(); // This method calls itself without a base case
    }

    public static void main(String[] args) {
        infiniteRecursion(); // Start the infinite recursion
    }
}
