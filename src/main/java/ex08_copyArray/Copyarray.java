package ex08_copyArray;

import java.util.Arrays;

public class Copyarray {

    public String removeSpecificValue(int sentArray[]){

        int arrayWithValues[] = sentArray;
        int newArray[] = new int[6];
        String finalArray="";

        for(int i=0;i<arrayWithValues.length;i++){
            newArray[i] = arrayWithValues[i];
        }

        finalArray = Arrays.toString(newArray);
        return finalArray;
    }
}
