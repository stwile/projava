package projava;

import java.util.stream.IntStream;

public class MethodRefSample {
    public static void main(String[] args) {
        IntStream.range(0, 3)
                .map(MethodRefSample::twice)
                .forEach(System.out::println);
    }

    // メソッド参照を使って配列の各要素を表示する
    static int twice(int x) {
        return x * 2;
    }
}
