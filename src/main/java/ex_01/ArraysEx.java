package ex_01;

import java.util.Arrays;

public class ArraysEx {


    public int[] sortInts(){

        int sorter;
        int list[]={10,5,4,2,7};

        for(int i = 0; i < list.length;i++){

            for(int j = i; j < list.length;j++){
                if (list[j]<list[i]){
                    sorter = list[i];
                    list[i]=list[j];
                    list[j]=sorter;
                }

            }

        }


        return list;


    }


    public String[] sortString(){

        String list[] = {"c","d","a","j","x"};
        Arrays.sort(list);

        return list;
    }

}
