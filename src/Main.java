public class Main {
    public static void main(String[] args) {
        int[] matriz = {1, 1, 4, 6, 1, 5, 5};
        int numero = 5;
        Solution solution = new Solution();
        int[] contadores = Solution.solution(numero, matriz);
        for (int index = 0; index < contadores.length; index++) {
            System.out.print(contadores[index] + " ");
        }
    }
}