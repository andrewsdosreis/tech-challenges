
import java.util.Arrays;

public class PermMissingElement {

    public static void main(String[] args) {
        int[] A = { 2, 3, 5, 4 };
        System.out.println(solution(A));

        int[] B = {};
        System.out.println(solution(B));

        int[] C = { 2 };
        System.out.println(solution(C));

    }

    static int solution(int[] A) {
        int missingElement = 0;

        Arrays.sort(A);

        int firstElement = 1;
        int lastElement = A.length + 1;

        if (A.length == 0)
            return firstElement;

        if (A[0] != firstElement)
            return firstElement;

        int previousElement = 0;
        for (int i : A) {
            if ((i - previousElement) > 1) {
                missingElement = i - 1;
                break;
            }
            previousElement = i;
        }

        if (missingElement == 0)
            missingElement = lastElement;

        return missingElement;
    }
}
