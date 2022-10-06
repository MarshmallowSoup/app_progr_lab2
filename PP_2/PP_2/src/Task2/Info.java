package Task2;

import java.util.ArrayList;
import java.util.List;

public class Info {
    List<Subject> info = new ArrayList<>();

    public List<Subject> getInfo() {
        return info;
    }

    public void setInfo(List<Subject> info) {
        this.info = info;
    }

    public void print(){
        for (int i = 0; i < info.size(); i++) {
            System.out.println(info.get(i).getString()+" "+ info.get(i).getNumber());
        }
    }

    public void add(String str, int number){
        Subject pair_2 = new Subject(str, number);
        info.add(pair_2);
    }

    public void add(Subject pair_2){
        info.add(pair_2);
    }
}
