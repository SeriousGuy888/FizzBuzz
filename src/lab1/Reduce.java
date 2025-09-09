package lab1;

public class Reduce {
    public static void main(String[] args) {
        int steps = 0;

        int curr_num = 1000;
        while (curr_num != 0) {
            if(curr_num % 2 == 0) {
                curr_num /= 2;
            } else {
                curr_num -= 1;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
