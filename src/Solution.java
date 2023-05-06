class Solution {
    public static int[] solution(int numero, int[] A) {
        int[] contadores = new int[numero];
        int contadorMaximo = 0;
        int ultimo = 0;
        for (int index = 0; index < A.length; index++) {
            int contadorAxuiliar = A[index];
            if (contadorAxuiliar <= numero) {
                contadores[contadorAxuiliar-1] = Math.max(contadores[contadorAxuiliar-1], ultimo);
                contadores[contadorAxuiliar-1]++;
                contadorMaximo = Math.max(contadorMaximo, contadores[contadorAxuiliar-1]);
            } else {
                ultimo = contadorMaximo;

            }

        }
        for (int index = 0; index < numero; index++) {
            contadores[index] = Math.max(contadores[index], ultimo);

        }
        return contadores;
    }
}