package projava;

import java.util.List;

public class InterfaceSample {
    interface Named {
        String name();

        default String greeting() {
            return "こんにちは%sさん".formatted(name());
        }
    }

    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named {}

    public static void main(String[] args) {
        var people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"));
        for (Named p: people) {
            System.out.println(p.greeting());
        }
    }
}
