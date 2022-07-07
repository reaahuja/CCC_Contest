import java.util.*;

public class goodGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numSame = input.nextInt();
        input.nextLine();
        String names = "";
        if (numSame != 0){
            names = input.nextLine();
        }
        names = names + " ";
        String[] sameNames = new String[names.length()];

        String name = "";
        int counter = 0;

        for (int i = 0; i < names.length(); i++){
            if (names.charAt(i) == ' '){
                sameNames[counter] = name;
                name = "";
                counter++;
            }else{
                name += names.charAt(i);
            }
        }

        int numDiff = input.nextInt();
        input.nextLine();
        String names2 = "";
        if (numDiff != 0){
            names2 = input.nextLine();
        }
        names2 = names2 + " ";
        String[] diffNames = new String[names2.length()];


        String name2 = "";
        int counter2 = 0;

        for (int i = 0; i < names2.length(); i++){
            if (names2.charAt(i) == ' '){
                diffNames[counter2] = name2;
                name2 = "";
                counter2++;
            }else{
                name2 += names2.charAt(i);
            }
        }


        int groupNumbers = input.nextInt();
        String[][] groupNames = new String[groupNumbers][3];
        int groupCounter = 0;
        String theName = "";



        for (int i = 0; i < groupNames.length; i++){
            String nameValue = input.nextLine();
            for (int j = 0; j < groupNames[0].length; i++){
                for (int k = 0; k < nameValue.length(); k++){
                    if (nameValue.charAt(k) == ' '){
                        groupNames[i][j] = theName;
                        theName = "";
                        groupCounter++;
                    }else{
                        theName += nameValue.charAt(i);
                    }
                }
            }
        }

        int violation = 0;

        for (int i = 0; i < groupNames.length; i++){
            for (int j = 0; j < groupNames[0].length; j++){
                if (sameNames[i].equals(groupNames[i][j])){
                    for (int k = 0; k < groupNames[0].length; k++){
                        if(!sameNames[i + 1].equals(groupNames[i][k])){
                            violation++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < groupNames.length; i++){
            for (int j = 0; j < groupNames[0].length; j++){
                if (diffNames[i].equals(groupNames[i][j])){
                    for (int k = 0; k < groupNames[0].length; k++){
                        if(diffNames[i + 1].equals(groupNames[i][k])){
                            violation++;
                        }
                    }
                }
            }
        }

        System.out.println(violation);







    }
}

