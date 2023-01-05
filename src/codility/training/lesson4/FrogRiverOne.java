package lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {
        int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
        int X = 5;
        System.out.println(solution(X, A));

        int[] B = { 1 };
        int Z = 1;
        System.out.println(solution(Z, B));
    }

    static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X)
                set.add(A[i]);
            if (set.size() == X)
                return i;
        }
        return -1;
    }
}