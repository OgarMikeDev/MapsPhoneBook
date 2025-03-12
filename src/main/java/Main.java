import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Артём", 18, 89676400940l);
        Student secondStudent = new Student("Борис", 23, 89676400941l);
        Student thirdStudent = new Student("Артём", 18, 89676400940l);

        TreeMap<Long, Student> hashMapStudents = new TreeMap<>();
        hashMapStudents.put(89676400940l, firstStudent);
        hashMapStudents.put(89676400941l, secondStudent);
        hashMapStudents.put(89676400940l, thirdStudent);

        for (Map.Entry<Long, Student> student : hashMapStudents.entrySet()) {
            Long currentPhoneNumber = student.getKey();
            Student currentStudent = student.getValue();
            System.out.println(currentPhoneNumber + " - " + currentStudent);
        }

        Student findStudent = hashMapStudents.get(89676400941l);
        System.out.println("Искомый студент: " + findStudent);
    }
}
