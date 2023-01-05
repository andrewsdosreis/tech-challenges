package lesson2;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] A = { 3, 8, 9, 7, 6 };
        int K = 3;
        System.out.println(Arrays.toString(solution(A, K)));

        int[] B = { 1, 0, 0, 0 };
        K = 5;
        System.out.println(Arrays.toString(solution(B, K)));
    }

    static int[] solution(int[] A, int K) {
        int[] shiftedArray = new int[A.length];
        int shiftedIndex = 0;
        for (int i = 0; i < A.length; i++) {
            shiftedIndex = i + K;
            while (shiftedIndex > (A.length - 1)) {
                shiftedIndex = shiftedIndex - A.length;
            }
            shiftedArray[shiftedIndex] = A[i];
        }

        return shiftedArray;
    }
}
