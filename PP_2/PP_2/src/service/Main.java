package service;

public class Main {
    public static void main(String[] args) {
        //Subjects
        ListSubject sj_1 = new ListSubject();
        sj_1.add("Probability",4);
        sj_1.add("C#", 2);
        sj_1.add("OOP", 5);

        ListSubject sj_2 = new ListSubject();
        sj_2.add("Probability", 3);
        sj_2.add("English", 2);
        sj_2.add("OOP", 4);

        ListSubject sj_3 = new ListSubject();
        sj_3.add("English", 4);
        sj_3.add("C#", 5);
        sj_3.add("OOP", 1);

        ListSubject sj_4 = new ListSubject();
        sj_4.add("Probability", 3);
        sj_4.add("C#", 3);
        sj_4.add("English", 3);

        //Students
        ListStudent st_1 = new ListStudent();
        st_1.add("Volodymyr", sj_1);
        st_1.add("Artem", sj_2);

        ListStudent st_2 = new ListStudent();
        st_2.add("Julia", sj_3);
        st_2.add("Ann", sj_4);

        //Info
        ListCalendar in_1 = new ListCalendar();
        in_1.add("Probability","21.04.22");
        in_1.add("English","21.04.22");
        in_1.add("OOP","22.04.22");
        in_1.add("C#","22.04.22");
        in_1.add("Probability","23.04.22");
        in_1.add("C#","23.04.22");

        ListCalendar in_2 = new ListCalendar();
        in_2.add("OOP","21.04.22");
        in_2.add("English","21.04.22");
        in_2.add("C#","22.04.22");
        in_2.add("English","22.04.22");
        in_2.add("Probability","23.04.22");
        in_2.add("OOP","23.04.22");

        //Groups
        ListGroup gp_1 = new ListGroup();
        gp_1.add("IT-21", st_1, in_1);
        gp_1.add("IT-22", st_2, in_2);

        //University
        ListUniversity un_1 = new ListUniversity();
        un_1.add("LPNU", gp_1);

        un_1.print();

        un_1.addSubject("DataScience", 1);
        un_1.addInfo("DataScience", 1, "21.09.22");

        un_1.print();

        un_1.sort();
        un_1.search("DataScience");


        un_1.printRate();

        un_1.deleteRate("Volodymyr", "DataScience");
        un_1.changeRate("Artem", "DataScience", 4);
        un_1.changeRate("Ann", "C#", 5);


        un_1.printRate();

        un_1.printSubject("OOP");
        un_1.printStud("Ann");
    }
}
