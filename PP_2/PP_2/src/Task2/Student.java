package Task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Subject> subjects = new ArrayList<>();

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void print(){
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(name+ " "+subjects.get(i).getString()+" "+ subjects.get(i).getNumber());
        }
    }

    public void add(String str, int number){
        Subject pair_2 = new Subject(str, number);
        subjects.add(pair_2);
    }

    public Student(String name, List<Subject> list){
        this.name = name;
        subjects = list;
    }
}
