package ex02_sumArray;

public class SumArray {

    public int sumArray(){

        int sum[] = {1,5,6,10};
        int total=0;

        for(int s:sum){
            total=total+s;
        }
        return total;
    }
}
