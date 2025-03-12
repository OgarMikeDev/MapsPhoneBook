import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private long phoneNumber;

    public Student(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && phoneNumber == student.phoneNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber);
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
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
