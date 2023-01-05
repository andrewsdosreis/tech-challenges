public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = { 3, 1, 2, 4, 3 };
        System.out.println(solution2(A));
    }

    static int solution(int[] A) {
        int minDiff = 0;

        int P = A.length;

        for (int i = 1; i < P; i++) {
            int lessThanP = 0;
            int greatThanP = 0;

            for (int x = 0; x < A.length; x++) {
                if (x < i) {
                    lessThanP += A[x];
                } else {
                    greatThanP += A[x];
                }
            }
            int diff = lessThanP - greatThanP;
            
            if (diff < 0)
                diff = diff * -1;

            if (i == 1)
                minDiff = diff;
            else
                minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    static int solution2(int[] A) {       
        int sumOfAllValues = 0;
        for (int number : A) {
            sumOfAllValues += number;
        }

        int minDiff = Integer.MAX_VALUE;
        int diff = 0;        
        int sumOfValuesLessThan = 0;

        for (int i = 0; i < A.length - 1; i++) {
            sumOfValuesLessThan += A[i];
            diff = sumOfAllValues - (sumOfValuesLessThan * 2);
            if (diff < 0)
                diff *= -1;
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

}