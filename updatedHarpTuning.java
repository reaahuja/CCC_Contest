import java.util.*;

public class updatedHarpTuning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tuning = input.nextLine();

        String word = "";

        for (int i = 0; i < tuning.length() - 1; i++){

            if (tuning.charAt(i) == '+' || tuning.charAt(i) == '-'){

                if (tuning.charAt(i) == '+'){
                    int counter = 0;
                    String tuningCut = tuning.substring(i + 1);
                    boolean character = false;
                    while (character == false){
                        for (int j = 0; j < tuningCut.length() - 1; j++){
                            try{
                                int number = Integer.parseInt(tuningCut.substring(j, j +1));
                                counter++;
                            }catch (NumberFormatException e){
                                character = true;
                            }
                        }
                    }

                    System.out.println(word + " " + "tighten" + " " + tuning.substring(i + 1, i + counter + 1));
                    i = i + counter - 1;
                }else{
                    System.out.println(word + " " + "loosen" + " " + tuning.charAt(i + 1));
                }
                word = "";
                i++;
            }else{
                word += tuning.charAt(i);
            }

        }

    }
}
