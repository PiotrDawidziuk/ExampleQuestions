public class SortingAlgorithms {


    static int[] theArray = new int[]{12231, 21230, 31, 4, 250, 603, 704, 8, 5590, 100};



    public static void main(String[] args) {
        for (int i =0; i < theArray.length;i++){
            System.out.print(i+" = "+theArray[i]+", ");
        }
        System.out.println();
       // linearSearchForValue(50);

        bubbleSort(theArray);

        for (int i =0; i < theArray.length;i++){
            System.out.print(i+" = "+theArray[i]+", ");
        }
    }

    public static void bubbleSort(int array[]){
        for (int i = array.length -1; i >1; i--){
            for (int j = 0; j < i; j++){
                if (array[j] > array[j+1]) {
                    swapValues(j,j+1);

                }
            }
        }
    }

    public static void swapValues(int indexOne, int indexTwo){

        int temp = theArray[indexOne];

        theArray[indexOne] =  theArray[indexTwo];

        theArray[indexTwo] = temp;

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
