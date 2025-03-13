import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String email;
    private long phoneNumber;
    private static HashMap<String, Student> mapStudents = new HashMap<>();

    public Student(String name, int age, String email, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        mapStudents.put(email, this);
    }

    public static void removeStudent(long phoneNumberForRemoveStudent) {
        Iterator<Student> studentsIterator = mapStudents.values().iterator();
        while (studentsIterator.hasNext()) {
            Student currentStudent = studentsIterator.next();
            if (currentStudent.getPhoneNumber() == phoneNumberForRemoveStudent) {
                studentsIterator.remove();
            }
        }
    }

    public static void printMapStudents() {
        for (Map.Entry<String, Student> currentEmailAndStudent : mapStudents.entrySet()) {
            String currentEmail = currentEmailAndStudent.getKey();
            Student currentStudent = currentEmailAndStudent.getValue();
            System.out.println(currentEmail + " - " + currentStudent);
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && phoneNumber == student.phoneNumber && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phoneNumber);
    }

    @Override
    public int compareTo(Student currentStudent) {
        return this.getPhoneNumber().compareTo(currentStudent.getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
