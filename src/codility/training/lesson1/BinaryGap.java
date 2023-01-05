public class BinaryGap {

    public static void main(String[] args) {
        int N = 1041;
        System.out.println(solution(N));
    }

    static int solution(int N) {
        int longestGap = 0;

        char[] binarySequenceOfChars = Integer.toBinaryString(N).toCharArray();

        int gapCount = 0;

        for (int i = 0; i < binarySequenceOfChars.length; i++) {
            if (binarySequenceOfChars[i] == '0') {
                gapCount++;
            } else {
                longestGap = Math.max(longestGap, gapCount);
                gapCount = 0;
            }
        }

        return longestGap;
    }
}
