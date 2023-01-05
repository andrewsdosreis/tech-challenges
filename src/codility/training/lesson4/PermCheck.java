package lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public static void main(String[] args) {
        int[] A = { 1, 1 };

        System.out.println(solution(A));
    }

    static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            maxValue = Math.max(maxValue, A[i]);
            set.add(A[i]);
        }

        int result;

        if (A.length > set.size())
            result = 0;
        else
            result = (maxValue == set.size()) ? 1 : 0;

        return result;
    }
}
