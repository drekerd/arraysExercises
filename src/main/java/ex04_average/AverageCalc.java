package ex04_average;

public class AverageCalc {

    public double averageCalc(){
        int avg[] = {2,5,8,9,10,25};
        double average,total=0.0;

        for(int a :avg){
            total = total +a;
        }
        average = total/avg.length;
        return average;
    }
}
