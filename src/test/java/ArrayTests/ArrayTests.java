package ArrayTests;

import ex02_sumArray.SumArray;
import ex03_grid.Grid;
import ex04_average.AverageCalc;
import ex05_checkSpecificValue.CheckSpecificValue;
import ex06_checkSpecificValueIndex.CheckSpecificValueIndex;
import ex07_removeElement.RemoveElement;
import ex_01.ArraysEx;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTests {


    @Test
    public void testSortingArray_returnTrue() {
        ArraysEx list = new ArraysEx();

        int newList[] = list.sortInts();

        String stringList = "";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                stringList = stringList.concat(Integer.toString(newList[i]));
            } else {
                stringList = stringList.concat(",").concat(Integer.toString(newList[i]));
            }
        }
        System.out.println("Sorting Int Array; " + stringList);
        Assert.assertEquals("2,4,5,7,10", stringList);

    }

    @Test
    public void testSortingStringArray_returnTrue() {
        ArraysEx list = new ArraysEx();

        String newList[] = list.sortString();

        String stringList = "";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                stringList = stringList.concat(newList[i]);
            } else {
                stringList = stringList.concat(",").concat(newList[i]);
            }
        }
        System.out.println("Sorting String Array; " + stringList);
        Assert.assertEquals("a,c,d,j,x", stringList);

    }

    @Test
    public void testArraySum_Return22() {
        SumArray sum = new SumArray();

        Assert.assertEquals(22, sum.sumArray());
    }

    @Test
    public void testArrayGrid() {
        Grid grid = new Grid();
        String finalResult = grid.grid();
        String expectedResult =
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n" +
                        "- - - - - - - - - -\n";

        System.out.println(expectedResult);
        Assert.assertEquals(expectedResult,finalResult);

    }

    @Test
    public void calculateAverage(){

        AverageCalc avg = new AverageCalc();
        System.out.println(avg.averageCalc());
        Assert.assertEquals(9.8,avg.averageCalc(),1);
    }

    @Test
    public void checkSepcificValue(){
        CheckSpecificValue value = new CheckSpecificValue();
        Assert.assertEquals(true, value.checkSpecificValue(4));
    }

    @Test
    public void checkSepcificValueIndex(){
        CheckSpecificValueIndex value = new CheckSpecificValueIndex();
        Assert.assertEquals(5, value.checkSpecificValueIndex(4));
        Assert.assertEquals(2, value.checkSpecificValueIndex(6));
    }

    @Test
    public void removeSpecificValue(){
        RemoveElement value = new RemoveElement();
        int arryToSend[] = {1,5,6,9,2,4};
        String expectedString = "[1, 5, 6, 9, 2]";
        String newString = value.removeSpecificValue(4,arryToSend);
        Assert.assertEquals(expectedString,newString);
    }



}
