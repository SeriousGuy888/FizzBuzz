package lab1;

public class Multiples {
    public static void main(String[] args) {

        // How many numbers are there that are multiples of 3 or multiples of 5?
        int count = 0;

        for(int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println("There are " + count + " multiples of 3 or 5 below 1000.");
    }
}
