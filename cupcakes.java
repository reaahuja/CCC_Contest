import java.util.*;

public class cupcakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int regular = input.nextInt();
        int small = input.nextInt();

        int cupcakes = (regular*8) + (small*3);

        int leftover = cupcakes - 28;

        System.out.println(leftover);

    }
}
