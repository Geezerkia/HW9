public class Demo {

    public static void main(String[] args) throws ArraySizeException, ArrayDataException {

        String[][] myArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };

        System.out.println("The total sum of all array elements is: "
                + ArrayValueCalculator.doCalc(myArray));
    }
}

