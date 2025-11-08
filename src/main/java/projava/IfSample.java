package projava;

public class IfSample {
    public static void main(String[] args) {
        var a = 3;

        switch (a) {
            case 1:
            case 2:
                System.out.println("one-two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
