package lesson2;

public class OddOcurrencesInArray {

    public static void main(String[] args) {
        int[] input = { 9, 3, 9, 3, 9, 7, 9, 20, 21, 20, 21 };
        System.out.println(solution(input));
    }

    static int solution(int[] A) {
        int unpairedValue = 0;

        for (int i : A) {
            unpairedValue = unpairedValue ^ i;
        }

        return unpairedValue;
    }
}
