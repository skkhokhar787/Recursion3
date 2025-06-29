public class PlaceTiles {
    public static int totalWays (int n, int m) {
        // Base case-1 :
        if (n == m) {
            return 2;
        }
        // Base case-2
        if (n < m) {
            return 1;
        }

        // vertical
        int vertPlace = totalWays(n-m, m);

        // horizontal
        int horPlace = totalWays(n-1,m);

        // Return total number of placement
        return vertPlace + horPlace;
    }
    public static void main (String [] args) {
        int n = 4, m = 2;
        int totalWays = totalWays(n, m);
        System.out.print(totalWays);
    }
}
