package projava;

public class InstanceMethodSample {
    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (this.englishScore + this.mathScore) / 2;
        }
    }

    static void main() {
        var kis = new Student("Kis", 60, 80);
        var a = kis.average();
        System.out.printf("平均点は%d点です%n", a);
    }

    static int average(Student student) {
        return (student.englishScore() + student.mathScore()) / 2;
    }
}
