package ex09_InsertIntoPosition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntoPosition {

    public String removeSpecificValue(int number, int position, int sentArray[]) {


        int newArray[] = new int[sentArray.length+1];

        String finalArray;


        for (int i = newArray.length-1; i > position ; i--) {

            newArray[i]=sentArray[i-1];

        }
        for (int i = position-1;i==0;i--){
            newArray[i]=sentArray[i];
        }
        newArray[position]=number;
        finalArray = Arrays.toString(newArray);
        return finalArray;

    }
}
