public class Main {

    public static void main(String[] args) {

        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> ans = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int n : input) {
                if (n % i == 0) {
                    count++;
                }
            }
            ans.put(i, count);
        }

        System.out.println(result);
    }
}
