public class Testing {
    public static void main(String[] args) {
        int[] intArray =new int[156];
        int max = intArray[0];
        int min = intArray[0];
        for(int i = 0; i < intArray.length; i++) {
            if (max < i); {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Min:  " +min);
        System.out.println("Max:  " +max);
    }

}
