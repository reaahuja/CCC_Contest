import java.util.*;

public class rating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int players = input.nextInt();

        int[] scores = new int[players*2];
        int[] playerStars = new int[scores.length];

        for (int i = 0; i < scores.length; i++){
            int value = input.nextInt();
            scores[i] = value;
        }

        for (int i = 0; i < scores.length - 1; i++){
            int stars = (scores[i]*5) - (scores[i+1]*3);
            playerStars[i] = stars;
        }

        int counter = 0;

        for (int i = 0; i < players; i++){
            if (playerStars[i] > 40){
                counter++;
            }
        }

        if (counter == players){
            System.out.println(counter + "+");
        }else{
            System.out.println(counter);
        }
    }
}
