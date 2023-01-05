public class FrogJump {
    
    public static void main(String[] args) {
        System.out.println(solution(1, 5, 2));
        System.out.println(solution(10, 85, 30));
        System.out.println(solution(3, 999111321, 7));
    }

    static int solution(int X, int Y, int D) {
        int distance = Y - X;
        int jumps = distance / D;
        if ((distance%D) > 0)
            jumps++;
        return jumps;
    }
}
