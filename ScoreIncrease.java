public class ScoreIncrease {
    public static void main(String[] args) {

        int[] array = {85,92,78,88,95};
        int[] addScore = {5};

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < addScore.length; j++) {
                if(array[i] + addScore[j] == 92) {
                    System.out.println(array[i] + " " + addScore[j]);
                }
            }
        }

    }
}