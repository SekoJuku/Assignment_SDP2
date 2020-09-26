package data;

import members.Employee;
import java.util.LinkedList;

public class Data {
    LinkedList<Employee> a1 = new LinkedList<>();

    LinkedList<Employee> a = new LinkedList<>();

    public Data() {
        a1.add(new Employee("Seko",2,"B"));
        a1.add(new Employee("z1z",50,"B"));
        a1.add(new Employee("Ibra",100,"B"));

        a1.add(new Employee("Adilkhan",3,"F"));
        a1.add(new Employee("Ulan",5,"F"));
        a1.add(new Employee("Berik",10,"F"));

        a1.add(new Employee("Rakhat",1,"U"));
        a1.add(new Employee("Ayan",4,"U"));
        a1.add(new Employee("Akan",9,"U"));

        a = a1;
    }


    public void deleteE(int index) {
        a.remove(index);
    }


    public LinkedList<Employee> getE() {
        return a;
    }
}
