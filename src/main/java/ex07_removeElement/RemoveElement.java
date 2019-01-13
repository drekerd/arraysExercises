package ex07_removeElement;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {

    public String removeSpecificValue(int number, int sentArray[]){

        int arrayWithValues[] = sentArray;
        String finalArray="";

        for(int i = 0; i < arrayWithValues.length-1;i++){
            if(arrayWithValues[i] == number){
                if(number == arrayWithValues[arrayWithValues.length-1]){
                    Arrays.copyOf(arrayWithValues, arrayWithValues.length-2);
                }
                else{
                    for(int j = i; j < arrayWithValues.length-1;j++){
                       arrayWithValues[j]=arrayWithValues[j+1];
                    }
                }
               }
        }
        arrayWithValues = Arrays.copyOf(arrayWithValues, arrayWithValues.length-1);
        System.out.println(Arrays.toString(arrayWithValues));

        finalArray = Arrays.toString(arrayWithValues);
        return finalArray;
    }
}
