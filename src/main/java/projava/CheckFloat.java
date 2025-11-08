package projava;

public class CheckFloat {
    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO
    }

    static boolean check(String data) {
        if (data == null || data.isEmpty()) return false;

        var state = FloatState.START;
        for (char ch : data.toCharArray()) {
            switch (state) {
                case START -> {
                    if (ch == '0') {
                        state = FloatState.ZERO;
                        continue;
                    }
                    if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                        continue;
                    }
                    return false;
                }
                case ZERO -> {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                        continue;
                    }
                    return false;
                }
                case INT -> {
                    if (ch >= '0' && ch <= '9') {
                        // remain INT
                        continue;
                    }
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                        continue;
                    }
                    return false;
                }
                case FRAC_START, FRAC -> {
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.FRAC;
                        continue;
                    }
                    return false;
                }
            }
        }

        return switch (state) {
            case ZERO, INT, FRAC -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println(check(""));     // false
        System.out.println(check("012"));  // false
        System.out.println(check(".12"));  // false
        System.out.println(check("12."));  // false
        System.out.println(check("1.2.3"));// false
        System.out.println(check("1..3")); // false
        System.out.println(check("0"));    // true
        System.out.println(check("12"));   // true
        System.out.println(check("12.3")); // true
        System.out.println(check("0.3"));  // true
        System.out.println(check("12.30"));// true
    }
}