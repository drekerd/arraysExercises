package ex05_checkSpecificValue;

public class CheckSpecificValue {

    public boolean checkSpecificValue(int number){

        int arrayWithValues[] = {1,5,6,9,2,4};
        boolean checkValue=false;


        for(int num : arrayWithValues){
            if (num == number){
                checkValue = true;
            }
        }
        return checkValue;
    }
}
