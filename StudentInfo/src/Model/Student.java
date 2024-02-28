
package Model;

public class Student implements Comparable<Student> {
    private String name;
    private float mark;
    private String classes;

    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public float getMark() {
        return mark;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public int compareTo(Student other) {
        return Float.compare(this.mark, other.mark);
    }
}
