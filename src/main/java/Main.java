public class Main {
    public static void main(String[] args) {
        new Student("Mike", 24,
                "ogar.m.v@mail.ru", 89676400942l);

        new Student("Mike", 24,
                "ogar.m.v@mail.ru", 89676400942l);

        new Student("Nicolay", 25,
                "kuznechov.n.v@mail.ru", 89676400941l);
        Student.removeStudent(89676400941l);
        Student.printMapStudents();
    }
}
