public class CallingGuest {
    public static int guestCall (int n) {
        // Base case :
        if (n <= 1) {
            return 1;
        }

        // Single
        int way1 = guestCall(n-1);

        // pair
        int way2 = (n-1) * guestCall(n-2);

        // Return total way

        return way1 + way2;
    }
    public static void main (String [] args) {
        int n = 4;
        int totalWay = guestCall(n);
        System.out.println(totalWay);
    }
}
