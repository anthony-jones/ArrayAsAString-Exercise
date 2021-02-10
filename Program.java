
public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));

//        OUTPUT:
//        050
//        307
    }

    public static String arrayAsString(int[][] array){
        StringBuilder resultString = new StringBuilder();
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                resultString.append(array[row][column]);
            }
            resultString.append("\n");
        }
        return resultString.toString();
    }
}
