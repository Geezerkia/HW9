public class ArrayValueCalculator {
    static int totalSum;
    static int i;
    static int y;

    static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        arraySizeValidator(array);
        totalSum = 0;
        for (i = 0; i < array.length; i++) {
            for (y = 0; y < array[i].length; y++) {
                try {
                    totalSum = totalSum + Integer.parseInt(array[i][y]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("The array element " + "'" + array[i][y] + "'"
                            + " at array cell [" + i + "][" + y + "]" + " can't be parsed!");
                }
            }
        }
        return totalSum;
    }

    static void arraySizeValidator(String[][] array) throws ArraySizeException {
        if (array.length != 4) {
            throw new ArraySizeException("The number of array rows must be 4!");
        } else if (array[0].length != 4) {
            throw new ArraySizeException("The number of array columns must be 4!");
        }
    }
}
