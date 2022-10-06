package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subject> stud_std= new ArrayList<>();
        stud_std.add(new Subject( "Math", 0));
        stud_std.add(new Subject( "Java", 0));
        stud_std.add(new Subject( "Eng", 0));

        List<Student> st_11 = new ArrayList<>();
        st_11.add(new Student("John", stud_std));
        st_11.add(new Student("Mary", stud_std));


        Info info= new Info();
        info.add(new Subject( "Math","12.04.22" ));
        info.add(new Subject( "Java", "16.04.22"));
        info.add(new Subject( "Eng", "09.04.22"));

        List<Group> group = new ArrayList<>();

        group.add(new Group("IT-21",info,st_11));

        University lpnu = new University("LPNU", group);

        lpnu.print();




    }
}
