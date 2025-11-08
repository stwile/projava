package projava;

import java.util.List;
import java.util.stream.IntStream;

public class StreamSample2 {
    public static void main(String[] args) {
        var data = List.of("yamamoto", "kis", "sugiura");

        var result = data
                .stream()
                .filter(s -> s.length() >= 5)
                .count();

        var names = List.of("yamamoto", "kis", "sugiyama");

        var strarray = new String[]{"test", "hello", "world"};

        var nums = new int[]{2, 5, 3};

        System.out.println(IntStream.of(nums).mapToObj(n -> "*".repeat(n)).toList());
    }
}
