package ex03_grid;

public class Grid {

    public String grid(){

            String []gridList ={"-","-","-","-","-","-","-","-","-","-"};
            String finalResult="";

            for(int i = 0;i<gridList.length;i++){
                for(int j = 0;j<gridList.length;j++){
                    if(j==0){
                        finalResult = finalResult.concat(gridList[i]);
                    }
                    else{
                        finalResult = finalResult.concat(" ").concat(gridList[i]);
                    }

            }
                finalResult = finalResult.concat("\n");

        }

            return finalResult;
    }
}
