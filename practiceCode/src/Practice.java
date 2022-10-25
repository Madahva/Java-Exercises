public class Practice {
    public static void main(String[] args) {

        int[] inputArray = {-22222223, 6, -2, -5, 7, 3};
        solution(inputArray);
    }

    public static int solution(int[] inputArray) {

        int actProduct = 0;
        int maxProduct = -1000;

        for (int i = 0; i < inputArray.length -1; i++) {

            actProduct = inputArray[i] * inputArray[i+1];

            if (maxProduct < actProduct) {
                maxProduct = actProduct;
            }
        }
        System.out.println(maxProduct);
        return maxProduct;
    }
}
