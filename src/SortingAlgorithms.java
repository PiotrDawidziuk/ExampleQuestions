public class SortingAlgorithms {


    static int[] theArray = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};



    public static void main(String[] args) {
        for (int i =0; i < theArray.length;i++){
            System.out.print(i+" = "+theArray[i]+", ");
        }
        System.out.println();
        linearSearchForValue(50);

    }


    public static String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexsWithValue = "";
        for(int i = 0; i < theArray.length; i++){
            if(theArray[i] == value){
                valueInArray = true;
                indexsWithValue+= i + " ";
            }
        }
        if(!valueInArray){
            indexsWithValue = "None";
        }
        System.out.print("The Value "+value+" was Found in the Following: " + indexsWithValue);
        System.out.println();
        return indexsWithValue;
    }
}
