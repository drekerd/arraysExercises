package ex06_checkSpecificValueIndex;

public class CheckSpecificValueIndex {

    public int checkSpecificValueIndex(int number){

        int arrayWithValues[] = {1,5,6,9,2,4};
        int position = 0;


        for(int i = 0; i < arrayWithValues.length;i++){
            if(arrayWithValues[i] == number){
                position = i;
            }
        }
        return position;
    }
}
