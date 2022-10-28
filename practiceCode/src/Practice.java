import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));

    }

    static int[] solution(int[] statues) {
            Arrays.sort(statues);

        int result = 0;

        for (int i = 0; i < statues.length; i++) {

            int diff = statues[i] - statues[i+1];

            if (diff != 1) result++;
        }


        return statues;
        }


// [2,3,6,8]

}
