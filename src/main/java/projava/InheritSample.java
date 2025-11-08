package projava;

import java.util.List;

public class InheritSample {
    static class User extends Object {
        String name;

        User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class Student extends User {
        int score;

        Student(String name, int score) {
            super(name);
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }

    static class Teacher extends User {
        String subject;

        Teacher(String name, String subject) {
            super(name);
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
    }

    public static void main(String[] args) {
        List<User> people = List.of(
                new Student("kis", 90),
                new Teacher("hosoya", "Math")
        );

        for (User p : people) {
            System.out.printf("こんにちは%sさん%n", p.getName());
        }
    }
}
