package Task2;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Info info = new Info();
    private String name;
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public void addStudent(String name, List<Subject> list){
        Student student = new Student(name, list);
        students.add(student);

    }

    public Group(String name, Info info, List<Student> students){
        this.name = name;
        this.info = info;
        this.students = students;
    }

    public void print(){
        System.out.println(name);
        info.print();
        for (int i = 0; i < students.size(); i++) {
            students.get(i).print();
        }


    }
}
