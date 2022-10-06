package Task2;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Group> groups= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public University(String name, List<Group> groups){
        this.groups = groups;
        this.name = name;
    }

    public void print(){
        for (int i = 0; i < groups.size(); i++) {
            groups.get(i).print();
        }
    }
}
