package projava;

public class ForeachArraySample {
    public static void main(String[] args) {
        var numbers = new int[]{2, 3, 5, 7};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
