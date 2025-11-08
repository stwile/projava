package projava;

import java.util.ArrayList;

public class StreamSample1 {
    public static void main(String[] args) {
        var data = java.util.List.of("yamamoto", "kis", "sugiura");

        var result = new ArrayList<String>();
        for (String s : data) {
            if (s.length() >= 5) {
                result.add(s);
            }
        }
        System.out.println(result);
    }
}
