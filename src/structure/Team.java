package structure;

import members.Employee;

import java.util.LinkedList;

public class Team {
    /*
    LinkedList<Backend> a = new LinkedList<>();
    LinkedList<Frontend> b = new LinkedList<>();
    LinkedList<UIUX> c = new LinkedList<>();
    */
    LinkedList<Employee> a = new LinkedList<>();
    LinkedList<Team> d = new LinkedList<>();
    Employee dev1 = null;

    public Team() { }
/*
    public Team(Backend a) {
        setBackend(a);
    }
    public Team(Frontend b) {
        setFrontend(b);
    }
    public Team(UIUX c) {
        setUIUX(c);
    }
 */
    public void add(Employee a) {
        setEmployee(a);
    }
    public void add(Team d) {
        setTeam(d);
    }

    public void reset() {
        a.clear();
        d.clear();
    }

    public void setDev2(Employee dev) {
        setEmployee(dev);
    }

    private void setEmployee(Employee a) {
        this.a.add(a);
    }
    public LinkedList<Employee> getEmployee() {
        return a;
    }

    private void setTeam(Team temp) { this.d.add(temp); }
    public LinkedList<Team> getTeam() { return d; }


    /*
    public void setBackend(Backend a) {
        this.a.add(a);
    }
    public void setFrontend(Frontend b) {
        this.b.add(b);
    }
    public void setUIUX(UIUX c) {
        this.c.add(c);
    }


    public LinkedList<Backend> getBackend() {
        return a;
    }
    public LinkedList<Frontend> getFrontend() {
        return b;
    }
    public LinkedList<UIUX> getUIUX() {
        return c;
    }

     */

}
