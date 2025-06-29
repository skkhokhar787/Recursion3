public class TotalPaths {
    public static int countPaths (int i, int j, int n, int m) {
        // Base cases:
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Move Downwards
        int downPaths = countPaths(i + 1, j, n, m);

        // Move Right
        int rightPaths = countPaths(i, j + 1, n, m);

        // return the total paths
        return downPaths + rightPaths;
    }

    public static void main (String [] args) {
        int n = 3, m = 3;
        // Fn call
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println("Total paths from (0,0) to (" + (n-1) + "," + (m-1) + ") is: " + totalPaths);
    }
}
